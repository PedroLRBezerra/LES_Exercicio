package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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


@WebServlet("/Login")
public class Login extends HttpServlet{
	
	public Usuario consulta_Login(String user,String Senha) throws ClassNotFoundException, SQLException {
		System.out.println(user+"a");
		UsuarioDAO lDao = new UsuarioDAOImp();
		return lDao.validarLogin(user, Senha);
	}
	
	public void doGet(HttpServletRequest req, 
			HttpServletResponse res) throws IOException {
 		res.sendRedirect("/Login.jsp");
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, 
			HttpServletResponse res) throws IOException { 
		String nome = req.getParameter("usuario");
	//	String emaIl = req.getParameter("TXTEMAL");
		String senha = req.getParameter("senha");
		PrintWriter out = res.getWriter();
		System.out.println("bcc"+nome);
		Usuario user= new Usuario();
		try {
			user = consulta_Login(nome, senha);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (user.getNome() != null) { 
			out.println("<h1>Usuario autenticado</h1>");
			System.out.println(user.getTipo());
			req.setAttribute("user",user);
			RequestDispatcher dispatcher =  getServletContext().getRequestDispatcher(getUrlporTipo(user.getTipo()));
			try {
				dispatcher.forward(req, res);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			out.println("<h1>Usuario inexistente</h1>");
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
