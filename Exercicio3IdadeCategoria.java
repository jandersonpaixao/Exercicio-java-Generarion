package exercicios;

import java.util.Scanner;

public class Exercicio3IdadeCategoria {
	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Informe a sua idade para saber sua categoria:");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14 ) {
			System.out.println("\nVoc� est� na categoria infantil");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("\nVoc� est� na categoria Juvenil");
		}else if(idade >= 18 && idade <=25) {
			System.out.println("\nVoc� est� na categiria Adulto");
		}else {
			System.out.println("\nInfelizmente n�o temos a sua categoria");
		}
		
	}
}
