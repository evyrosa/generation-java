package exercicios_Java_lista4;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// Scanner
		Scanner leia = new Scanner(System.in);
				
		// Declaração de variáveis
		int[] numeros = new int [10];
		int maior = 0, soma = 0, media = 0, ocorrencias = 0;
						
		// Percorrer o vetor inserindo os numeros
		for (int cont = 0; cont < 10; cont++){
			System.out.println((cont + 1) + " Lançamento: ");
					
			numeros[cont] = leia.nextInt();
						    
			soma += numeros[cont];
						    
			// Verifica o maior valor
			if(numeros[cont] > maior) {
				maior = numeros[cont];
			}
		}
						
		// Calcula a média
		media = soma / 10;
						
		// Percorre de novo pra saber qtas vezes o maior aparece
		for(int cont = 0; cont < 10; cont++){
						    
			// Conta as ocorrências
			if (numeros[cont] == maior){
				ocorrencias += 1;
			}
		}
						
		// Imprime na tela
		System.out.println("Média: " + media);
		System.out.println("\nNumero de ocorrências do maior valor: " + ocorrencias);
		leia.close();

	}

}
