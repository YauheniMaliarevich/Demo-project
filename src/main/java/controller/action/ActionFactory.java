package controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionFactory {
	
	public static Action getAction(HttpServletRequest request, HttpServletResponse responce)
	{
		Action currentAction = new EmptyAction();
		String action = request.getParameter("command");
		
		if(action == null || action.isEmpty()) {
			
		} else {
			ActionEnum currentEnum = ActionEnum.valueOf(action);
			currentAction = currentEnum.getAction();
		}
		return currentAction;
	}

}
