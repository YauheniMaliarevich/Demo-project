package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlUserDAO implements UserDAO {

	@Override
	public void signin(String name, String password) {
		Connection con = null;
		try {
			Class.forName("");
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
		Connection con = null;
		try {
			Class.forName("");
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
		
	}


