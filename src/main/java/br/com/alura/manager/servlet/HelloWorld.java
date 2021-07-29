package br.com.alura.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello")
public class HelloWorld extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter output = res.getWriter();
		
		output.println("<html>");
		output.println("<body>");
		output.println("<h1>Hello world, friend.</h1>");
		output.println("<body>");
		output.println("<html>");
	}	

}
