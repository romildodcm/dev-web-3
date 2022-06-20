package app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 5L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession sessao = req.getSession();

		if (sessao.isNew()) {
			resp.getWriter().print("Sessao nova");
			sessao.setAttribute("usuario_logado", "romildo");
		} else {
			String usuario = (String) sessao.getAttribute("usuario_logado");
			resp.getWriter().print("Usuario logado: " + usuario);
		}
	}

}
