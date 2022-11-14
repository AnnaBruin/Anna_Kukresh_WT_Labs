package wt.server.command;

import wt.server.command.exception.CommandException;

public interface Command {
    String execute(Object caller, String request) throws CommandException;
}
