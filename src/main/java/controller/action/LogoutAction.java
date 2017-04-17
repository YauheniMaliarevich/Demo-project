package controller.action;

import controller.logic.SessionRequestContent;

public class LogoutAction implements Action{
	private static final String LOGINPAGE = "/pages/login.jsp";

	@Override
	public String execute(SessionRequestContent content) {
		content.killSession();
		return LOGINPAGE;
	}

}
