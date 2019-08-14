package com.Servlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Classes.UserDao;
import com.DbConnection.DbConnection;


public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public signupServlet() {
        super();
      
    }
    DbConnection db1=new DbConnection();
    public void init(ServletConfig config) throws ServletException {
		// System.out.println("Count initialized..");
		String jdbcDriver=config.getServletContext().getInitParameter("jdbcDriver");
		String dbUrl=config.getServletContext().getInitParameter("dbUrl");
		String userName=config.getServletContext().getInitParameter("userName");
		String password=config.getServletContext().getInitParameter("password");
		// System.out.println(jdbcDriver);
		
		DbConnection db=new DbConnection(jdbcDriver,dbUrl,userName,password);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		

		
		UserDao userDao=new UserDao();
		boolean user=userDao.validateNewUser(name,email, password);
		
		String path="";
		if(user==false){
			path="signup.com";
		}
		else{
	        if(email.equals("admin") && password.equals("admin123")){
	        	
				try {
				Statement statement = db1.connection.createStatement();
				
	        	String sql ="select * from apply";
	        	ResultSet resultSet = statement.executeQuery(sql);
	        	while(resultSet.next()){
	        
	        	request.setAttribute("name",resultSet.getString("name")) ;
	        	request.setAttribute("email",resultSet.getString("email"));
	        	request.setAttribute("father",resultSet.getString("fathername"));
	        	request.setAttribute("mother",resultSet.getString("mothername"));
	        	request.setAttribute("high",resultSet.getString("high"));
	        	request.setAttribute("higher",resultSet.getString("higher"));
	        	request.setAttribute("btech",resultSet.getString("btech"));
	        	request.setAttribute("years",resultSet.getString("years"));
	        	request.setAttribute("skills",resultSet.getString("skill"));
	        	request.setAttribute("refid",resultSet.getString("refid"));
	        	request.setAttribute("job",resultSet.getString("job")) ;
	        	
	        	}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
				String status=request.getParameter("status");
				String ratings=request.getParameter("ratings");
				request.setAttribute("status", status);
				request.setAttribute("ratings", ratings);
				
	        	path="adminHomepage.jsp";
	        }
	        else if(email.equals("technical") && password.equals("technical123")){
	        	try {
					Statement statement = db1.connection.createStatement();
					
		        	String sql ="select * from apply";
		        	ResultSet resultSet = statement.executeQuery(sql);
		        	while(resultSet.next()){
		        
		        	request.setAttribute("name",resultSet.getString("name")) ;
		        	request.setAttribute("email",resultSet.getString("email"));
		        	
		        	request.setAttribute("years",resultSet.getString("years"));
		        	request.setAttribute("skills",resultSet.getString("skill"));
		        	request.setAttribute("refid",resultSet.getString("refid"));
		        	request.setAttribute("job",resultSet.getString("job")) ;
		        	
		        	}
					} catch (SQLException e) {
						e.printStackTrace();
					}
	        	String status=request.getParameter("status");
				String ratings=request.getParameter("ratings");
				request.setAttribute("status", status);
				request.setAttribute("ratings", ratings);
				path="technical.jsp";
	        }
	       else{
	
			path="homepage.jsp";
	        }
		}
		RequestDispatcher rsp=request.getRequestDispatcher(path);
		rsp.forward(request,response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
