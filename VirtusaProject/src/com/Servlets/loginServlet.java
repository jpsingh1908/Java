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

import com.Classes.User;
import com.Classes.UserDao;
import com.DbConnection.DbConnection;

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public loginServlet() {
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
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		UserDao userDao=new UserDao();
		User user=userDao.validateUser(email, password);
		
		String path="";
		if(user==null){
			path="login.html";
		}
		else{
			if(email.equals("admin") && password.equals("admin123")){
		        	Statement statement;
					try {
						statement = db1.connection.createStatement();
					
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
		        	path="adminHomepage.jsp";
		        }
			else{
			request.setAttribute("user",user);
			path="homepage.jsp";
			}
			
		}
		RequestDispatcher rsp=request.getRequestDispatcher(path);
		rsp.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
