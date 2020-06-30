package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
import entity.Usuario;

@WebServlet("/Postar")
public class PostarServlet  extends HttpServlet{
	public void doGet(HttpServletRequest req, 
			HttpServletResponse res) throws IOException {
 		res.sendRedirect("/Login.jsp");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Usuario user = new Usuario();
		user.setUsuario(req.getParameter("useruser"));
		user.setEmail(req.getParameter("useremail"));
		user.setNome(req.getParameter("username"));
		user.setSenha(req.getParameter("usersenha"));
		user.setTipo(req.getParameter("usertipo"));
		
		
		String nome = req.getParameter("Nome_curso");
		String desc = req.getParameter("Desc_curso");
		String dur = req.getParameter("Dur_curso");
		
		Curso curso = new Curso();
		curso.setDecricao(desc);
		curso.setDuracao(dur);
		curso.setNome(nome);
		curso.setUsuario_dono(user.getUsuario());
		
		PrintWriter out = resp.getWriter();
		if(CadastrarCurso(curso)) {
			req.setAttribute("user",user);
			RequestDispatcher dispatcher =  getServletContext().getRequestDispatcher("/Prof_cursos.jsp");
			dispatcher.forward(req, resp);
		}else {
			out.println("<h1>Falha ao Inserir o curso</h1>");
		}
		
	}
	
	public Boolean CadastrarCurso(Curso c) {
		try {
			CursosDAO cDao =  new CursosDAOImp();
			cDao.InsereCurso(c);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
}
