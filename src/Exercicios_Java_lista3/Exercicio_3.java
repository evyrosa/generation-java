package Exercicios_Java_lista3;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		int idade = 0 , menos21 = 0 , mais50 = 0;
		
		Scanner leia = new Scanner (System.in) ;
		
		// Enquanto idade for diferente de -99 (atualmente vale zero)

		while ( idade != -99 ) {
			System.out.println(" Insira a idade: ");
			
			idade = leia.nextInt() ;
			
			if (idade < 21) {
				menos21++ ; 
			} else if ( idade > 50) {
				mais50++ ;
				
			}
		} System.out.println( " Os menores de 21 anos são:  " + menos21);
		
		System.out.println(" Os maiores de 50 anos são: " + mais50);
		
		leia.close();
		

		
	
		
		
		
		

	}

}
