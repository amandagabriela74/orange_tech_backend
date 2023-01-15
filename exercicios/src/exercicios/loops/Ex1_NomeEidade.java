package exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o 
 * segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)
 */

public class Ex1_NomeEidade {
	public static void main(String[] args) {
		// criando o objeto scanner
		Scanner s = new Scanner(System.in);

		while(true) {
			System.out.println("Digite seu nome");
			String nome = s.next();
			if (nome.equals("0")) break;

			System.out.println("Digite sua idade");
			int idade = s.nextInt();

			// imprimindo os dados obtidos pelo usuario
			System.out.println("Ola, me chamo " + nome);
			System.out.println("Tenho " + idade + " anos ");
		}
		
		System.out.println("Continua aqui..");

	}
}
