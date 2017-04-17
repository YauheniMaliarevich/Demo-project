package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import Tools.Log;


public class SqlUserDAO implements UserDAO {
	private Connection connection = null;
	private Statement statement = null;

	@Override
	public boolean signin(String name, String password) {
		boolean isLogin = false;
		try {
			String checkUser = "select user_id from users where user_login = '" + name + "' and user_password = "+ "'" + password + "'";
			connection = getDBConnection();
			statement = connection.createStatement();
			//isLogin = statement.execute(checkUser);
			ResultSet rs = statement.executeQuery(checkUser);
			while(rs.next()) {
				String userId = rs.getString("user_id");
				if(userId != null && !userId.isEmpty()) {
					isLogin = true;
				}
			}
		} catch(SQLException e) {
			Log.error("Sql exception", e);
		} finally {
			try {
				statement.close();
				connection.close();
			} catch(SQLException e) {
				Log.error("problem with closing connection or statement", e);
			}
		}
		return isLogin;
		}

	@Override
	public boolean reagistration(String name, String password) {
		boolean isRegister = false;
		try {		 
			String insertIntoSQL = "INSERT INTO users (user_login, user_password) values ('" + name + "','" + password +"')" ;
			String checkInsertingIntoSql = "Select user_id from users where user_login = '" + name + "'" + " and user_password = '" + password +"'";
			connection = getDBConnection();
			statement = connection.createStatement();
			statement.execute(insertIntoSQL);
			isRegister = statement.execute(checkInsertingIntoSql);
			
		 } catch (SQLException e) {
			 Log.error("could not execute Sql query", e);
		    } finally {		        
		            try {
						statement.close();
						connection.close();
					} catch (SQLException e) {
						Log.error("Problem with closing connection or statement", e);
					}
		    }
		return isRegister;
	}
	
	@Override
	public boolean comment(String name, String text) {
		boolean isComment = false;
		Date date = new Date();
		String insertIntoTable = "INSERT INTO comments (comment_author, comment_date, comment_text) values ('" + name + "','" + date.toString() 
		+"','" + text + "')";
		
		try {
			connection = getDBConnection();
			statement = connection.createStatement();
			isComment = statement.execute(insertIntoTable);
			
		} catch(SQLException e) {
			Log.error("Sql exeption", e);
		} finally {
			try {
				statement.close();
				connection.close();
			} catch(SQLException e) {
				Log.error("Problem with closing connection or statement", e);
			}
		}
		return true;
	}
	
	@Override
	public String getText() {
		StringBuilder result = new StringBuilder();
		String query = "select comment_author, comment_date, comment_text from comments";
		try {
			connection = getDBConnection();
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				
				result.append(rs.getString("comment_author") + " at " + rs.getString("comment_date") + " say:" + rs.getString("comment_text") + "\r\n");
			}
		} catch(SQLException e) {
			Log.error("Sql exeption", e);
		} finally {
			try {
				statement.close();
				connection.close();
			} catch(SQLException e) {
				Log.error("Problem with closing connection or statement", e);
			}
		}
		return result.toString();
	}
	
	private static Connection getDBConnection() {
	    Connection dbConnection = null;
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
	        Log.error("Could not find  jdbc driver", e);
	    }
	    try {
	        dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
	        return dbConnection;
	    } catch (SQLException e) {
	       Log.error("Could not get connection with ", e);
	    }
	    return dbConnection;
	}
		
	}


