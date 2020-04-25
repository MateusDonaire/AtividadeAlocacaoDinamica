package ListaDinamica;

public class No {
	 private String dado;
	    private No proxNo;
	    
	    public No(String dado2){
	        this.dado = dado2;
	        this.proxNo = null;
	    }
	    
	   
	    public void setDado(String dado){
	        this.dado = dado;
	    }
	    
	    public String getDado(){
	        return this.dado;
	    }
	    
	    public void setProxNo(No proxNo){
	        this.proxNo = proxNo;
	    }
	    
	    public No getProxNo(){
	        return this.proxNo;
	    }
}
