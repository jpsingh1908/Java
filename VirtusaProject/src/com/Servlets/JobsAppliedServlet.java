package com.Servlets;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Classes.UserDao;
import com.DbConnection.DbConnection;

import com.Classes.*;

public class JobsAppliedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public JobsAppliedServlet() {
        super();
     
    }
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
		
		
		
		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String fathername=request.getParameter("fathername");
		String mothername=request.getParameter("mothername");
		
		String high2=request.getParameter("high");
		float high=Float.parseFloat(high2);
		
		String higher2=request.getParameter("higher");
		float higher=Float.parseFloat(higher2);
		
		String btech2=request.getParameter("btech");
		float btech=Float.parseFloat(btech2);
		
		String years2=request.getParameter("years");
		float years=Float.parseFloat(years2);
		
		String skill[]= request.getParameterValues("skills");
		String skill2=Arrays.toString(skill);
		
		String job=request.getParameter("job");
		System.out.println(job);
		
		UserDao userDao=new UserDao();
		boolean user=userDao.applyForJob(name,email, fathername,mothername,high,higher,btech,years,skill2,job);
		Integer count2=new Integer(userDao.count);
		request.setAttribute("count",count2);
		
		String path="";
		if(user==false){
			path="details.jsp";
		}
		else{
			path="refid.jsp";
		}
		RequestDispatcher rsp=request.getRequestDispatcher(path);
		rsp.forward(request,response);
		
	}

}
