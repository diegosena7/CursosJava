package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UploadServlet() {
		super();
	}

	/**
	 * @throws ServletException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String msg = "Arquivo(s) enviado(s) com sucesso...";
		String path = request.getServletContext().getRealPath("/uploads" + File.separator);
		try {
			for (Part part : request.getParts()) {
				if (part.getName().equals("file")) {
					part.write(path + File.separator + part.getSubmittedFileName());
				}
			}
		} catch (Exception e) {
			msg = "Erro ao enviar arquivo...";
			e.getMessage();
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("Upload.jsp").forward(request, response);
	}
}
