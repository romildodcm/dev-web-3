package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cadastro;

@WebServlet("/processa")
public class ProcessaForm extends HttpServlet {
    private static final long serialVersionUID = 3L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String nome = req.getParameter("field_nome");
        String dataStr = req.getParameter("field_data");
        String idioma = req.getParameter("field_idioma");
        String[] habilidades = req.getParameterValues("habilidades");

        try {
            Cadastro cadastro = new Cadastro();
            
            cadastro.setNome(nome);
            cadastro.setDataNascimento(dataStr);
            cadastro.setIdioma(idioma);
            cadastro.setHabilidades(habilidades);
        } catch (Exception e) {
            req.setAttribute("erro", e.getMessage());

            RequestDispatcher dispatcher = req.getRequestDispatcher("formulario.jsp");

            dispatcher.forward(req, resp);
        }

        // resp.getWriter().println("Nome: " + nome);
        // resp.getWriter().println("Data: " + formatador.format(data));
        // resp.getWriter().println("Idioma: " + idioma);
        // resp.getWriter().println("Habilidades: ");

        // for (String habilidade : habilidades) {
        //     resp.getWriter().println(" - " + habilidade);
        // }
    }

}
