package service;

public class ServiceFactory {
	private final static ServiceFactory instance = new ServiceFactory();
	
	private final UserService userService = new UserServiceImp();
	
	public static ServiceFactory getInstance() {
		return instance;
	}
	
	public UserService getUserService() {
		return userService;
	}

}
