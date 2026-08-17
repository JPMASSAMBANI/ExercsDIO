package Cinema;

import java.util.Scanner;

public final class MainOfCinema {

	public static void CinemaMain() {
	//Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema.
	//O ingresso deve ter um valor,nome do filme e informar se é dublado ou legendado.
	//A partir desse ingresso devem ser criados os tipos Meia entrada e ingresso família.
	//Cada ingresso deve ter um método que retorna o seu valor real(baseado no valor informado na criação do ingresso)
	//para os de meia entrada o seu valor deve ser de metade do valor,
	//para os ingressos família deve-se retornar o valor multiplicado pelo número de pessoas e fornecer um desconto de 5%
	//quando o número de pessoas for maior que 3.
		Familia familia = new Familia();

		MeiaEntrada meia = new MeiaEntrada();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tipo do ingresso desejado: (MEIA(1) ou FAMILIA(2)");
		int tipo = sc.nextInt();
		System.out.println("Digite a quantidade desejada: ");
		familia.setAmount(sc.nextInt());
		
		switch (tipo) {
		case 1 -> {
			meia.FinalValue();
			System.out.println("Valor do ingresso: " + meia.getValue());
		}
		
		case 2 -> {
			familia.FinalValue();
			System.out.println("Valor do ingresso: " + familia.getValue());
		}
		
		default -> System.out.println("tipo invalido");
		}
	}
}
