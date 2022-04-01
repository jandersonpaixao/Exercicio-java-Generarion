package exercicios;

import java.util.Scanner;

public class Exercicio1MaiorInteiro {
	
	public static void main(String[] args) {
		int num1,num2,num3,maior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o Primeiro numero: ");
		num1 = leia.nextInt();
		System.out.println("\nInforme o Segundo numero: ");
		num2 = leia.nextInt();
		System.out.println("\nInforme o Terceiro numero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3) {
				maior = num1;
			}else {
				maior = num3;
			}
			
		}else {
			if(num2 > num3) {
				maior = num2;
			}else {
				maior = num3;
			}
		}
		System.out.println("\nO maior número é: " + maior);
	}

}
