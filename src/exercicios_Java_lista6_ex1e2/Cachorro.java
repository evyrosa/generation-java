package exercicios_Java_lista6_ex1e2;

public class Cachorro extends Animal{

	public Cachorro(String name, int idade) {
		super(name, idade);
		
	}
	
	public void emitirSom () {
		System.out.println("*Latindo*");
	}
	
	public void correr() {
		System.out.println("*Correndo*");
	}

}
