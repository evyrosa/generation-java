package exercicios_Java_lista6_ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<Produto> estoque = new ArrayList<>();
		
		System.out.println("Quantos produtos você quer adicionar? ");
		int numProdutos = leia.nextInt();
		leia.nextLine();
		
		for(int i = 0; i < numProdutos;i++) {
			System.out.println("Digite nome do produto: ");
			String nome = leia.nextLine();
			
			System.out.println("Digite a quatidade a ser adicionada ao estoque: ");
			int quantidade = leia.nextInt();
			
			System.out.println("Digite o preço da unidade: ");
			double preco = leia.nextDouble();
			
			Produto prod = new Produto(nome, quantidade, preco);
			
			estoque.add(prod);
		}
		
		for(Produto p: estoque) {
			System.out.println(p);
		}
		
		System.out.print("\nNumero do item a ser removido: ");
		int posicao = leia.nextInt();
		
		for(int i = 0; i < estoque.size(); i++) {
			if(posicao == (i + 1)) {
				estoque.remove(i);
				System.out.println("Item numero " + (i + 1) + " removido");
			}			
		}
		
		for(Produto p: estoque) {
			System.out.println(p);
		}
		
		leia.close();
	}

}
