package org.okasha.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.okasha.model.Category;
import org.okasha.model.Product;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		Product product = new Product();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("Name");
		String price = request.getParameter("Price");
		String categoryName = request.getParameter("Category");
		
		int int_price = Integer.parseInt(price);
		product.setName(name);
		product.setPrice(int_price);
		product.setCategoryName(categoryName);
		Category category = new Category();
		boolean existed = category.CategorySearch();
		boolean added = product.insertProduct();
		if (added && existed) {
			RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
			rd.forward(request, response);
		} else if (!added) {
			out.println("<font color=red> Something Wrong! Product not added  </font>");
			RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
		}
		else if (!existed){
			out.println("<font color=red> Category Not Found!  </font>");
			RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
		}
	}
}
