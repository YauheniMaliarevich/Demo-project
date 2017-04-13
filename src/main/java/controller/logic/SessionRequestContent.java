package controller.logic;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

public class SessionRequestContent {
	
	private static final String LOGIN = "login";
	private static final String PASSWORD = "password";
	
	private Map<String, String> requestAttr;
	private Map<String, String> responceAttr;
	private Map<String, String[]> requestParam;
	private Map<String, Object> sessionAttributes;
	
	public SessionRequestContent(HttpServletRequest request) {
		requestAttr = new HashMap<String, String>();
		
	}
	
	public void extractValues(HttpServletRequest request) {
		 System.out.println(request.getParameter(LOGIN));
		 System.out.println(request.getParameter(PASSWORD));
		requestAttr.put("login", request.getParameter(LOGIN));
		requestAttr.put("password", request.getParameter(PASSWORD));
		
	}
	
	public void getRequestContent(String key) {
		String result = "";
		if(requestAttr.containsKey(key)) {
			result = requestAttr.get(key);
		}
	}
	
	public String getParam(String param) {
		String result = null;
		if(requestAttr.containsKey(param)) {
			result = requestAttr.get(param);
		}
		return result;
	}

}
