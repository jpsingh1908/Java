package com.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
   public static Connection connection;
   public static Connection getConnection() {
	return connection;
}
public DbConnection(){}
   public DbConnection(String jdbcDriver,String dbUrl,String userName,String password){
	     try{
	    	 Class.forName(jdbcDriver);
	         connection=DriverManager.getConnection(dbUrl,userName,password);
	         if(connection!=null){
	        	 System.out.println("Connection successful...");
	         }
	     }catch(SQLException |ClassNotFoundException e){System.out.println(e);}
   }
}
