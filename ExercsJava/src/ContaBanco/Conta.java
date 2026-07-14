package ContaBanco;

import java.util.Scanner;

public class Conta {
	
	private String name;
	
	private String accountType;
	
	private String balanceStr;
	private Double inicialBalance;
	private Double balance = 50.0;
	
	private Double overdraft;
	private Double outstanding = 0.0;
	Double percent;
     
	
	
	
	public Conta() {
		super();
	}

	public Conta(String name, String accountType, Double inicialBalance, Double balance) {
		super();
		this.name = name;
		this.accountType = accountType;
		this.inicialBalance = inicialBalance;
		this.balance = balance;
	}

	public void criarConta() {
		
		var sc = new Scanner(System.in);

		System.out.println("Bem vindo ao sistema, insira seu nome, saldo a depositar (xx.xx) e o tipo de conta a ser criada: ");
		System.out.println("(corrente, poupanca ou investimento");
		var input = sc.nextLine();
		String[] parties = input.split(" ");
		
		setName(parties[0]) ;
		setBalanceStr(parties[1]) ;
		
		if(parties[2].equalsIgnoreCase("corrente") || parties[2].equalsIgnoreCase("poupanca") || parties[2].equalsIgnoreCase("investimento")) {
			setAccountType(parties[2]);
		}
		else {
			System.out.println("Tipo de conta invalido.");
		}
		
		setInicialBalance(Double.parseDouble(balanceStr));
		setBalance(inicialBalance);
		
		defOverdraft();
		System.out.println("Su cheque especial e de R$: " + this.overdraft);
		
	}

	public void defOverdraft() {
		if (inicialBalance <= 500) {
			this.overdraft = 50.0 ;
		}
		else {
			percent = inicialBalance * 0.5;
			this.overdraft = (inicialBalance - percent);
		}
	}
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBalanceStr() {
		return balanceStr;
	}

	public void setBalanceStr(String balanceStr) {
		this.balanceStr = balanceStr;
	}

	public Double getBalance() {
		System.out.println("Saldo em conta" + balance);
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getOverdraft() {
		System.out.println("Utilizando cheque especial valor restante: ");
		System.out.println(overdraft);
		return overdraft;
	}

	public void setOverdraft(Double overdraft) {
		this.overdraft = overdraft;
	}

	public Double getInicialBalance() {
		return inicialBalance;
	}

	public void setInicialBalance(Double inicialBalance) {
		this.inicialBalance = inicialBalance;
	}

	public Double getOutstanding() {
		if(outstanding > 0) {
			System.out.println("Voce tem dividas pendentes no valor de: " + outstanding);
		}
		else {
			System.out.println("Voce nao tem dividas em sua conta");
		}
		
		return outstanding;
	}

	public void setOutstanding(Double outstanding) {
		this.outstanding = outstanding;
	}
	
	
	
	
	
	
	
}
