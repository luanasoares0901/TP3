package modelo;

public class Bicicleta {
	
	private int id; 
	private Estacao estacao; 
	private boolean status;
	
	
	public Bicicleta(int i, Estacao e, boolean s) { //construtor
		id=i;
		estacao =e;
		status=s;
	}
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Estacao getEstacao() {
		return estacao;
	}



	public void setEstacao(Estacao estacao) {
		this.estacao = estacao;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}


}
