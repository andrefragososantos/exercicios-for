package exerciciosFor;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar N linhas,
		 * começando de 1 até N. para cada linha, mostrar o número da linha, depois o quadrado e o cubo
		 * do valor
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro positivo: ");
		int n = entrada.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.println(i * i * i);
		}
		
		entrada.close();

	}

}
