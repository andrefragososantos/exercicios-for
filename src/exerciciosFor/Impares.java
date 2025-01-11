package exerciciosFor;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		/* Leia um valor inteiro X(1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive 
		 * o X, se for o caso. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro de 1 até 1000: ");
		int x = entrada.nextInt();
		
		for (int i = 1; i <= x; i += 2) {
			System.out.println(i);
		}
		
		
		entrada.close();

	}

}
