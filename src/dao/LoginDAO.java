package dao;

import entity.Usuario;

public interface LoginDAO {
	public Usuario validarLogin(String usuario, String senha);
}
