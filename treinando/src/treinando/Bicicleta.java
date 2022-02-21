package treinando;

public class Bicicleta {
	
	private int id; 
	private String local; 
	private boolean status;
	
	
	public Bicicleta(int i, String l, boolean s) { //construtor
		id=i;
		local=l;
		status=s;
	}
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getLocal() {
		return local;
	}



	public void setLocal(String local) {
		this.local = local;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}


}
