package app;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requisicao")
public class Atividade2a extends HttpServlet {
    private static final long serialVersionUID = 1585L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();

        out.println("Metodo: " + req.getMethod());
        out.println("URI: " + req.getRequestURI());
        out.println("Protocolo: " + req.getProtocol());
    }
}
