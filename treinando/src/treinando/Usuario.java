package treinando;
import java.util.Date;


public class Usuario {
	
	private int idUsuario;
	private String nome;
	private String nacion;
	private long cpf;
	private Date dataNasc;
	private long telefone;
	private String email;
	private long senha;
	private Cartao cartao;
	
	public Usuario(int i, String n,String m,long c,Date d,long t,String e, long s, Cartao k ) {
		idUsuario=i;
		n=nome;
		m=nacion;
		c=cpf;
		d=dataNasc;
		t=telefone;
		e=email;
		s=senha;
		k=cartao;
		
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacion() {
		return nacion;
	}

	public void setNacion(String nacion) {
		this.nacion = nacion;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getSenha() {
		return senha;
	}

	public void setSenha(long senha) {
		this.senha = senha;
	}
	
	
	

}
