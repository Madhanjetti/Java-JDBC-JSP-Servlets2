package com.insert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DataBaseDemo;


@WebServlet("/InsertController")
public class InsertController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("empName");
		String age = request.getParameter("empAge");
		int age1 = Integer.parseInt(age);
		out.println(name + "     "+age1);
		
		//JDBC call
		
		DataBaseDemo.getConnection();
		DataBaseDemo.save(name, age1);
	}

}
