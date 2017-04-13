package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SqlUserDAO implements UserDAO {

	@Override
	public void signin(String name, String password) {
		
		}

	@Override
	public void reagistration(String name, String password) {
		Connection connection = null;
		Statement statement = null;
		try {
			 
			String insertIntoSQL = "INSERT INTO users (user_login, user_password) values ('" + name + "','" + password +"')" ;
			connection = getDBConnection();
			statement = connection.createStatement();
			statement.execute(insertIntoSQL);
		 } catch (SQLException e) {
		        System.out.println("SQL exeption");
		    } finally {
		        if (statement != null) {
		            try {
						statement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		        if (connection != null) {
		            try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		    }
	}
	private static Connection getDBConnection() {
	    Connection dbConnection = null;
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
	        System.out.println(e.getMessage());
	    }
	    try {
	        dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
	        System.out.println(dbConnection == null);
	        return dbConnection;
	    } catch (SQLException e) {
	        System.out.println("!!!");
	    }
	    return dbConnection;
	}
		
	}


