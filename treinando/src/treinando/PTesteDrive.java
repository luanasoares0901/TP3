package treinando;

//import java.sql.Date;

public class PTesteDrive implements IPlanoEmpr {
	
	protected String nome;
	private boolean testeDisponivel;
	public int qntdCorridas;
	
		
	@Override 
	public void cadastrarEmp() { 
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exclEmp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizEmp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifEmp() {
		verifQntdCorridas(testeDisponivel,qntdCorridas);
		return false;
	}
	
	private void verifQntdCorridas(boolean testeDisponivel, int qntdCorridas) {
		if(qntdCorridas>0) {
			testeDisponivel=false;
		}
	}

}
