package modelo;

import java.sql.Date;

public class PAnual implements IPlanoEmpr{
    
    protected String nome;
    protected Date dataVenc;
    protected Date dataPgt;
    
    @Override
    public void cadastrarEmp() { 
        // TODO Auto-generated method stub 
        
    }

    @Override
    public void exclEmp() {
        // TODO Auto-generated method  stub
        
    }

    @Override
    public void atualizEmp() { 
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public boolean verifEmp() {
		return false;
        // TODO Auto-generated method stub
    }
}