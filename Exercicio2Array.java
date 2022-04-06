package exercicios;

import java.util.Scanner;

public class Exercicio2Array {
	public static void main(String[] args) {
		
		int[] num = new int[6]; 
		int[] pares = new int[6];
		int[] impares = new int[6];
	
		int x, par=0, impar=0, somaPar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<4;x++) {
			
			System.out.println("\nInforme um número: ");
			num[x] = leia.nextInt(); 
			
			if(num[x]%2==0 ) {
				
				pares[par] = num[x];
				par++;
				somaPar += num[x];
				
			}else {
				impares[impar] = num[x];
				impar++;
				
			}
			
			
			
			}
		
		System.out.println("\nOs números pares foram ");
		for(x=0;x<par; x++) {
			System.out.println(pares[x]+ " ");
		}
		System.out.println("\nA soma dos pares é: "+ somaPar);
		
		System.out.println("Os numeros impares foram: ");
		for(x = 0; x < impar; x++) {
			System.out.print(impares[x]+" ");
		}
		
		System.out.println("\nA quantidade de números ímpares: "+ impar);
			
			
		}
		
	}

