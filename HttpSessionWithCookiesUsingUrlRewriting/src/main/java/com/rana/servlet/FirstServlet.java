package com.rana.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/firstservlet")
public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	 PrintWriter pw = response.getWriter();
	 response.setContentType("text/html");
	 
	 //reading data from form........
	 
	 String name = request.getParameter("name");
	 String address = request.getParameter("address");
	 int age = Integer.parseInt(request.getParameter("age"));
	 //pw.println(name +"  "+age+"  "+address);
	 
	 // create session for browser window ....
	 HttpSession session = request.getSession(true);
	 // keep the data to session attribute.......
	 
	 session.setAttribute("name", name);
	 session.setAttribute("address", address);
	 session.setAttribute("age", age);
	 
	 //generate form two dynamically......
	 pw.println("<!DOCTYPE html>\r\n" + 
	 		"<html>\r\n" + 
	 		"<head>\r\n" + 
	 		"	<title>.......Demonstrating httpSession............</title>\r\n" + 
	 		"	<style type=\"text/css\">\r\n" + 
	 		"		.header {\r\n" + 
	 		"			background: yellow;\r\n" + 
	 		"			width: 100%;\r\n" + 
	 		"			height: 100px;\r\n" + 
	 		"  			font-size: 30px;\r\n" + 
	 		"  			display: flex;\r\n" + 
	 		"  			justify-content: center;\r\n" + 
	 		"		}\r\n" + 
	 		"		h1 {\r\n" + 
	 		"			margin: 0px;\r\n" + 
	 		"			padding: 0px;\r\n" + 
	 		"		}\r\n" + 
	 		"		.content{\r\n" + 
	 		"			display: flex;\r\n" + 
	 		"			justify-content: center;\r\n" + 
	 		"			background: green;\r\n" + 
	 		"			height: 450px;\r\n" + 
	 		"\r\n" + 
	 		"		}\r\n" + 
	 		"		.footer{\r\n" + 
	 		"			background: yellow;\r\n" + 
	 		"			width: 100%;\r\n" + 
	 		"			height: 100px;\r\n" + 
	 		"			font-size: 30px;\r\n" + 
	 		"  			display: flex;\r\n" + 
	 		"  			justify-content: center;\r\n" + 
	 		"		}\r\n" + 
	 		"		ul {\r\n" + 
	 		"\r\n" + 
	 		"			border-radius: 30px;\r\n" + 
	 		"			list-style: none;\r\n" + 
	 		"			padding: 0px;\r\n" + 
	 		"			margin: 0px;\r\n" + 
	 		"			width: 400px;\r\n" + 
	 		"			border: 3px solid #fff;\r\n" + 
	 		"		}\r\n" + 
	 		"		li {\r\n" + 
	 		"			margin: 20px;\r\n" + 
	 		"			padding: 0px;\r\n" + 
	 		"		}\r\n" + 
	 		"		::placeholder { \r\n" + 
	 		"  		color: green;\r\n" + 
	 		"  		opacity: 0.5; \r\n" + 
	 		"  		font-size: 50px;\r\n" + 
	 		"  		display: flex;\r\n" + 
	 		"  		justify-content: center;\r\n" + 
	 		"  		} \r\n" + 
	 		"  		input[type=\"text\"]::placeholder {  \r\n" + 
	 		"                text-align: center; \r\n" + 
	 		"            }\r\n" + 
	 		"  		input {\r\n" + 
	 		"  			font-family: serif;\r\n" + 
	 		"  			font-size: 50px;\r\n" + 
	 		"  			height: 80px;\r\n" + 
	 		"  			background:	#ffd700;\r\n" + 
	 		"  			width: 350px;\r\n" + 
	 		"  			border-radius: 20px;\r\n" + 
	 		"  		}\r\n" + 
	 		"  		option{\r\n" + 
	 		"  			font-family: serif;\r\n" + 
	 		"  			font-size: 50px;\r\n" + 
	 		"  			height: 80px;\r\n" + 
	 		"  			background:	#ffd700;\r\n" + 
	 		"  			width: 350px;\r\n" + 
	 		"  			border-radius: 20px;\r\n" + 
	 		"  		}\r\n" + 
	 		"  		select{\r\n" + 
	 		"  			font-family: serif;\r\n" + 
	 		"  			font-size: 50px;\r\n" + 
	 		"  			height: 80px;\r\n" + 
	 		"  			background:	#ffd700;\r\n" + 
	 		"  			width: 350px;\r\n" + 
	 		"  			border-radius: 20px;\r\n" + 
	 		"  		}\r\n" + 
	 		"	</style>\r\n" + 
	 		"</head>\r\n" + 
	 		"<body>\r\n" + 
	 		"	<div class=\"header\"> <h1>Do registration here For getting job</h1></div>\r\n" + 
	 		"	<div class=\"content\">\r\n" + 
	 		"		<form action= " +response.encodeURL("secondservlet")+ " method=\"Post\">\r\n" + 
	 		"			<ul>\r\n" + 
	 		"			<li><input type=\"text\" name=\"exp\" placeholder=\"experience\"></li>\r\n" + 
	 		"			<li><select name=\"skill\">\r\n" + 
	 		"				<option> JAVA </option>\r\n" + 
	 		"				<option> .NET</option>\r\n" + 
	 		"				<option> PHP</option>\r\n" + 
	 		"			</select></li>\r\n" + 
	 		"			<li><input type=\"submit\" value=\"continue\"></li>\r\n" + 
	 		"			</ul>\r\n" + 
	 		"			\r\n" + 
	 		"		</form>\r\n" + 
	 		"	</div>\r\n" + 
	 		"	<div class=\"footer\"> <h1>developed by rana</h1></div>\r\n" + 
	 		"</body>\r\n" + 
	 		"</html> ");
	 pw.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
