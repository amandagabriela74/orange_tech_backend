package metodos;

//classe principal

public class Main {

	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		
		//Calculadora 
		System.out.println("Calculadora");
		Ex1_CalculadoraDoisParam.soma(1,4);
		Ex1_CalculadoraDoisParam.subtracao(5,8);
		Ex1_CalculadoraDoisParam.multiplicacao(8, 7);
		Ex1_CalculadoraDoisParam.divisao(2, 7);
		
		//QUADRILATERO
		System.out.println("Quadrilatero");
		double areaQuadrado = Ex_2Quadrilatero.area(5);
		System.out.println("Área do quadrado:" + areaQuadrado);
		
		double areaRetangulo = Ex_2Quadrilatero.area(5, 5);
		System.out.println("Área do retângulo:" + areaRetangulo);
		
		double areaTrapezio = Ex_2Quadrilatero.area(5, 9, 2);
		System.out.println("Área do trapézio:" + areaTrapezio);
		
		double areaLosango = Ex_2Quadrilatero.area(8, 9);
		System.out.println("Área do losango:" + areaLosango);

	}

}
