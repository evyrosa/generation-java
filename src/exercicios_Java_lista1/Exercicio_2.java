package exercicios_Java_lista1;

import java.util.Scanner;
//inclua biblioteca matematica --> mat

public class Exercicio_2 {

	public static void main(String[] args) {
		
	
		//leia
		  Scanner leia = new Scanner (System.in);
		// o usuario coloque um dado inteiro
		
		int idadeDias, anos, meses, dias, restoano, restomes;
		//1 ano = 365 dias
		// 1 mês = 30 dias
		// 1 dia = 1 dia
		// escreva 
		System.out.println(" Digite sua idade em dias: ");
		
	  // leia (idadeDias)
		idadeDias =  leia.nextInt(); // usuario digitou 3000
		
		// 1° passo: transformar 300 em anos 
		// 3000/365 = 8,2191...> 8 anos
		anos = idadeDias/ 365; 
		// resto da divsão %
		restoano = idadeDias % 365; // --> RESTO
		// 0,2191 transformar em meses:
		meses = restoano / 30 ; 
		restomes = restoano % 30;
		
		dias = restomes; 
		
		System.out.println(" sua idade é: " + anos + "ano (s)," + meses + "meses e" + dias + "dias.");
		
		// leia
		leia.close ();
				
		
		
		
	    
	    
	    

	}

}
