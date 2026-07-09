package org.massambani;

import java.util.Scanner;

public class Impar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número (Início):");
        var num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o segundo número (Fim):");
        var num2 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Digite a opção (PAR ou IMPAR):");
        var opcao = sc.nextLine().trim();
        
        // Descobre dinamicamente quem é o menor e quem é o maior para criar o intervalo correto
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);
        
        System.out.println("\n--- Resultados encontrados no intervalo de " + inicio + " a " + fim + " ---");
        
        for (int i = inicio; i <= fim; i++) {
            
            if (opcao.equalsIgnoreCase("par")) {
                // Verifica se o número atual 'i' é par
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            } else if (opcao.equalsIgnoreCase("impar")) {
                // Verifica se o número atual 'i' é ímpar (trata também negativos)
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        
        sc.close(); // Boa prática: fechar o recurso do Scanner
    }
}