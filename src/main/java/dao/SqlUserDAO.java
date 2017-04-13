package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SqlUserDAO implements UserDAO {

	@Override
	public void signin(String name, String password) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://3306/db","root","root");
			System.out.println("connection");
			
		} catch(ClassNotFoundException e) {
			System.out.println("class not found");
		} catch(SQLException e) {
			System.out.println("sql exeption");
		} finally {
			try {
			if(null != con) {
				con.close();
			}} catch(SQLException e)
			{
				e.printStackTrace();
			}
			}
		}

	@Override
	public void reagistration(String name, String password) {
		Connection connection = null;
		Statement statement = null;
		try {
			
			String insertIntoSQL = "INSERT INTO users (user_name, user_password) values ('" + name + "','" + password +"'))" ;
			System.out.println(insertIntoSQL);
			connection = getDBConnection();
			statement = connection.createStatement();
			statement.execute(insertIntoSQL);
			System.out.println("it works");
		 } catch (SQLException e) {
		        System.out.println(e.getMessage());
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
	        dbConnection = DriverManager.getConnection("jdbc:mysql://3306/db","root","root");
	        return dbConnection;
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	    return dbConnection;
	}
		
	}


