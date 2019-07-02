package com.form.recall;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class FormRecalling extends HttpServlet {
	
	Connection con=null;
	PreparedStatement ps=null;
	String query="select * from emp where ename=?";
	
	@Override
	public void init() {
		String driver,url,dbuser,dbpwd=null;
		try {
			
			ServletContext sc=getServletContext();
			driver=sc.getInitParameter("driver");
			url=sc.getInitParameter("url");
			dbuser=sc.getInitParameter("dbuser");
			dbpwd=sc.getInitParameter("pwd");
			
			
			Class.forName(driver);
			
			con=DriverManager.getConnection(url,dbuser,dbpwd);
			
			ps=con.prepareStatement(query);
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String empname,salary,job1=null;
		
		empname=req.getParameter("ename");
		salary=req.getParameter("sal");
		job1=req.getParameter("job");
		
		
		ps.setString(1,empname);
		
		ResultSet rs=ps.executeQuery();
		if (rs.next()) {
			req.setAttribute("empname", rs.getString(2));
			req.setAttribute("salary", rs.getString(6));
			req.setAttribute("job1", rs.getString(3));
			
			//pw.print(rs.getString(2)+" "+rs.getString(3));
		}
		req.getRequestDispatcher("index.jsp").forward(req, res);
		
		pw.close();
		rs.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}
	
	@Override
	public void destroy() {
	try {
		ps.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
