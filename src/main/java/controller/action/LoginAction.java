package controller.action;

import controller.logic.SessionRequestContent;
import service.ServiceFactory;
import service.UserService;

public class LoginAction implements Action{
	private static final String LOGIN = "login";
	private static final String PASSWORD = "password";

	@Override
	public void execute(SessionRequestContent content) {
		String login = content.getParam(LOGIN);
		String password = content.getParam(PASSWORD);
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		userService.login(login, password);
		
	}

}
