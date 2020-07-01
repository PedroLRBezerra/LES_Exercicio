package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import entity.Curso;
import entity.Usuario;

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

	@Override
	public List<Curso> buscarCursosNAOAprovados() {
		List<Curso> lista = new LinkedList<Curso>();
		try {
			String sql = "SELECT * FROM curso WHERE situacao LIKE ?  ";
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setInt(1, 0);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) { 
				Curso curso = new Curso();
				curso.setCodigo(rs.getInt("codigo"));
				curso.setDecricao(rs.getString("descricao"));
				curso.setDuracao(rs.getString("duracao"));
				curso.setSituacao(rs.getBoolean("situacao"));
				curso.setNome(rs.getString("nome"));
				curso.setUsuario_dono(rs.getString("usuario_dono"));
				lista.add(curso);
			}
			c.close();
		} catch (SQLException e) {
			System.out.println("Deu Ruim");
		}
		return lista;
	}

	@Override
	public List<Curso> buscarCursosAprovados() {
		List<Curso> lista = new LinkedList<Curso>();
		try {
			String sql = "SELECT * FROM curso WHERE situacao LIKE ?  ";
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setInt(1, 1);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) { 
				Curso curso = new Curso();
				curso.setCodigo(rs.getInt("codigo"));
				curso.setDecricao(rs.getString("descricao"));
				curso.setDuracao(rs.getString("duracao"));
				curso.setSituacao(rs.getBoolean("situacao"));
				curso.setNome(rs.getString("nome"));
				curso.setUsuario_dono(rs.getString("usuario_dono"));
				lista.add(curso);
			}
			c.close();
		} catch (SQLException e) {
			System.out.println("Deu Ruim");
		}
		return lista;
	}

	@Override
	public List<Curso> buscarCursosDeProfessor(Usuario user) {
		List<Curso> lista = new LinkedList<Curso>();
		try {
			String sql = "SELECT * FROM curso WHERE usuario_dono LIKE ?  ";
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setString(1, user.getUsuario());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) { 
				Curso curso = new Curso();
				curso.setCodigo(rs.getInt("codigo"));
				curso.setDecricao(rs.getString("descricao"));
				curso.setDuracao(rs.getString("duracao"));
				curso.setSituacao(rs.getBoolean("situacao"));
				curso.setNome(rs.getString("nome"));
				curso.setUsuario_dono(rs.getString("usuario_dono"));
				lista.add(curso);
			}
			c.close();
		} catch (SQLException e) {
			System.out.println("Deu Ruim");
		}
		return lista;
	}

	@Override
	public void validarCurso(Curso curso) {
		try {
			String sql = "UPDATE curso SET situacao = ?"
					+ "WHERE codigo = ?";
					PreparedStatement ps = c.prepareStatement(sql);
					ps.setInt(1,1);
					ps.setInt(2, curso.getCodigo());
					ps.execute();
					ps.close();
					}
			catch(SQLException e){
				e.printStackTrace();
				System.out.println("Deu Ruim");
			}
		
	}

	@Override
	public void removerCurso(Curso curso) {
		try {
			String sql = "DELETE FROM curso WHERE codigo=?";
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setInt(1, curso.getCodigo());
			stmt.executeUpdate();
			c.close();
		} catch (SQLException e) {
			System.out.println("Deu Ruim");
		}
		
	}

}
