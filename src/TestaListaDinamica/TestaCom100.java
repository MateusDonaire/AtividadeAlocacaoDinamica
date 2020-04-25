package TestaListaDinamica;

import ListaDinamica.ListaDinamica;

public class TestaCom100 {

	public static void main(String[] args) {
		ListaDinamica listaDinamica = new ListaDinamica();

		long initialTime = System.currentTimeMillis();
		System.out.println("****************************");
		System.out.println("**** ALOCAÇÃO DINÂMICA ****");
		System.out.println("****************************\nCriando Lista...\n");
		

		for (int i = 0; i < 100; i++) {
			listaDinamica.insertAtBack("Hello Word!");
		}
	
		listaDinamica.print();
		
		System.out.println();
		System.out.println("Lista criada!!\n************ FIM ***********");

		long endTime = System.currentTimeMillis(); 

		String texto = listaDinamica.toString();
		System.out.println("Tamanho da String : " + texto.length());
	    System.out.println("Tempo total em milessegundos: " + (endTime - initialTime)); 
	    System.out.println("Tempo total em segundos: " + (endTime - initialTime)/1000);  
	}

}
