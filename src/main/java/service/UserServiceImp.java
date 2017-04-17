package service;

import dao.DAOFactory;
import dao.UserDAO;

public class UserServiceImp implements UserService{

	@Override
	public boolean login(String login, String password) {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		UserDAO userDao = daoObjectFactory.getUserDao();
		return userDao.signin(login, password);
		
	}

	@Override
	public boolean logout() {
		throw new RuntimeException();
		
	}

	@Override
	public boolean registration(String login, String password) {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		UserDAO userDao = daoObjectFactory.getUserDao();
		return userDao.reagistration(login, password);
		
	}

}
