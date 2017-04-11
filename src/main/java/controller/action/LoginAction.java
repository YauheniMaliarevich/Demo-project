package controller.action;

import controller.logic.SessionRequestContent;
import service.ServiceFactory;
import service.UserService;

public class LoginAction implements Action{
	private static final String LOGIN = "Login";
	private static final String PASSWORD = "Password";

	@Override
	public void execute(SessionRequestContent content) {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		userService.login(login, password);
		
	}

}
