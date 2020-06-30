package entity;

public class Curso {
  private int codigo;
  private String nome;
  private String decricao;
  private String duracao;
  private Boolean situacao;
  private String usuario_dono;
  
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public Boolean getSituacao() {
	return situacao;
}
public void setSituacao(Boolean situacao) {
	this.situacao = situacao;
}
public String getUsuario_dono() {
	return usuario_dono;
}
public void setUsuario_dono(String usuario_dono) {
	this.usuario_dono = usuario_dono;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDecricao() {
	return decricao;
}
public void setDecricao(String decricao) {
	this.decricao = decricao;
}
public String getDuracao() {
	return duracao;
}
public void setDuracao(String duracao) {
	this.duracao = duracao;
}

}
