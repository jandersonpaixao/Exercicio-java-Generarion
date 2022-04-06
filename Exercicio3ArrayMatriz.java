package exercicios;

import java.util.Scanner;

public class Exercicio3ArrayMatriz {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		
		int[][] matriz = new int[3][3];
		
	int x,y,somaNumeros=0;	
		
		
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 3; y++) {
		System.out.println("\n entre com os numero");		
		matriz[x][y] = leia.nextInt();		
				
				if(matriz[x][y] > 10 ) {
					somaNumeros++;
				}				
			}
		}
		
		System.out.println("A quantidade de números maiores que 10 foi de "+somaNumeros);
		
	}

}

