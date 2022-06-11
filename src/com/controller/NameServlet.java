package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		
		request.setAttribute("MyName", name);
		
		RequestDispatcher rd=request.getRequestDispatcher("NameOutput.jsp");
		
		rd.forward(request, response);
		
		
	}
	
	
}
