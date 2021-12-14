package exercicios_Java_lista5_ex6;

public class Programa {

	public static void main(String[] args) {

		Conta conta = new Conta(12, "João", 500.0);
		
		System.out.println(" nome: " + conta.getNomeCliente());
		System.out.println(" id cliente: " + conta.getId());
		System.out.println(" saldo: " + conta.getSaldo());
		
		conta.deposito(1000);
		
		System.out.println(" nome: " + conta.getNomeCliente());
		System.out.println(" id cliente: " + conta.getId());
		System.out.println(" saldo: " + conta.getSaldo());
		
		conta.saque(400);
		System.out.println(" nome: " + conta.getNomeCliente());
		System.out.println(" id cliente: " + conta.getId());
		System.out.println(" saldo: " + conta.getSaldo());
	}

}
