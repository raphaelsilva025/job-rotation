package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero que esteja na sequencia Fibonnaci :");
		int i = entrada.nextInt();

		while (i > n3) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		if (i == 0) {
			System.out.println("O numero 0 esta na sequencia Fibonnaci. \nO proximo numero é: 1");
		} else if (i == n3) {
			System.out.println("O numero " + i + " está na  sequencia Fibonnaci. \nO proximo numero é :" + (n1 + i));
		} else {
			System.out.println("Este numero nao faz parte da sequencia Fibonacci.");
		}

		entrada.close();
	}
}
