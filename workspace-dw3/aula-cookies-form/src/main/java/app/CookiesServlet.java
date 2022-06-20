package app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class CookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie[] cookies = req.getCookies();

		if (cookies == null || cookies.length == 0) {
			resp.addCookie(criaCookie("usuario", "romildo"));
		} else {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("usuario")) {
					resp.getWriter().println("Tem cookie para o usuario: " + cookie.getValue());
				} else {
					resp.getWriter().println("O cookie foi criado");
					resp.addCookie(criaCookie("usuario", "romildo"));
					break;
				}
			}
		}
	}

	private Cookie criaCookie(String nome, String valor) {
		Cookie cookie = new Cookie(nome, valor);
		cookie.setMaxAge(5);
		return cookie;
	}
}
