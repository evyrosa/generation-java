package exercicios_Java_lista1;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		//leia
		 Scanner leia = new Scanner (System.in);
		// o usuario coloque um dado inteiro
		
		int duracao, horas, minutos, segundos;
		//1 hora = 3600 segundos
		// 1 minutos = 60 segundos
		// 1 segundo = 1 segundo
		// escreva 
		System.out.println("Digite a duração do evento em segundos: ");
		
		// le a quantidade total de segundos
		duracao =  leia.nextInt();
		
		// calculos (mesma lógica do ex 2)
		 horas = duracao / 3600; 
		minutos = (duracao % 3600) / 60;
		segundos = (duracao % 3600) % 60; 
			
		System.out.println("Duração: " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s).");
		
		// leia
		leia.close ();

	}

}
