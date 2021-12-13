package exercicios_Java_lista4;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// Scanner
		Scanner leia =  new Scanner(System.in);
	    // Variáveis
	    double[] pontuacao = new double[5];
	    double maiorPt = 0;
	    
	    // Pede os dados
	    System.out.println("Digite cinco notas:");
		
		// Percorre o vetor acessando pelo índice
		for(int indice = 0; indice < 5; indice++){
			System.out.println("Nota " + (indice + 1) + ": ");
		    
		    // Guarda o valor na posição do índice
		    pontuacao[indice] = leia.nextDouble();
		    
		    // Se o valor atual for maior que maiorPt,
		    // guarda esse valor em maiorPt
		    if (pontuacao[indice] > maiorPt) {
		        maiorPt = pontuacao[indice];
		    }
		}
		
		// Imprime na tela
		System.out.println("\nMaior nota: " + maiorPt);
		leia.close();
	}
}