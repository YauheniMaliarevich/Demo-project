package service;

public interface UserService {
	boolean login(String login, String password);
	boolean logout();
	boolean registration(String login, String password);
	boolean comment(String name, String text);
	String getText();

}
