package exercicios;

import java.util.Scanner;


public class Exercicio2ForParImpar {
	public static void main(String[] args) {
		int num,x,somaPar=0,somaImpar=0;
		Scanner leia = new Scanner(System.in);
		
		
		for(x=1;x<=10;x++) {
			System.out.println("\nInforme um n�mero para saber se ele � par ou �mpar: ");
			num = leia.nextInt();
			if(num %2 ==0) {
				System.out.println("\nN�mero par");
				somaPar+=num;
			}else {
				System.out.println("\nN�mero impar");
				somaImpar+=num;
			}
		}
		System.out.println("\nO a soma dos pares �: "+somaPar);
		System.out.println("\nO a soma dos impares �: "+somaImpar);
	}
}
