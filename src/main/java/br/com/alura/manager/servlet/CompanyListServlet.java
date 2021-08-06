package br.com.alura.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CompanyListServlet")
public class CompanyListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		DataBase database = new DataBase();
		List<Company> list = database.getCompanys();
		
		PrintWriter output = response.getWriter();
		
		request.setAttribute("listCompanys", list);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listCompany.jsp");
		requestDispatcher.forward(request, response);
	}

}
