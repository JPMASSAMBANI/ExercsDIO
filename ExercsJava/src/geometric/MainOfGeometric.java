package geometric;

//Escreva um código onde seja possível calcular a área de uma figura geométrica,
//todas devem ter um método que retorne esse valor, as formas geométricas disponiveis devem ser as seguintes:
//
//Quadrado: possui o valor dos seus lados;
//Retângulo: possui os valores de base e altura;
//Circulor: possui o atributo raio.

public class MainOfGeometric {
	
	public static void AreaShapesCalc(){
		double areaQuadrado = Shapes.SQUARE.CalculateArea(5.0);
	    System.out.printf("A área do quadrado é igual a: %.2f%n", areaQuadrado);

	    double areaRetangulo = Shapes.RECTANGLE.CalculateArea(4.0, 6.0);
	    System.out.printf("A área do retângulo é igual a: %.2f%n", areaRetangulo);

	    double areaCirculo = Shapes.CIRCLE.CalculateArea(3.0);
	    System.out.printf("A área do círculo é igual a: %.2f%n", areaCirculo);
	};

}
