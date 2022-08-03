package com.hcl.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class UserLogin extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	public void init() {
		
		System.out.println("httpservlet init...");
	}
	public static Driver registerDriver() throws SQLException {
        Driver myDriver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(myDriver);
        return myDriver;
}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
	
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day8","root","root");
			PreparedStatement pstmt = conn.prepareStatement("Select * from user where userName = ? and password = ?");
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			
			ResultSet rs =pstmt.executeQuery();
			
			if(rs.next())
			{
				out.println("Welcome"+ userName);
			}
			else
			{
				out.println("Wrong User, try again!");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
		
		
		out.println("Welcome to httpservlet GET method example...!");
		
		out.println("Username: "+ userName);
		out.println("Password: "+ password);

	}
	
}
