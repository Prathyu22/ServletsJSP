package com.addition;

import java.io.IOException;
//import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;



public class AddServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException  //method in servlet lifecycle.
, ServletException
	{
		//getParameter will gives us a string.
		//So, typecast it to integer data type.
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		Cookie cookie = new Cookie("k", k +"");
		res.addCookie(cookie);
		
		/*HttpSession session = req.getSession();
		session.setAttribute("k",k);*/
		
		//Session Management.
		res.sendRedirect("sq");
		
		
		//req.setAttribute("k",k);
		
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		//rd.forward(req, res);
	}
}
