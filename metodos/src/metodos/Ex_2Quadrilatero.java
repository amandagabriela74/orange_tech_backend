package metodos;

public class Ex_2Quadrilatero {
	//quadrado
	public static double area(double lado) {

       return lado * lado;
    }

	//retângulo
    public static double area(double lado1, double lado2) {

        return lado1 * lado2;
    }

    //trapézio
    public static double area(double baseMaior, double baseMenor, double altura) {

       return ((baseMaior+baseMenor)*altura) / 2;
    }

    //losango
    public static double area(float diagonal1, float diagonal2) {

        return (diagonal1 * diagonal2)/2;
    }
}

