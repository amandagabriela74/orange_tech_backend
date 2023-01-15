package exercicios.loops;
import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior número e a média desses números. */

public class Ex3_Maior_e_Media {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;

		int count =0;
		do {
			System.out.println("Digite um número: ");
			numero = s.nextInt();
			
			soma += numero;
			System.out.println("Soma: " + soma);
			
			if (numero > maior) maior = numero;
			
			count++;
		}while (count < 5);
		
		System.out.println("Maior número: "+ maior);
		System.out.println("Média dos números: "+ soma/count);
	}

}
