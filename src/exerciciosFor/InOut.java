package exerciciosFor;

import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
		
		/* Leia um valor inteiro N. Este valor será a quantidade de valores X que serão lidos em seguida.
		 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 
		 * use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de números a serem digitados: ");
		int n = entrada.nextInt();
		System.out.println();
		
		int in = 0;
		int out = 0;
		
		for (int i = 1; i <= n; i++) {
			int x = entrada.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		entrada.close();

	}

}
