package exercicios_java_lista2;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		int numero1 , numero2 , numero3 ;
		
		Scanner leia = new Scanner (System.in); 
		
		System.out.println(" Digite o primeiro número: ");
		
		numero1 = leia.nextInt() ; 
		
        System.out.println(" Digite o segundo número: ");
		
		numero2 = leia.nextInt() ; 
		
		 System.out.println(" Digite o terceiro número: ");
			
		numero3 = leia.nextInt() ; 
		
		if (numero1 <= numero2 && numero2 <= numero3) {
			System.out.println(" A ordem crescente é igual a: " + numero1 + numero2 + numero3);
			
			
		} else if (numero1 <= numero3 && numero3 <= numero2) {
			System.out.println(" A ordem crescente é igual a: " + numero1 + numero3 + numero2);
			
			
		} else if (numero2 <= numero1 && numero1 <= numero3) {
			System.out.println(" A ordem crescente é igual a: " + numero2 + numero1 + numero3);
			
			
		} else if (numero2 <= numero3 && numero3 <= numero1) {
			System.out.println(" A ordem crescente é igual a: " + numero2 + numero3 + numero1);
			
			
		} else if (numero3 <= numero1 && numero1 <= numero2) {
			System.out.println(" A ordem crescente é igual a: " + numero3 + numero1 + numero2);
			
			
		} else {
			System.out.println(" A ordem crescente é igual a: " + numero3 + numero2 + numero1);
			
			
		}
		
		leia.close();
		

	}
	

}
