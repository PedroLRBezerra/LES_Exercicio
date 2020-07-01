package Servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CursosDAO;
import dao.CursosDAOImp;
import entity.Curso;

@WebServlet("/validar")
public class ValidarCursoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, 
			HttpServletResponse res) throws IOException {
 		res.sendRedirect("/Login.jsp");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int codigo = Integer.parseInt(req.getParameter("codCurso"));
		validarCurso(codigo);
		RequestDispatcher dispatcher =  getServletContext().getRequestDispatcher("/Cursos_ADM.jsp");
		dispatcher.forward(req, resp);
	}
	
	private void validarCurso(int codigo) {
		Curso c= new Curso();
		c.setCodigo(codigo);
		CursosDAO cDao;
		try {
			cDao = new CursosDAOImp();
			cDao.validarCurso(c);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
