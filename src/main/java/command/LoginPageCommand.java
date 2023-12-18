package command;

import exception.IncorrectDataException;
import exception.ServiceException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.pages.Page;

public class LoginPageCommand implements Command {
    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, IncorrectDataException {
        System.out.println("LOGIN PAGE");
        return new CommandResult(Page.LOGIN_PAGE.getPage(), false);
    }
}

