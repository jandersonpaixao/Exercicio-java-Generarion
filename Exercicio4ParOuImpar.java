package exercicios;

import java.util.Scanner;

public class Exercicio4ParOuImpar {
	public static void main(String[] args) {
		int num;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme um número para saber se ele é par ou ímpar: ");
		num = leia.nextInt();
		if(num % 2 == 0) {
				System.out.println("\no numero é par");
				num = (int) Math.sqrt(num);
				System.out.println("\nA raiz quadrada do numero é: " + num);
			
		}else {
			System.out.println("\nO número é ímpar");
			num = (int) Math.pow(num, 6);
			System.out.println("\nO numero elavado ao quadrado é: " + num);
		}
	}
}
