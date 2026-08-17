package org.massambani;

import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		var peso = Float.parseFloat(sc.next());
		
		
		System.out.println("Digite sua altura: ");
		var altura = Float.parseFloat(sc.next());
		
		float imc = peso / (altura * altura);
		System.out.printf("%.1f\n",imc);
		
		if(imc<= 18.5) System.out.print("abaixo do peso");
		else if(imc>= 18.6 && imc<=24.9) System.out.print("peso ideal");
			else if(imc>= 25.0 && imc<=29.9) System.out.print("levemente acima do peso");
			else System.out.println("FORA DO PADRAO");
		
	}

}
