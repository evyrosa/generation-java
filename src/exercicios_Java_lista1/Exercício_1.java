package exercicios_Java_lista1;

import java.util.Scanner;

public class Exerc�cio_1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// Declara��o de Vari�veis 
		int ano , mes, dias, soma = 0;
		
		System.out.println(" digite a quantidade de anos: ");	
		ano = leia.nextInt(); 
		
		System.out.println(" digite a quantidade de meses: ");	
		mes = leia.nextInt(); 
		
		System.out.println(" digite a quantidade de dias: ");	
		dias = leia.nextInt(); 
		
		soma += ano * 365;
		soma+= mes * 30; 
		soma += dias; 
		
		System.out.println("O total em dias �: " + soma); 
		
		
		leia.close();
		
	}

}
