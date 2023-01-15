package exercicios.loops;
import java.util.Scanner;

/*
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido 
 * e continue pedindo até que o usuário informe um valor válido.
 */

public class Ex2_Nota {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Digite sua nota: ");
		nota = s.nextInt();
		
		while (nota <0 | nota > 10) {
			
			System.out.println("NOTA INVALIDA! Digite um número entre 0 e 10 :");
			nota = s.nextInt();
			break;
		}
		System.out.println("Sua nota é " + nota);
		
		
		
	}

}
