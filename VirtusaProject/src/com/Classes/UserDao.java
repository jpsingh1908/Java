package com.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DbConnection.DbConnection;

public class UserDao {
   private Connection connection;
   public static int count;
	public UserDao(){
		connection = DbConnection.getConnection();
		if(connection!=null){
			System.out.println("Successful");
	}
		

}
	public  int getCount(){
		return count;
	}
	
	User user=new User();
	
	public User validateUser(String email, String password) {
		String template="select * from signup where username=? and password=?";
		
		try{
			PreparedStatement pstmt=connection.prepareStatement(template);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				user.setEmail(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				return user;
				
			}
			else{
				return null;
			}
		}catch(SQLException e){System.out.println(e);}
		return null;
	}
	
	public boolean validateNewUser(String name,String email,String password){
		String template="insert into signup values(?,?,?)";
		try{
		  PreparedStatement pstmt=connection.prepareStatement(template);
		  pstmt.setString(1, name);
		  pstmt.setString(2, email);
		  pstmt.setString(3, password);
		  
		  pstmt.executeUpdate();
		  
		return true;
		}catch(SQLException e){
			System.out.println(e);
			return false;
		}
		
	}
	public boolean applyForJob(String name,String email,String father,String mother,float high,float higher,float btech,float years,String skill,String job){
		String template="insert into apply values(?,?,?,?,?,?,?,?,?,?,?)";
		try{
			count++;
			PreparedStatement pstmt=connection.prepareStatement(template);
			  pstmt.setString(1, name);
			  pstmt.setString(2, email);
			  pstmt.setString(3, father);
			  pstmt.setString(4, mother);
			  pstmt.setFloat(5, high);
			  pstmt.setFloat(6, higher);
			  pstmt.setFloat(7, btech);
			  pstmt.setFloat(8, years);
			  pstmt.setString(9, skill);
			  pstmt.setInt(10,count);
			  pstmt.setString(11, job);
			  
			  pstmt.executeUpdate();
			  return true;
		}catch(SQLException e){
			System.out.println(e);
			return false;
		}
		
	}   
}
