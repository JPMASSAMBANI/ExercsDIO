package ContaBanco;

import java.util.List;
import java.util.function.Consumer;

public record BankProduct(String name, Double MaintenanceFee) {
	
	public static void Sevices() {
		List<BankProduct> productList  = List.of(new BankProduct("Conta Corrente", 3.0),
				new BankProduct("Cartao de Credito", 4.0), new BankProduct("Investimentos", 3.0));
		
		Consumer<BankProduct> services = new Consumer<BankProduct>() {

			@Override
			public void accept(BankProduct bp) {
				
				System.out.printf("Servico: %s, Taxa: %.1f\n", bp.name(), bp.MaintenanceFee());
				
			}
			
		};
		
		productList.forEach(services);
	}
}
