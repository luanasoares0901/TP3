package treinando;

public class Cartao {

	private boolean statusUso;
	private boolean statusPto;
	private double numCartao;
	
	public Cartao(boolean u, boolean p, double n) {
		u=statusUso;
		p=statusPto;
		n=numCartao;
	}

	public boolean isStatusUso() {
		return statusUso;
	}

	public void setStatusUso(boolean statusUso) {
		this.statusUso = statusUso;
	}

	public boolean isStatusPto() {
		return statusPto;
	}

	public void setStatusPto(boolean statusPto) {
		this.statusPto = statusPto;
	}

	public double getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(double numCartao) {
		this.numCartao = numCartao;
	}
	
}
