package exercicios;

import java.util.Scanner;

public class ExercicioExtra7REquacaoLinear {
	public static void main(String[] args) {
		double a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A ");
		a = leia.nextDouble();
		System.out.println("\nEntre com o valor de B");
		b = leia.nextDouble();
		System.out.println("\nEntre com o valor de C ");
		c = leia.nextDouble();
		System.out.println("\nEntre com o valor de D ");
		d = leia.nextDouble();
		System.out.println("\nEntre com o valor de E ");
		e = leia.nextDouble();
		System.out.println("\nEntre com o valor de F ");
		f = leia.nextDouble();
		
		x = (c*e - b*f) / (a*a - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.println("\nO valor de X é: ");
		System.out.println("\nO valor de Y é: ");
		
	}
}
