package TestaString;

public class TestaCom1000000 {
	public static void main(String[] args) {

		long initialTime = System.currentTimeMillis();
		String texto = "";

		System.out.println("****************************");
		System.out.println("***** ALOCA��O EST�TICA ****");
		System.out.println("****************************\nCriando String...\n");

		for (int i = 0; i < 100000; i++) {
			texto += " Hello Word!\n";
		}
		System.out.println(texto);
		System.out.println();
		System.out.println("String Criada!!\n************ FIM ***********\n");

		long endTime = System.currentTimeMillis();

		System.out.println("Tamanho da String : " + texto.length());

		System.out.println("Tempo total em milessegundos: " + (endTime - initialTime));
		System.out.println("Tempo total em segundos: " + (endTime - initialTime) / 1000);
	}
}
