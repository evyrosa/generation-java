package exercicios_Java_lista6_ex1e2;

public class Cavalo extends Animal{

	public Cavalo(String name, int idade) {
		super(name, idade);
	}

	public void emitirSom() {
		System.out.println("*Relinchando*");
	}
	
	public void correr() {
		System.out.println("*Correndo*");
	}
	
	
}
