package exercicios;

import java.util.Scanner;


public class ExercicioPOOHeranca1ExecutaAnimais {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ExercicioPOOHeranca1Cachorro cachorro = new ExercicioPOOHeranca1Cachorro();
		ExercicioPOOHeranca1Cavalo cavalo = new ExercicioPOOHeranca1Cavalo();
		ExercicioPOOHeranca1Preguica preguica = new ExercicioPOOHeranca1Preguica();
		
		ExercicioPOOHeranca1Animal animal = null;
		
		
		int x=0;
		
		do {
			System.out.println("\nqual o tipo do seu animal?\n\n");
			System.out.println("\n1- Cachorro");
			System.out.println("\n2- Cavalo");
			System.out.println("\n3- Preguiça");
			x = leia.nextInt();
			
			if(x==1) {
				
				animal = cachorro;	
				System.out.println("\nQual o nome do seu cachorro?");
				String nome = leia.nextLine();
				leia.nextLine();
				System.out.println("\nQuantos anos ele tem?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nQual o som que o seu cachorro faz?");
				String som = leia.nextLine();
				System.out.println("\n====================");
				cachorro.nome(nome);
				cachorro.idade(idade);
				cachorro.som(som);
				
			}else if(x==2) {
				animal = cavalo;
				System.out.println("\nQual o nome do seu cavalo?");
				String nome = leia.nextLine();
				leia.nextLine();
				System.out.println("\nQuantos anos ele tem?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nQual o som que o seu cavalo faz?");
				String som = leia.nextLine();
				leia.nextLine();
				System.out.println("\n======================");
				
				cavalo.nome(nome);
				cavalo.idade(idade);
				cavalo.som(som);
			}else if(x==3) {
				animal = preguica;
				System.out.println("\nQual o nome do seu cavalo?");
				String nome = leia.nextLine();
				leia.nextLine();
				System.out.println("\nQuantos anos ele tem?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nQual o som que o seu cavalo faz?");
				String som = leia.nextLine();
				leia.nextLine();
				System.out.println("\n=============================");
				preguica.nome(nome);
				preguica.idade(idade);
				preguica.som(som);				
			}else {
				System.out.println("\nOpção invalida!");
			}
			
		}while(x<=0 || x>=4);
	}

}
