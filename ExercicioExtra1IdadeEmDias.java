package exercicios;

import java.util.Scanner;

public class ExercicioExtra1IdadeEmDias{



 public static void main(String[] args) {
	
	 int dia,mes,ano,idade,total;
	 
	 Scanner leia = new Scanner(System.in);
	 
	 System.out.println("\nInforme o dia em que você nasceu: ");
	 dia = leia.nextInt();
	 System.out.println("\nInforme o mês: ");
	 mes = leia.nextInt();
	 System.out.println("\nInforme o ano: ");
	 ano = leia.nextInt();
	 idade = 2022 - ano;
	 total = (idade*365) + (mes*30) + dia;
	 System.out.println(idade);
	 System.out.println("\nVocê tem "+ total + "dias de vida");
	 
	 
	 
 }
}

