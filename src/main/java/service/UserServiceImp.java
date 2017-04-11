package service;

import dao.DAOFactory;
import dao.UserDAO;

public class UserServiceImp implements UserService{

	@Override
	public void login(String login, String password) {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		UserDAO userDao = daoObjectFactory.getUserDao();
		userDao.signin(login, password);
		
	}

	@Override
	public void logout() {
		throw new RuntimeException();
		
	}

	@Override
	public void registration(String login, String password) {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		UserDAO userDao = daoObjectFactory.getUserDao();
		userDao.reagistration(login, password);
		
	}

}
