package dao;

import entity.Usuario;

public interface UsuarioDAO {
	public Usuario validarLogin(String usuario, String senha);
	public void cadastrarUsuario(Usuario user);
}
