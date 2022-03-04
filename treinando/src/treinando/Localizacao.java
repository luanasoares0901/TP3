package treinando;

public class Localizacao {
	
	private String cidade;
	private String estado;
	private String setor;
	private String complemento;
	private int quadra;
	private int numero;
	private double cep;
	
	
	public Localizacao(String c, String e, String s, String k, int q, int n, double p ){
		c=cidade;
		e=estado;
		s=setor;
		k=complemento;
		q=quadra;
		n=numero;
		p=cep;
		
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public int getQuadra() {
		return quadra;
	}


	public void setQuadra(int quadra) {
		this.quadra = quadra;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getCep() {
		return cep;
	}


	public void setCep(double cep) {
		this.cep = cep;
	}
	
	

}
