package ContaBanco;

public class Request {

	private Conta conta;
	private Double requestValue;
	
	public Request(Conta conta, Double requestValue) {
        this.conta = conta;
        this.requestValue = requestValue;
    }
	
	public void withdrawal() {
		if(requestValue <= conta.getBalance()) {
			conta.setBalance(conta.getBalance() - requestValue);
			System.out.println("Saque realizado. Novo saldo : ");
			System.out.println(conta.getBalance());
		}
		else if (requestValue > conta.getBalance() ) {
			var shortfall =  Math.abs( conta.getBalance() - requestValue);
			
			if (shortfall <= conta.getOverdraft()) {
				conta.setOverdraft(conta.getOverdraft() - shortfall);
				conta.setOutstanding(conta.getOutstanding() + (shortfall * 0.2));
				conta.setBalance((conta.getBalance() + shortfall) - requestValue); 
				System.out.println("Saque realizado. Novo saldo : ");
				System.out.println(conta.getBalance());
			}
			else {
				System.out.println("Valor excede saldo em conta.");
				System.out.println("Impossivel utilizar cheque especial.");
			}
		}
		
	}
	
}
