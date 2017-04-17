package controller.action;

import controller.logic.SessionRequestContent;

public class ForwardToLoginPageAction implements Action{
	private final static String PATH = "/pages/login.jsp";

	@Override
	public String execute(SessionRequestContent content) {

		return PATH;
	}

}
