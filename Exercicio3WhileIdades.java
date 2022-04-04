package exercicios;

import java.util.Scanner;

public class Exercicio3WhileIdades {
	public static void main(String[] args) {
		
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99.
		
		
		int idade=0,menos21=0, mais50=0;
		Scanner leia = new Scanner(System.in);
		
		
		while(idade!=-99) {
			System.out.println("\nEntre com as idades: ");
			idade = leia.nextInt();
			
			if(idade<=21 && idade > 0) {
				menos21++;
				
			}else if(idade>=50) {
				mais50++;
			}
			
		}
		System.out.println("\nO total de pessoas com menos de 21 anos é: "+menos21);
		System.out.println("\nO total de pessoas com mais de 50 anos é: "+mais50);
	}
}
