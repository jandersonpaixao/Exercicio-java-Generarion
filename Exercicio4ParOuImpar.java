package exercicios;

import java.util.Scanner;

public class Exercicio4ParOuImpar {
	public static void main(String[] args) {
		int num;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme um n�mero para saber se ele � par ou �mpar: ");
		num = leia.nextInt();
		if(num % 2 == 0) {
				System.out.println("\no numero � par");
				num = (int) Math.sqrt(num);
				System.out.println("\nA raiz quadrada do numero �: " + num);
			
		}else {
			System.out.println("\nO n�mero � �mpar");
			num = (int) Math.pow(num, 6);
			System.out.println("\nO numero elavado ao quadrado �: " + num);
		}
	}
}
