package exercicios;

import java.util.Scanner;

public class Exercicio2OrdemCrescente {
	public static void main(String[] args) {
		int num1,num2,num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o Primeiro numero: ");
		num1 = leia.nextInt();
		System.out.println("\nInforme o Segundo numero: ");
		num2 = leia.nextInt();
		System.out.println("\nInforme o Terceiro numero: ");
		num3 = leia.nextInt();
		
		System.out.println("\nOs Numeros em ordem crescente são:");
		
		if(num1 > num2 && num1 > num3) {
			if(num2 > num3) {
				System.out.println(num3+", "+ num2+ ", "+ num1);
			}else {
				System.out.println(num2+", "+ num3 + ", " + num1);
			}
		if(num2 > num1 && num2 > num3) {
			if(num1 > num3) {
				System.out.println(num1+", "+num3+", "+num2);
			}else {
				System.out.println(num3+", "+ num1+ ", "+ num2);
			}
		}
		if(num3 > num1 && num3 > num2 ) {
			if(num1 > num2) {
				System.out.println(num2+", "+ num1+ ", "+ num3+", ");
			}else {
				System.out.println(num2+", "+ num2+ ", "+ num3);
			}
			
		}
			
		}

	
		
	}
}
