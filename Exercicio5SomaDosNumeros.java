package exercicios;

import java.util.Scanner;

public class Exercicio5SomaDosNumeros {
		public static void main(String[] args) {
			int num,contNum=0,somaNum=0;
			Scanner leia = new Scanner(System.in);
			
			do {
				System.out.println("\nInforme um número: ");
				num=leia.nextInt();
				contNum++;			
				somaNum+=num;
			}while(num != 0);
			System.out.println("\nA soma dos número informados foi: "+somaNum);
		}
}
