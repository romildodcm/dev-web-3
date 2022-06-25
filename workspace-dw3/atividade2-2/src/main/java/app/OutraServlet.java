package app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/pagina")
public class OutraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sessao = req.getSession(false);
        
        var loginStatus =  sessao.getAttribute("loginStatus");
        boolean loginStatusBoolean = (boolean) loginStatus;
		
		if (loginStatus != null && loginStatusBoolean == true) {
			resp.sendRedirect("./pagina.jsp");
		} else {
			req.setAttribute("errorMessage", "faça login para acessar a página");

			RequestDispatcher dispatcher = req.getRequestDispatcher("./index.jsp");
			dispatcher.forward(req, resp);
		}
	}
       


}
