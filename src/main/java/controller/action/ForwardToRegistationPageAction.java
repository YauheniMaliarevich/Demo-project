package controller.action;

import controller.logic.SessionRequestContent;

public class ForwardToRegistationPageAction implements Action{
	private static final String PATH = "/pages/registration.jsp";
	@Override
	public String execute(SessionRequestContent content) {
		return PATH;
		
		
	}

}
