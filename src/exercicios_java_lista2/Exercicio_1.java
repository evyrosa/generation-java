package exercicios_java_lista2;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		int numero1, numero2, numero3, maiorvalor = 0 ;
		
		Scanner leia = new Scanner (System.in); 
		
		System.out.println(" Digite o primeiro n�mero: ");
		
		numero1 = leia.nextInt() ; 
		
        System.out.println(" Digite o segundo n�mero: ");
		
		numero2 = leia.nextInt() ; 
		
		 System.out.println(" Digite o terceiro n�mero: ");
			
		numero3 = leia.nextInt() ; 
		
		if (numero1 > maiorvalor) {
			maiorvalor = numero1;
			
		}
		if (numero2 > maiorvalor) {
			maiorvalor = numero2 ;
				
		} 
		if (numero3 > maiorvalor) {
			maiorvalor = numero3 ;
		}
		
		System.out.println(" O maior �: " + maiorvalor) ; 
		
		leia.close();
		
		
		
		
		
		
		
		
		
		

	}

}
