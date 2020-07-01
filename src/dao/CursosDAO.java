package dao;

import java.util.List;

import entity.Curso;
import entity.Usuario;

public interface CursosDAO {
	public void InsereCurso(Curso c);
	public List<Curso> buscarCursosNAOAprovados();
	public List<Curso> buscarCursosAprovados();
	public List<Curso> buscarCursosDeProfessor(Usuario user);
	public void validarCurso(Curso curso);
	public void removerCurso(Curso curso);
}
