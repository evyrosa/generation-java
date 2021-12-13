package exercicios_Java_lista4;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		//Scanner
		Scanner leia = new Scanner(System.in);
		
		// Declara as quatro matrizes
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
				
		//Recebe dados da matriz N1
		System.out.println("Dados da matriz N1:");
				
		// Percorre a matriz N1 armazenando os numeros
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				System.out.print("Linha: " + linha + ", Coluna: " + coluna + " -- ");
				N1[linha][coluna] = leia.nextInt();

			}
		}
				
		//Recebe dados da matriz N2
		System.out.println("Dados da matriz N2:");
				
		// Percorre a matriz N1 armazenando os numeros
		for(int linha = 0; linha < 4; linha++){
			for(int coluna = 0; coluna < 6; coluna++){
				System.out.print("Linha: " + linha + ", Coluna: " + coluna + " -- ");
				 N2[linha][coluna] = leia.nextInt();
			}
		}
				
		// Mostra a matriz M1
		System.out.println("Matriz M1");
				
		// Percorre as matrizes N1, N2 e M1,
		// somando os valores de N1 com N2 e colocando em M1
		for(int linha = 0; linha < 4; linha++){
			System.out.println();
			for(int coluna = 0; coluna < 6; coluna++){
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				      
				// Imprime os valores de M1
				System.out.print(M1[linha][coluna] + " ");
			}
		}
				
		System.out.println("\n\nMatriz M2");
				
		// Percorre as matrizes N1, N2 e M1,
		// somando os valores de N1 com N2 e colocando em M1
		for(int linha = 0; linha < 4; linha++){
			System.out.println();
			for(int coluna = 0; coluna < 6; coluna++){
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
				        
				// Imprime os valores de M2
				System.out.print(M2[linha][coluna] + " ");
			}
		}
		leia.close();

	}

}
