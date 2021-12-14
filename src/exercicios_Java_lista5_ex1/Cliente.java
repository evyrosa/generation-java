package exercicios_Java_lista5_ex1;

public class Cliente {
	
	private String nome;
	private double saldo;
	
	public Cliente(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void comprar(double preco) {
		if (preco < saldo) {
		saldo -= preco;
		} else {
			System.out.println(" saldo insuficiente");
		}
	}	
}
