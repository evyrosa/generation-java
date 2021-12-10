package Exercicios_Java_lista3;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero , soma = 0 ; 
		
		do { 
			System.out.println( " digite um número: ");
			numero = leia.nextInt() ;
			soma += numero ;
			
		
		} while ( numero != 0 );
		
		System.out.println(" a soma é : " + soma);
		
		leia.close();
	}

}
