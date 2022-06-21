package app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession sessao = req.getSession(false);
    	
    	if(sessao != null) {
    		// elimina os dados da sessao, encerrando
    		sessao.invalidate();
    		
    		System.out.println("Deslogado");
    	}
    	
    	resp.sendRedirect("login.jsp");
    	System.out.println("Redirecionado para login.jsp");
    }

}
