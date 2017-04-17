package controller.action;

import controller.logic.SessionRequestContent;
import service.ServiceFactory;
import service.UserService;

public class CommentAction implements Action{

	private final static String MESSAGE = "message";
	private final static String LOGIN = "login";
	private final static String HOMEPAGE = "/pages/home.jsp";
	private final static String ERRORPAGE = "/pages/error.jsp";
	
	@Override
	public String execute(SessionRequestContent content) {
		String page = null;
		String text = content.getParam(MESSAGE);
		String login = content.getParam(LOGIN);
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		if(userService.comment(login, text)) {
			page = HOMEPAGE;
			content.setParam("userMessage", "You comment have add to the page");
			content.setParam("text", userService.getText());
		} else {
			page = ERRORPAGE;
			content.setParam("errorMessage", "Oops. Something going wrong!!!!!");
		}
		return page;
		
	}

}
