package treinando;
import java.util.Date;


public class PlanoEmpr { // esse é interface 

	protected String nome;
	protected Date dataVenc;
	protected Date dataPgt;
	
	public PlanoEmpr(String n, Date v, Date p) {
		n=nome;
		v=dataVenc;
		p=dataPgt;
	}
}
