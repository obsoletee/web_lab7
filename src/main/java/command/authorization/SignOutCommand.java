package command.authorization;

import command.Command;
import command.CommandResult;
import command.session.SessionAttribute;
import exception.IncorrectDataException;
import exception.ServiceException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.logging.log4j.LogManager;
import util.pages.Page;

import java.util.logging.Logger;

public class SignOutCommand implements Command {
    private static final Logger logger = (Logger) LogManager.getLogger(SignOutCommand.class.getName());

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, IncorrectDataException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute(SessionAttribute.NAME);
        logger.info("user was above: name:" + username);
        session.removeAttribute(SessionAttribute.NAME);
        return new CommandResult(Page.LOGIN_PAGE.getPage(), false);
    }
}


