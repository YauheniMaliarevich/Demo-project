package controller.action;

import controller.logic.SessionRequestContent;
import service.ServiceFactory;
import service.UserService;

public class LoginAction implements Action{
	private static final String LOGIN = "login";
	private static final String PASSWORD = "password";
	
	private static final String HOMEPAGE = "/pages/home.jsp";
	private static final String ERRORPAGE = "/pages/error.jsp"; 

	@Override
	public String execute(SessionRequestContent content) {
		String page = null;
		String login = content.getParam(LOGIN);
		String password = content.getParam(PASSWORD);
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		if(userService.login(login, password)) {
			page = HOMEPAGE;
			content.setParam("userName", login);
		} else {
			page = ERRORPAGE;
			content.setParam("errorMessage", "you do not register");
		}
		return page;
		
	}

}
