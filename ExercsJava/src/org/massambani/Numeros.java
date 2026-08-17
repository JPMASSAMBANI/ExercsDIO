package org.massambani;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		var num = Integer.parseInt(sc.nextLine());
		Integer num2;
		
		for(;;) {
			System.out.println("Digite outro numero");
			num2 = Integer.parseInt(sc.nextLine());
			if (num2 < num) continue;
			if (num2 % num == 0) {
				System.out.println("Digite outro numero");
				num2 = Integer.parseInt(sc.nextLine());
			}
			else {
				break;
			}
		}
		
	}
}
