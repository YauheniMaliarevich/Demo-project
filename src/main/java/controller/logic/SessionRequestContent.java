package controller.logic;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

public class SessionRequestContent {
	
	private static final String LOGIN = "login";
	private static final String PASSWORD = "password";
	private static final String MESSAGE = "message";
	
	private Map<String, String> requestAttr;
	private Map<String, String> responceAttr;
	private Map<String, String[]> requestParam;
	private Map<String, Object> sessionAttributes;
	
	HttpServletRequest request;
	public SessionRequestContent(HttpServletRequest request) {
		this.request = request;
		requestAttr = new HashMap<String, String>();
		
	}
	
	public void extractValues(HttpServletRequest request) {
		requestAttr.put("login", request.getParameter(LOGIN));
		requestAttr.put("password", request.getParameter(PASSWORD));
		requestAttr.put("message", request.getParameter(MESSAGE));
		
		
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
	public void addResponceAttr(String key, String value) {
		responceAttr.put(key, value);
	}
	public String getResponceAttr(String key) {
		if(responceAttr.containsKey(key)) {
			return responceAttr.get(key);
		}else {
			return null;
		}
	}
	public void setParam(String key, String value) {
		request.setAttribute(key, value);
	}
	

}
