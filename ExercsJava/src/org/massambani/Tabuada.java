package org.massambani;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		var num = sc.nextInt();
		var calc = 1;
		
		for (var i=0; i <=10;i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}
		
	}

}
