@WebServlet("/requisicao")
public class Atividade2a extends HttpServlet {

    private static final long serialVersionUID = 2L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resposta) {
        String metodo, protocolo, uri;

        Printwriter out = resp.getWriter();

        out.println("Metodo: " + req.getMethod());
        out.println("URI: " + req.getRequestURI());
        out.println("Protocolo: " + req.getProtocol());
    }
}
