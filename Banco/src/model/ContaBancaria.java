package model;

public class ContaBancaria {

	public int numeroConta;
	public String nome;
	public double saldo;
	
	public ContaBancaria() {

	}
	
	public void RealizaDeposito(double valor) {
		saldo = saldo + valor;
	}
	
	public void realizaSaque(double valor) {
		saldo = saldo - valor;
	}
	
}
