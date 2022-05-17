package app;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cabecalhos")
public class Atividade2b extends HttpServlet{
    private static final long serialVersionUID = 80L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();

        out.println("Host: " + req.getHeader("host"));
        out.println("User-Agent: " + req.getHeader("user-agent"));
        out.println("Accet-Encoding: " + req.getHeader("accept-encoding"));
        out.println("Accept-Language: " + req.getHeader("accept-language"));
    }
}