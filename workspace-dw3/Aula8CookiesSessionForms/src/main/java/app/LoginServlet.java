package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    	String email = req.getParameter("field-email");
    	String senha = req.getParameter("field-senha");
    	
    	System.out.println(email);
    	System.out.println(senha);
    	
    	Usuario usuario = verificaLogin(email, senha);
    	
    	if (usuario != null) {
    		HttpSession sessao = req.getSession(true);
    		
    		sessao.setAttribute("usuario", usuario);
    		sessao.setAttribute("esta_logado", true);
    		
    		resp.sendRedirect("index.jsp");
    	} else {
    		// O login falhou
    		resp.sendRedirect("login.jsp");
    	}
    }
    
    public Usuario verificaLogin(String email, String senha) {
    	Usuario usuario0 = new Usuario("gmail@romildo.me", "1234");
    	Usuario usuario2 = new Usuario("test@test.com", "1234");
    	Usuario usuario1 = new Usuario("gmail@test.com", "1234");
    	
    	List<Usuario>  bancoDados = new ArrayList<>();
    	bancoDados.add(usuario0);
    	bancoDados.add(usuario1);
    	bancoDados.add(usuario2);
    	
    	Usuario usuarioLogin = new Usuario(email, senha);
    	System.out.println(usuarioLogin);
    	
 
    	if (bancoDados.contains(usuarioLogin)) {
    		return usuarioLogin;
    	} else { 
    		return null;
    	}
    	
    }

}
