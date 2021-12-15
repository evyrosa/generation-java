package exercicios_Java_lista6_ex1e2;

public class Preguica extends Animal {

	public Preguica(String name, int idade) {
		super(name, idade);
		
	}
	
	public void emitirSom() {
		System.out.println("*Som de bicho preguiça*");
	}
	
	public void subir() {
		System.out.println("*Subindo na árvore*");
	}

}
