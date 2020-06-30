package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.el.ELManager;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Curso;


@WebServlet("/CursoServlet")
public class CursoServlet extends HttpServlet {
 
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException { 
		List<Curso> lista = (List<Curso>)getServletContext().getAttribute("LISTA");
		if (lista == null) { 
			System.out.println("### ESTAMOS CRIANDO A LISTA ###");
			lista = new ArrayList<>();
			getServletContext().setAttribute("LISTA", lista);			
		}
		
		String nome = req.getParameter("nome");
		String descricao = req.getParameter("descricao");
		String duracao = req.getParameter("duracao");
		//String cmd = req.getParameter("cmd");
		
		////String msg = null;
		//if ("Adicionar Curso".equals(cmd)) {
			Curso c = new Curso();
			c.setNome(nome);
			c.setDecricao(descricao);
			c.setDuracao(duracao);
			
		//	msg = String.format("O Curso foi adicionado com sucesso na sua lista", nome);
		//} else if ("pesquisar".equals(cmd)) { 
		//	String sql = "select p from Pet p where p.nome like :pet_nome";
		//	lista.clear();
			lista.add(c);
		////	msg = String.format("Foram encontrados %d pets", lista.size());
		//}
		
		res.sendRedirect("./Cursos.jsp");
	}
}
