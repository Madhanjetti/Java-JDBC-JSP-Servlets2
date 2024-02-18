package com.delete;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DataBaseDemo;

@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String age = request.getParameter("empAge");
		int age1 = Integer.parseInt(age);
		out.println(age1);
		
		//JDBC Code
		
		DataBaseDemo.getConnection();
		DataBaseDemo.delete(age1);
		
	}

}
