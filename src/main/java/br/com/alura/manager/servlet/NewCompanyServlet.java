package br.com.alura.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newCompany")
public class NewCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Add new company");
		
		String companyName = request.getParameter("name");
		String openingDate = request.getParameter("openingDate");
		Date parseOpeningDate;
		
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			parseOpeningDate = simpleDateFormat.parse(openingDate);
		} catch (ParseException error) {
			throw new ServletException(error);
		}
		
		Company company = new Company();
		DataBase database = new DataBase();
		
		company.setName(companyName);
		company.setOpeningDate(parseOpeningDate);
		
		System.out.println(companyName);
		
		database.add(company);
		
		request.setAttribute("companyName", companyName);
		response.sendRedirect("CompanyListServlet");
		
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/CompanyListServlet");
//		request.setAttribute("companyName", companyName);
//		requestDispatcher.forward(request, response);
	}
}