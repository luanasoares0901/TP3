package modelo;

//import java.util.*;

public class Dados {
	
	public  Usuario[] usuarios = new Usuario[50];
	public int qtdUsuarios = 0;
	public Estacao [] estacoes = new Estacao[50];
	public int qtdEstacoes = 0;
	
	
	public Usuario[] getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	
	public void inserirEditarUsuario(Usuario a, int pos) {
		this.usuarios[pos] = a;
		if(pos == qtdUsuarios) qtdUsuarios++;
	}
	
	public int getQtdUsuarios() {
		return qtdUsuarios;
	}
	public void setQtdUsuarios(int qtdUsuarios) {
		this.qtdUsuarios = qtdUsuarios;
	}
	

	public Estacao[] getEstacoes() {
		return estacoes;
	}
	
	public void setEstacoes(Estacao[] estacoes) {
		this.estacoes = estacoes;
	}
	
	public void inserirEditarEstacoes(Estacao est, int i) {
		this.estacoes[i] = est;
		if(i == qtdUsuarios) qtdUsuarios++;
	}
	
	public int getQtdEstacoes() {
		return qtdEstacoes;
	}
	public void setQtdEstacoes(int qtdEstacoes) {
		this.qtdEstacoes = qtdEstacoes;
	}
}
