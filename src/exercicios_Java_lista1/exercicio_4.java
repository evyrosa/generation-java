package exercicios_Java_lista1;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		// ler três inteiros e positivos
		// calcular a expressão
		Scanner leia = new Scanner (System.in);
		
		int a, b, c; 
		
		System.out.println(" digite o valor de a: ");
		a = leia.nextInt();
		
		System.out.println(" digite o valor de b: ");
		b= leia.nextInt();
		
		System.out.println(" digite o valor de c: ");
		c= leia.nextInt();
		
		/// pra ser positivo tem que ser maior que zero: --> if; else if; else
		
		/*if (a > 0 && b >0 && c >0) {
			double d, r, s;
			r = Math.pow((a + b), 2);
			s= Math.pow((b + c), 2);
			d= (r + s) / 2 ; // --> divisão e multiplicação vem antes da soma e multiplicação
			System.out.println(" o valor de D é: " + d);
			
			
			
			} else {
				System.out.println("ERRO! escolha um número positivo: ");
			}*/
		// enquanto
		while (a <=0 || b <=0 || c<= 0) {
			System.out.println("ERRO! escolha um número positivo: ");
			
			System.out.println(" digite o valor de a: ");
			a = leia.nextInt();
			
			System.out.println(" digite o valor de b: ");
			b= leia.nextInt();
			
			System.out.println(" digite o valor de c: ");
			c= leia.nextInt();
			
		
			
		} 
		
		double d, r, s;
		r = Math.pow((a + b), 2);
		s= Math.pow((b + c), 2);
		d= (r + s) / 2 ; // --> divisão e multiplicação vem antes da soma e multiplicação
		System.out.println(" o valor de D é: " + d);
		
		
		
		
		
		leia.close();
		
		
		
		

	}

}
