package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class AdminSistem {
	public static void main(String[]args){
	String jdbcURL="jdbc:postgreesql://localhost:5432/pasukan";
	String username="postgres";
	String password="admin";
	try{
	Connection connection=DriverManager.getConnection(jdbcURL,username,password);
	System.out.println("connected to DB");
	
	connection.close();
	}
	catch(SQLException e){
		
		System.out.println("Error in connecting to DB");
		e.printStackTrace();
		
	}
	}
	}
