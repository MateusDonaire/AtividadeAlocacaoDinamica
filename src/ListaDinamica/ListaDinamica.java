package ListaDinamica;

public class ListaDinamica {
	private No inicio;
    private No fim;
    
    
    public ListaDinamica(){
        this.inicio = null;
        this.fim = null;
    }
    
    public boolean isEmpty(){
        return (inicio == null);
    }
    
    public void insertAtFront(String dado){
        No novoNo = new No(dado);
        if(isEmpty()){
            inicio = novoNo;
            fim = novoNo;
        }else{
            novoNo.setProxNo(inicio);
            inicio = novoNo;
        }
    }
    
    public void insertAtBack(String string){
        No novoNo = new No(string);
        if(isEmpty()){
            inicio = novoNo;
            fim = novoNo;
        }else{
            fim.setProxNo(novoNo);
            fim = novoNo;
        }
    }
     
    public void print(){
        if (isEmpty()){
            System.out.println("Lista Vazia");
        }else{
            No auxiliar = inicio;
            while(auxiliar != null){
                System.out.println(auxiliar.getDado());
                auxiliar = auxiliar.getProxNo();
            }
        }
    }
    
  
  
 
   
    
    public int size(){
        // contador
        int contador = 0;
        // percorrer a lista
        No auxiliar = inicio;
        while( auxiliar != null ){
            // sempre que encontrar um no
            // incrementa o contador
            contador++;
            auxiliar = auxiliar.getProxNo();
        }
        
        // retorna a contagem
        return contador;
    }
}
