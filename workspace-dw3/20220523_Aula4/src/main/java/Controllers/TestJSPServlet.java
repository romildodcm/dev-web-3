package Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestJSPServlet extends HttpServlet {
	private static final long serialVersionUID = 13L;
       
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 

    	req.setAttribute("attr_chave", "um objeto qualquer");
    	
        RequestDispatcher dispatcher = req.getRequestDispatcher("resposta.jsp");

        dispatcher.forward(req, resp);
    }

}
