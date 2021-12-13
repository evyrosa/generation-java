package exercicios_Java_lista3;

public class Exercicio_1 {

	public static void main(String[] args) {
		//Laço for: Variável de controle | Condição pra repetição | Incremento

		for (int cont = 1000 ; cont <= 1999 ; cont ++) {
			
			// IF: se cont dividido por 11 da resto 5

			if (cont % 11 == 5 ) {
				System.out.println( cont + " ");
				
			}
		}
			
	}

}
