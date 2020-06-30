package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Curso;

public class CursosDAOImp implements CursosDAO {
	
	private Connection c;
	
	public CursosDAOImp() throws ClassNotFoundException, SQLException {
		IGenericDAO gDao = new GenericDAO();
		c = gDao.getConnection(); 
	}

	@Override
	public void InsereCurso(Curso curso) {
		try {
			String sql = "INSERT INTO Curso (nome,descricao,duracao,situacao,usuario_dono) " +
					"VALUES ( ?, ?, ?, ?, ?)";
					PreparedStatement stmt = c.prepareStatement(sql);
					stmt.setString(1, curso.getNome());
					stmt.setString(2, curso.getDecricao());
					stmt.setString(3, curso.getDuracao());
					stmt.setInt(4, 0);
					stmt.setString(5, curso.getUsuario_dono());
					stmt.executeUpdate();
					c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
