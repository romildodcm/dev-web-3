package app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usuario = req.getParameter("field-user");
		String senha = req.getParameter("field-password");
		
		HttpSession sessao = req.getSession(true);
		sessao.setAttribute("user", usuario);

		if (usuario == null && senha == null) {
			resp.sendRedirect("./index.jsp");
			
		} else if (usuario.equals("admin") && senha.equals("admin")) {
			sessao.setAttribute("loginStatus", true);
			
			resp.sendRedirect("./pagina.jsp");
			
		} else {
			sessao.setAttribute("loginStatus", false);
			req.setAttribute("errorMessage", "usuário ou senha incorretos");

			RequestDispatcher dispatcher = req.getRequestDispatcher("./index.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
