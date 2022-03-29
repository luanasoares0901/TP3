package controle;
import modelo.*;

public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Usuario[] getUsuarios() {
		return this.d.getUsuarios();
	}
	
	public int getQtdUsuarios() {
		return this.d.getQtdUsuarios();
	}
	
	public int getQtdEstacoes() {
		return this.d.getQtdEstacoes();
	}
	
	public Estacao[] getEstacoes() {
		return this.d.getEstacoes();
	}
	


}