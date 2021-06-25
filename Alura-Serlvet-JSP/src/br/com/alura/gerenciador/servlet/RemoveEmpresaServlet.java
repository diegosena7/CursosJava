package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Classe respons�vel por excluir uma empresa
 */
@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idParameter = request.getParameter("id");
		Integer id = Integer.valueOf(idParameter);
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		System.out.println("Id removido: " + id);
		
		response.sendRedirect("listaEmpresas");
	}
}
