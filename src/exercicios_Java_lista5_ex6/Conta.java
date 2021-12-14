package exercicios_Java_lista5_ex6;

public class Conta {
	
	private int id;
	private String nomeCliente;
	private double saldo;
	

	public Conta(int id, String nomeCliente, double saldo) {
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		if (valor < saldo) {
		saldo -= valor;
		} else {
			System.out.println(" saldo insuficiente");
		}
	}
	

}
