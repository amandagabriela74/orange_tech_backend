package exercicios.loops;
import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Tabuada: ");
		int tabuada = s.nextInt();
		int resultado;
		
		System.out.println("Tabuada de: " + tabuada);
		
		for(int i=0; i<=9; i++) {
			resultado = (i * tabuada);
			
			System.out.println(i + "*" + tabuada + "=" + resultado);
		}
		
	}

}
