package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasServlet
 * Usamos o RequestDispatcher para chamar um JSP a partir da servlet
 * Obtemos o RequestDispatcher a partir do HttpServletRequest
 * Usamos a requisiÃ§Ã£o para colocar ou pegar um atributo(setAttribute(.., ..) ou getAttribute(..))
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * O HttpServletRequest recebe a requisicao na variÃ¡vel request proveniente do parÃ¢metro "nome"
	 * passado via URL e com isso cadastramos uma empresa.
	 * Obs: URL -> http://localhost:8080/gerenciador/formNovaEmpresa.html (definida no formNovaEmpresa)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		//Método que dispacha a requisição para outrabclasse, podendo ser um JSP ou Servlet...
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		request.setAttribute("empresa", empresa.getNome());//seta o atributo na variável da classe JSP, recebe um apelido e o nome do atributo
//		rd.forward(request, response);//esse método encaminha a requisição e a resposta ao servidor

		//Devolvendo uma resposta para o navegador, onde este ficará responsável por fazer um redirecionamento ao servlet
		response.sendRedirect("listaEmpresas");
		request.setAttribute("empresa", empresa.getNome());
	}
}
