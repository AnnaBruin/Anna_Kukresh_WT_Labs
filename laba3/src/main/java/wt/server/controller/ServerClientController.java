package wt.server.controller;

import wt.server.command.CommandProvider;
import wt.server.command.exception.CommandException;
import wt.server.command.impl.DisconnectCommand;

import java.io.*;
import java.net.Socket;
import java.util.Objects;

public class ServerClientController extends Thread {
    private final Socket socket;
    private final ServerController serverController;

    private BufferedReader reader;
    private PrintWriter writer;

    public ServerClientController(Socket socket, ServerController serverController) {
        this.socket = socket;
        this.serverController = serverController;
    }

    @Override
    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        sendMessage("""
                Available commands:
                AUTH USER/MANAGER
                DISCONNECT
                VIEW
                CREATE (firstname) (lastname)
                EDIT (id) (firstname) (lastname)""");

        var running = true;
        do {
            try {
                var request = readMessage();
                if (request == null) {
                    break;
                }

                var command = CommandProvider.getInstance().getCommand(request);
                var response = command.execute(this, request);
                sendMessage(response);

                if (command instanceof DisconnectCommand) {
                    running = false;
                }
            } catch (CommandException e) {
                e.printStackTrace();
                sendMessage(e.getMessage());
            }
        } while (running);

        serverController.disconnect(this);
    }

    private String readMessage() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void sendMessage(String message) {
        writer.println(message);
        writer.flush();
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerClientController that = (ServerClientController) o;
        return socket.equals(that.socket) && serverController.equals(that.serverController);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socket, serverController);
    }
}
