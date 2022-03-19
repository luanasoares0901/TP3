package modelo;

import java.util.Date;

public class UserExperimental extends Pessoa {

	public boolean emCorrida;
	
	public UserExperimental(int i, String n, String m, long c, Date d, long t, String e, long s, boolean co) {
		super(i, n, m, c, d, t, e, s);
		co=emCorrida;
	}
	
	public boolean getEmCorrida() {
		return emCorrida;
	}

	public void setEmCorrida(boolean emCorrida) {
		this.emCorrida = emCorrida;
	}


}
