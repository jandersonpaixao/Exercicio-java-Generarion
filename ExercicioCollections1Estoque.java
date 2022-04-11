package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCollections1Estoque {

	public static void main(String[] args) {
		int op;
		
		Scanner print = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		System.out.println("\t**Loja de Bicicletas**");
		
		do {
			
			System.out.println("\n\tEscolha uma opção no MENU");
			System.out.println("\n+-------------------------------------------+");
			System.out.println("\n| 1- Adicione uma nova bicicleta ao estoque |");
			System.out.println("\n| 2- Remover uma bicleta do estoque         |");
			System.out.println("\n| 3- Atualizar uma bicicleta no estoque     |");
			System.out.println("\n| 4- Mostrar bicicletas presentes no estoque|");
			System.out.println("\n| 0- Encerra o sistema                      |");
			System.out.println("\n+-------------------------------------------+");
			 op = print.nextInt();
			
			switch(op) {
			case 1:
				print.nextLine();
				System.out.println("\nAdicione uma nova bicicleta:");
				String bike = print.nextLine();
				estoque.add(bike);
				break;
			case 2:
				print.nextLine();
				System.out.println("\nRemova uma bicicleta do estoque: ");
				String delBike = print.nextLine();
				if(estoque.contains(delBike)) {
					estoque.remove(delBike);
				}else {
					System.out.println("\nBicileta não encontrada no estoque!");
					System.out.println("\nBicicletas presentes no estoque no momento: "+estoque);
				}
				break;
			
			
			case 3:
				print.nextLine();
				System.out.println("\nInforme uma bicicleta para atualizar o estoque: ");
				String verifica = print.nextLine();
				System.out.println("\nInforme uma nova bicicleta para substituir "+verifica+" :");
				String novo = print.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else {
					System.out.println("\nBicicleta não encontrada no estoque!");
					System.out.println("\nBicicletas presentes no estoque no momento: "+estoque);
				}
				break;
			case 4:
				print.nextLine();
				System.out.println("\nAs bicicletas do estoque são: ");
				System.out.println("|"+estoque+"|");
				break;
			default:
				if(op<0 || op>4) {
					System.out.println("\nOpção inválida. Digite uma nova opção");
				}else {
				System.out.println("\nFinalizando o programa!");
				}

			}
			
		}while(op !=0);

	}


	}


