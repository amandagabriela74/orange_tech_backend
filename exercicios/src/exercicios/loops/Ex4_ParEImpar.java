package exercicios.loops;

import java.util.Scanner;

/*Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.*/

public class Ex4_ParEImpar {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int quantNumeros;
		int numero = 0;
		int quantPares = 0;
		int quantImpares = 0;

		System.out.println("Escolha a quantidade números que você quer utilizar : ");
		quantNumeros = s.nextInt();
		
		if (numero % 2 == 0) quantPares++;
		else quantImpares++;
		
		
		int count = 0;
		do {
			System.out.println("Digite um número: ");
			numero = s.nextInt();
			
			count++;
		} while (count < quantNumeros);

		System.out.println("Numeros pares = " + quantPares);
		System.out.println("Numeros impares = " + quantImpares);
	}

}

/*
 * for (int numero=0; numero < quantNumeros; numero++) {
 * System.out.println("Escolha seus números: "); numero = s.nextInt(); }
 */