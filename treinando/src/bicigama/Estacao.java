package bicigama;

public class Estacao {
	
	private Localizacao local;
	private int idLocal;
	private Bicicleta bike;
	private boolean limite;
	
	
	
	public Estacao(Localizacao l, int i, Bicicleta b, boolean m ) {
		l=local;
		i=idLocal;
		b=bike;
		m=limite;
	}



	public Localizacao getLocal() {
		return local;
	}



	public void setLocal(Localizacao local) {
		this.local = local;
	}



	public int getIdLocal() {
		return idLocal;
	}



	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}



	public Bicicleta getBike() {
		return bike;
	}



	public void setBike(Bicicleta bike) {
		this.bike = bike;
	}



	public boolean isLimite() {
		return limite;
	}



	public void setLimite(boolean limite) {
		this.limite = limite;
	}
	
	

}
