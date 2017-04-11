package service;

public interface UserService {
	void login(String login, String password);
	void logout();
	void registration(String login, String password);

}
