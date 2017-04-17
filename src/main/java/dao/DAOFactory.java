package dao;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	private final UserDAO userDao = new SqlUserDAO();
	
	public static DAOFactory getInstance() {
		return instance;
	}
	
	public UserDAO getUserDao() {
		return userDao;
	}

}
