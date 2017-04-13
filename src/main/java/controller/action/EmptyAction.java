package controller.action;

import controller.logic.SessionRequestContent;

public class EmptyAction implements Action{
	@Override
	public String execute(SessionRequestContent content) {
		return "";
		
	}

}
