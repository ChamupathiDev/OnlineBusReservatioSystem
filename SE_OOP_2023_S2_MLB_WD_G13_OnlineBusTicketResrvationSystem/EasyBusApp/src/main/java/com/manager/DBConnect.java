package com.manager;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url="jdbc:mysql://localhost:3306/easybus";
	private static String username="root";
	private static String password="root";
	private static Connection CON;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			CON=DriverManager.getConnection(url, username, password);
		}
		catch(Exception e){
			System.out.println("Database connection is unsuccessfull");
		}
		return CON;
	}
	

}
