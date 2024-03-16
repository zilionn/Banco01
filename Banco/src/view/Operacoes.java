package view;

import model.ContaBancaria;

public class Operacoes {

	public static void main(String[] args) {
		ContaBancaria cont = new ContaBancaria();
		
		cont.nome = "José";
		cont.numeroConta = 12345;
		cont.saldo = 1500.00;
		
		cont.RealizaDeposito(255.25);
		System.out.println("NEW saldo após depósito: " + cont.saldo);
		
		cont.realizaSaque(1350.00);
		System.out.println("NEW saldo após saque: " + cont.saldo);
		
		System.out.println("----------------------------");
		System.out.println("CONTA: " + cont.numeroConta);
		System.out.println("TITULAR: " + cont.nome);
		System.out.println("----------------------------");

	}

}
