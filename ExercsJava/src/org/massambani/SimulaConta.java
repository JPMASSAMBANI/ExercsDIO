package org.massambani;

import java.util.Scanner;

public class SimulaConta {

	public static void Simulacao() {
		
		var sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome e o tipo de conta a ser criada: ");
		var input = sc.nextLine();
		String[] partes = input.split(" ");
		
		String nome = partes[0];
		String conta = partes[1];
		
		if(conta.equalsIgnoreCase("corrente") || conta.equalsIgnoreCase("poupanca") || conta.equalsIgnoreCase("investimento")) {
			System.out.printf("Bem-vindo(a), %s! Sua conta %s esta pronta para uso.", nome, conta);
		}
		else {
			System.out.println("Tipo de conta invalido.");
		}
		
		
		sc.close();
	}

		

}
