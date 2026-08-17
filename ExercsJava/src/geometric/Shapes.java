package geometric;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BiFunction;

public enum Shapes {

	
	SQUARE ((lado, NaN) -> lado * lado),
	RECTANGLE ((base, altura) -> base * altura ),
	CIRCLE((raio, NaN) -> BigDecimal.valueOf(Math.PI)
			.setScale(2, RoundingMode.DOWN)
			.doubleValue() * (raio * raio) 
		  );
	
	BiFunction<Double, Double, Double> AreaRule;
	
	

	private Shapes(BiFunction<Double, Double, Double> areaRule) {
		this.AreaRule = areaRule;
	}

	public Double CalculateArea(Double v1, Double v2) {
		return this.AreaRule.apply(v1, v2);
	}
	
	public Double CalculateArea(Double v1) {
		return this.CalculateArea(v1, 0.0);
	}
	
	
}
