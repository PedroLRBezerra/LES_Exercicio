package Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CursosDAO;
import dao.CursosDAOImp;
import entity.Curso;
import entity.Usuario;
@WebServlet("/BuscarCursos")
public class BuscarCursos extends HttpServlet{
	
	public void doGet(HttpServletRequest req, 
			HttpServletResponse res) throws IOException {
 		res.sendRedirect("/Login.jsp");
		
	}
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tipo = req.getParameter("tipo");
		List<Curso> cursos= new LinkedList();
		if(tipo.equals("1")) {
			cursos=buscarCursosNAprovados();
		}else if(tipo.equals("2")) {
			cursos=buscarCursosAprovados();
		}else {
			/*
			 * Usuario cursos=buscarCursosPorProf(dono)
			 */
		}
		req.setAttribute("lista", cursos);
	}

	public List<Curso> buscarCursosNAprovados() {
		try {
			CursosDAO cDao = new CursosDAOImp();
			return cDao.buscarCursosNAOAprovados();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public List<Curso> buscarCursosAprovados(){
		try {
			CursosDAO cDao = new CursosDAOImp();
			return cDao.buscarCursosAprovados();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	private List<Curso> buscarCursosPorProf(Usuario dono){
		try {
			CursosDAO cDao = new CursosDAOImp();
			return cDao.buscarCursosDeProfessor(dono);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
