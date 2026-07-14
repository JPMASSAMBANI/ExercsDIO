package ContaBanco;

import java.util.Scanner;

//Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
//Consultar saldo
//consultar cheque especial
//Depositar dinheiro;
//Sacar dinheiro;
//Pagar um boleto.
//Verificar divida da conta.
//Siga as seguintes regras para implementar
//
//A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
//O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
//Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
//Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
//Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
public class Main {

	public static void main(String[] args) {
		
		final String MI1 = "==========================";
		final String MI2 = "SISTEMA BANCARIO";
		final String MI3 = "ESCOLHA UMA OPCAO: ";
		final String MENU_SALDO = "1. Consultar saldo";
		final String MENU_CHEQUE = "2. Consultar cheque especial";
		final String MENU_DEPOSITO = "3. Depositar dinheiro";
		final String MENU_SAQUE = "4. Sacar dinheiro";
		final String MENU_BOLETO = "5. Pagar um boleto";
		final String MENU_DIVIDA = "6. Verificar divida da conta";
		final String MENU_SAIR = "0. Sair";
		
		var sc = new Scanner(System.in);
		Conta c = new Conta();
		c.criarConta();
		int option;
		do {
			System.out.println(MI1);
			System.out.println(MI2);
			System.out.println(MI1);
			System.out.println(MI3);
			System.out.println(MENU_SALDO);
			System.out.println(MENU_CHEQUE);
			System.out.println(MENU_DEPOSITO);
			System.out.println(MENU_SAQUE);
			System.out.println(MENU_BOLETO);
			System.out.println(MENU_DIVIDA);
			System.out.println(MENU_SAIR);
			option = sc.nextInt();
			
			switch(option) {
			
			case 1 -> c.getBalance();
			case 2 -> c.getOverdraft();
			case 3 -> {
				System.out.println("Digite o valor a ser depositado: ");
				Double amount = sc.nextDouble();
				c.setBalance(c.getBalance() + amount);
			}
			case 4 -> {
				System.out.println("Digite o valor do saque: ");
				var withdrawal2 = sc.nextDouble();
				var r = new Request(c, withdrawal2);
				r.withdrawal();
			}
			case 5 -> {
				c.getOutstanding();
				if(c.getOutstanding() > 0) {
					System.out.println("Digite o valor a pagar: ");
					Double amount = sc.nextDouble();
					c.setOutstanding(c.getOutstanding() - amount);
				}
				else System.out.println("Voce nao tem dividas em sua conta");
			}
			case 6 -> c.getOutstanding();
			}
				
		} while (option != 0);
		
		
		

	}

}
