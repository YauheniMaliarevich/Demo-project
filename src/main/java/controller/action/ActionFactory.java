package controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Tools.Log;

public class ActionFactory {
	
	public static Action getAction(HttpServletRequest request, HttpServletResponse responce)
	{
		Action currentAction = new EmptyAction();
		String action = request.getParameter("command");
		Log.info("request command - " + action);
		if(action == null || action.isEmpty()) {
			
		} else {
			ActionEnum currentEnum = ActionEnum.valueOf(action.toUpperCase());
			currentAction = currentEnum.getAction();
		}
		Log.info("action class - " + action.getClass());
		return currentAction;
	}

}
