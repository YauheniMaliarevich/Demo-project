package controller.action;

import controller.logic.SessionRequestContent;

public interface Action {
	String execute(SessionRequestContent content);

}
