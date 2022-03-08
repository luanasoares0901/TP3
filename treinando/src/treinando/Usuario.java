package treinando;
import java.util.Date;


public class Usuario extends Pessoa {
	
	private Cartao cartao;
	
	public Usuario(int i, String n, String m, long c, Date d, long t, String e, long s, Cartao k) {
		super(i, n, m, c, d, t, e, s);
		k=cartao;
	}


	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}


}
