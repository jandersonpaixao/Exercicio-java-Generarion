package exercicios;

import java.util.Scanner;

public class Exercicio1Array {
	public static void main(String[] args) {
		
		int[] A = {1,0,5,-2,-5,7};
		
		int resultado,x;
		resultado = A[0]+A[1]+A[5];
		A[3]=100;
		
		for(x=0;x<6;x++) {
			System.out.println("\nArray A"+A[x]);
			
		}
		
		System.out.println("\n\nResultado: "+ resultado);
		
		
		
		
		
		//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		//(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
		///A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		//(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
		//(d) Mostre na tela cada valor do vetor A, um em cada linha.

		
		
	}
}
