package exercicios;

import java.util.Scanner;

public class Exercicio6DoWhileMultiplosDeTres {
	public static void main(String[] args) {
		int num, somaMult3=0,contMult3=0;
		
		float media;
		
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("\nentre com um número");
			System.out.println("\n===Digite 0 para sair do sistema===");
			num = leia.nextInt();
			if(num==0) {
				System.out.println("\nfinalizando o sistema");
			}else {
				if(num%3==0) {
					somaMult3+=num;
					contMult3++;
				}
			}
			
			
		}while(num!=0);
		
		media = somaMult3 / contMult3;
		System.out.printf("\nMédia dos números multiplos de 3 %6.2f",media);
		
	}
}
