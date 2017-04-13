package controller.action;

import controller.logic.SessionRequestContent;
import service.ServiceFactory;
import service.UserService;

public class RegistrationAction implements Action{

	private static final String LOGIN = "login";
	private static final String PASSWORD = "password";
	private static final String PATH = "/pages/home.jsp";
	private static final String ERROR_MESSAGE = "";
	@Override
	public String execute(SessionRequestContent content) {
		String login = content.getParam(LOGIN);
		String password = content.getParam(PASSWORD);
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		userService.registration(login, password);
		return PATH;
		
	}

	

}
