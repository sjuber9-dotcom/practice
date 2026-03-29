package com.nit.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection con=null;
	
	static
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC DRIVER ISSUE.....[oracle.jdbc.driver.OracleDriver]");
		}
		try {
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		} catch (SQLException e) {
			System.err.println("JDBC Connection Object Issue.....");
		}
	}
	
	public static Connection getConnection()
	{
		return con;
	}

}
