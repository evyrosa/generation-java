package exercicios_Java_lista4;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		// Scanner
		Scanner leia = new Scanner(System.in);
		
		// Variáveis
		int[][] matriz = new int [3][3];
		int total = 0, diagonal = 0;
				
		System.out.println("Digite os valores da matriz:");
				
		// Percorre a matriz linha a linha
		for(int linha = 0; linha < 3; linha++){
		            
			// Percorre coluna a coluna
			for(int coluna = 0; coluna < 3; coluna++){
				System.out.println("Linha: " + linha + ", Coluna: " + coluna + " -- ");
				        
				 // Armazena o valor
				 matriz[linha][coluna] = leia.nextInt();

			}
		}
				
		System.out.println("Matriz:");
				
		// Percorre a matriz linha a linha
		for(int linha = 0; linha < 3; linha++){
			System.out.println();
			        
			// Percorre coluna a coluna
			for(int coluna = 0; coluna < 3; coluna++){
				        
				// Soma cada valor junto em total
				total += matriz[linha][coluna];
				        
				// Se a linha for igual a coluna, soma o valor em diagonal
				if(linha == coluna){
					diagonal += matriz[linha][coluna];
				}
				        
				// Imprime a matriz
				System.out.print(matriz[linha][coluna] + " ");
			}
		}
				
		//  Imprime os resultados
		System.out.println("\nSoma total: " + total);
		System.out.println("Soma da diagonal: " + diagonal);
		leia.close();

	}

}
