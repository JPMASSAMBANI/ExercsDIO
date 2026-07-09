package org.massambani;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do lado de um Quadrado");
		var lado = sc.nextInt();
		
		int area = lado * lado;
		
		System.out.printf("A area do quadrado e : %s", area);
		
	}

}
