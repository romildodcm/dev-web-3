package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Product;
import repository.ProductRepository;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductRepository repository = new ProductRepository();
		List<Product> products = new ArrayList<Product>();
		
		try {
			products = repository.findAll();
		} catch (Exception e){
			System.out.print(e.getMessage());
		}
		
		req.setAttribute("products", products);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("products.jsp");
		dispatcher.forward(req, resp);
	}

}
