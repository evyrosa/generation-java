package exercicios_Java_lista4;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// Scanner
		Scanner leia = new Scanner(System.in);
				
		// Declara��o de vari�veis
		int[] numeros = new int [10];
		int maior = 0, soma = 0, media = 0, ocorrencias = 0;
						
		// Percorrer o vetor inserindo os numeros
		for (int cont = 0; cont < 10; cont++){
			System.out.println((cont + 1) + " Lan�amento: ");
					
			numeros[cont] = leia.nextInt();
						    
			soma += numeros[cont];
						    
			// Verifica o maior valor
			if(numeros[cont] > maior) {
				maior = numeros[cont];
			}
		}
						
		// Calcula a m�dia
		media = soma / 10;
						
		// Percorre de novo pra saber qtas vezes o maior aparece
		for(int cont = 0; cont < 10; cont++){
						    
			// Conta as ocorr�ncias
			if (numeros[cont] == maior){
				ocorrencias += 1;
			}
		}
						
		// Imprime na tela
		System.out.println("M�dia: " + media);
		System.out.println("\nNumero de ocorr�ncias do maior valor: " + ocorrencias);
		leia.close();

	}

}
