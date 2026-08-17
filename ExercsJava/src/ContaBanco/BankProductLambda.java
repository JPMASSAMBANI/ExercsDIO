package ContaBanco;

import java.util.List;



public record BankProductLambda(String name, Double maintenanceFee) {
	
	public static void services() {
		
		List<BankProductLambda> productList = List.of(new BankProductLambda("Corrente", 1.0),
													  new BankProductLambda("Poupanca", 0.5),
													  new BankProductLambda("Investimento", 1.5));
		
		productList.forEach(t -> System.out.printf("Servico: %s, Taxa: %.1f\n", t.name(), t.maintenanceFee()));
				
				
	}

	
}
