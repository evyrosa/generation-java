package exercicios_Java_lista6_ex1e2;

public class Principal {

	public static void main(String[] args) {


		Preguica preguica = new Preguica("Yo no se", 12);
		Cavalo cavalo = new Cavalo("Pocotó", 21);
		Cachorro cachorro = new Cachorro("Pingo", 4);
		
		System.out.println("Nome: " + cachorro.getName());
		System.out.println("A declarar:");
		cachorro.emitirSom();
		
		System.out.println("Nome: " + cavalo.getName());
		System.out.println("A declarar:");
		cavalo.emitirSom();
		
		System.out.println("Nome: " + preguica.getName());
		System.out.println("A declarar:");
		preguica.emitirSom();

	}

}
