package bicigama;

public class Corrida {
	
	private String horaPart;
	private String horaCheg;
	private Usuario usuario;
	
	public Corrida(String p, String c, Usuario u) {
		p=horaPart;
		c=horaCheg;
		u=usuario;
	}

	public String getHoraPart() {
		return horaPart;
	}

	public void setHoraPart(String horaPart) {
		this.horaPart = horaPart;
	}

	public String getHoraCheg() {
		return horaCheg;
	}

	public void setHoraCheg(String horaCheg) {
		this.horaCheg = horaCheg;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
