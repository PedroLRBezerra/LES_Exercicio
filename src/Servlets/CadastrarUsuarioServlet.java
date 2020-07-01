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

import dao.UsuarioDAO;
import dao.UsuarioDAOImp;
import entity.Usuario;

@WebServlet("/CadastrarUsuario")
public class CadastrarUsuarioServlet extends HttpServlet{
	
	private void cadastrarUsuario(Usuario user) {
		try {
			UsuarioDAO lDao = new UsuarioDAOImp();
			lDao.cadastrarUsuario(user);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void doGet(HttpServletRequest req, 
			HttpServletResponse res) throws IOException {
 		res.sendRedirect("/Principal.jsp");
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, 
			HttpServletResponse res) throws IOException { 
		String usuario = req.getParameter("usuario");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		String nome = req.getParameter("nome");
		String tipo = req.getParameter("tipo");
		
		PrintWriter out = res.getWriter();
		System.out.println("bcc"+nome);
		Usuario user= new Usuario();
		user.setEmail(email);
		user.setNome(nome);
		user.setSenha(senha);
		user.setTipo(tipo);
		user.setUsuario(usuario);
		
		cadastrarUsuario(user);
	
		req.setAttribute("user",user);
		RequestDispatcher dispatcher =  getServletContext().getRequestDispatcher(getUrlporTipo(user.getTipo()));
		try {
			dispatcher.forward(req, res);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private String getUrlporTipo(String s) {
		String url="/";
		String [][] urlsTipo = {{"ADM","PROFESSOR","ALUNO"},
								{"Cursos_ADM.jsp","Prof_cursos.jsp","Cursos.jsp"}};
		for(int x=0;x<urlsTipo[0].length;x++) {
			if(urlsTipo[0][x].equals(s)) {
				url+=urlsTipo[1][x];
			}
		}
		
		return url;
	}
	
}
