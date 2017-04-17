package dao;

public interface UserDAO {
	boolean signin(String name, String password);
	boolean reagistration(String name, String password);

}
