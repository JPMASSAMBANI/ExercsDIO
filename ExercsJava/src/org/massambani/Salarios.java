package org.massambani;

import java.util.Scanner;

public class Salarios {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
		
		double imposto, desconto;
		 
		System.out.println("Insira a base de calculo do salario: ");
		var salario = Double.parseDouble(sc.nextLine());
		
		if (salario <= 1100) {
			imposto = 0.05;
		}
		else if ((salario > 1100) && (salario <=2500)) {
			imposto = 0.1;
		}
		else {
			imposto = 0.15;
		}
		
		desconto = salario * imposto;
		
		var salarioFinal = salario - desconto;
		
		System.out.println(salarioFinal);
		
	}

}
