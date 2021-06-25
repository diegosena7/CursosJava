package br.com.alura.projetcjsp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.print("Hello Word... Teste!!!");
		
		response.setContentType("text/html");
		System.out.println();
		writer = response.getWriter(); writer.print("Meus livros");

		writer.print("<ul>");

		writer.print("<li>"); writer.print("Livro de Java Web"); writer.print("</li>");

		writer.print("<li>"); writer.print("Livro de Android"); writer.print("</li>");

		writer.print("</ul>");
	}
}
