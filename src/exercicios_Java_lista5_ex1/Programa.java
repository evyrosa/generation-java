package exercicios_Java_lista5_ex1;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("maria",  500.0);
		
		
		System.out.println(" nome: " + cliente.getNome());
		System.out.println(" saldo: " + cliente.getSaldo());
		
		cliente.comprar(50);
		
		System.out.println(" saldo: " + cliente.getSaldo());
		
		cliente.comprar(800);
		
		System.out.println(" saldo: " + cliente.getSaldo());

	}

}
