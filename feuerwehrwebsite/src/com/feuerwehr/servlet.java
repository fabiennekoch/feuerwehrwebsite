package com.feuerwehr;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class servlet  extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println(req.getParameter("message"));
		
	}
	
	private void login() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/messages?useSSL=false", "root", "N9K1UsHo");
			Statement statement = conn.createStatement();
			
			String uname = InputBenutzername.getText();
			
			String sqlStr = "select * from login where benutzername = InputBenutzername + passowor = InputPassword";
			
			ResultSet rset = statement.executeQuery(sqlStr);
			if(rset.first()) {
				return true;
			}else {
				
			}
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}