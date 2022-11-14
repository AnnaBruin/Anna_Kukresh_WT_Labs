package wt.server.command.impl;

import wt.server.command.Command;
import wt.server.command.exception.CommandException;
import wt.server.model.AuthType;
import wt.server.service.ServiceFactory;

public class DisconnectCommand implements Command {
    @Override
    public String execute(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
