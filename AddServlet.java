package com.addition;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException  //method in servlet lifecycle.
	{
		//getParameter will gives us a string.
		//So, typecast it to integer data type.
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		//getWriter return an object of printWriter. 
		PrintWriter out = res.getWriter();
		out.println("result is: "+k);
	}
}
