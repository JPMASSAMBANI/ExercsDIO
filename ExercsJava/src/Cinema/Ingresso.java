package Cinema;

//Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema.
//O ingresso deve ter um valor,nome do filme e informar se é dublado ou legendado.
//A partir desse ingresso devem ser criados os tipos Meia entrada e ingresso família.
//Cada ingresso deve ter um método que retorna o seu valor real(baseado no valor informado na criação do ingresso)
//para os de meia entrada o seu valor deve ser de metade do valor,
//para os ingressos família deve-se retornar o valor multiplicado pelo número de pessoas e fornecer um desconto de 5%
//quando o número de pessoas for maior que 3.
public sealed abstract class Ingresso permits MeiaEntrada, Familia {

	private Double Value = 50.0;
	
	private String MovieName;
	
	private String type;
	
	private int amount;
	
	
	
	public abstract void FinalValue();
	
	public Double getValue() {
		return Value;
	}

	public void setValue(Double value) {
		Value = value;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	
	
	
}
