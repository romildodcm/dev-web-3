package controllers;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

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
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String habilidade = "";
		
		String nome = req.getParameter("field_nome");
		String dataStr = req.getParameter("field_data");
		String idioma = req.getParameter("field_idioma");
		String[] habilidades = req.getParameterValues("habilidades");

		Cadastro cadastro = new Cadastro();
		
		try {
			cadastro.setNome(nome);
			cadastro.setDataNascimento(dataStr);
			cadastro.setIdioma(idioma);
			cadastro.setHabilidades(habilidades);
		} catch (Exception e) {
			req.setAttribute("errorMessage", e.getMessage());

			RequestDispatcher dispatcher = req.getRequestDispatcher("./formulario.jsp");

			dispatcher.forward(req, resp);
		}
		
		req.setAttribute("cadastroNome", cadastro.getNome());
		req.setAttribute("cadastroDataNascimento", formatador.format(cadastro.getDataNascimento()));
		req.setAttribute("cadastroIdioma", cadastro.getIdioma());
		
		String[] todasHabilidades = cadastro.getHabilidades();
		int len = todasHabilidades.length;
		
		for (int i = 0; i < len; i++) {
			habilidade += todasHabilidades[i];
			if (i < len-1) {
				habilidade += ", ";
			} else {
				habilidade += ".";
			}
		}
		
		req.setAttribute("cadastroHabilidades", habilidade);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("./resposta.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("./formulario.jsp");
	}

}
