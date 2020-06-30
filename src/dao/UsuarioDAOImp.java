package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Usuario;

public class UsuarioDAOImp implements UsuarioDAO {
	
	private Connection c;
	
	public UsuarioDAOImp() throws ClassNotFoundException, SQLException {
		IGenericDAO gDao = new GenericDAO();
		c = gDao.getConnection(); 
	}

	@Override
	public Usuario validarLogin(String usuario, String senha) {
		Usuario u = new Usuario();
		try {
			String sql = "SELECT usuario.nome,usuario.email,usuario.tipo FROM usuario WHERE  usuario.usuario LIKE ? AND usuario.senha LIKE ?"; 
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1,usuario);
			ps.setString(2,senha);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			u.setUsuario(usuario);
			u.setNome(rs.getString("nome"));
			u.setEmail(rs.getString("email"));
			u.setSenha(senha);
			u.setTipo(rs.getString("tipo"));
			System.out.println("user");
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public void cadastrarUsuario(Usuario user) {
		try {
			String sql = "INSERT INTO usuario (usuario,nome,email,senha,tipo) " +
					"VALUES ( ?, ?, ?, ?, ?)";
					PreparedStatement stmt = c.prepareStatement(sql);
					stmt.setString(1, user.getUsuario());
					stmt.setString(2, user.getNome());
					stmt.setString(3, user.getEmail());
					stmt.setString(4, user.getSenha());
					stmt.setString(5, user.getTipo());
					stmt.executeUpdate();
					c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
