package br.com.alura.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewCompanyServlet
 */
@WebServlet("/newCompany")
public class NewCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Add new company");
		
		String companyName = request.getParameter("name");
		PrintWriter output = response.getWriter();
		
		output.println("<html>");
		output.println("<body>");
		output.println("Comany created with sucess!" + companyName);
		output.println("<body>");
		output.println("<html>");
	}

}
