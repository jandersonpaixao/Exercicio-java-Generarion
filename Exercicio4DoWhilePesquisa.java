package exercicios;

import java.util.Scanner;

public class Exercicio4DoWhilePesquisa {
	
	public static void main(String[] args) {
		
		int idade,genero,fp,contPc=0,contMn=0,contHa=0,contNbc=0,contPn40=0,contPc18=0,pessoas=1;
		//fp= fator psicologico; pc=pessoa calma; Mn= mulher nervosa; Nbc= nao binario; Pn40= pessoa nervosa+40; Pc18= pessoa nervosa menos 18 anos
		
		Scanner leia = new Scanner(System.in);
		
		while(pessoas <=2) {
			System.out.println("\nInforme a sua idade: ");
			idade = leia.nextInt();
			
			while(idade<1 || idade>130) {
				System.out.println("\nInforme novamente a sua idade: ");
				idade = leia.nextInt();
			}
			
			System.out.println("\nInforme seu gênero: 1-Masculuno; 2-feminino; 3-Não binário: ");
			genero = leia.nextInt();
			
			while(genero <1 || genero > 3) {
				System.out.println("\nInforme novamente seu gênero: 1-Masculuno; 2-feminino; 3-Não binário: ");
				genero = leia.nextInt();
			}
			System.out.println("\nInforme seu fator psicológico: 1-calmo 2-Nervose 3-Agressive ");
			fp = leia.nextInt();
			
			while(fp<1  || fp >3) {
				System.out.println("\nInforme novamente seu fator psicológico: 1-calme; 2-Nervose; 3-Agressive: ");
				fp = leia.nextInt();
			}
			
			if(fp==1) {
				contPc++;
			}
			if(genero==2 && fp==2) {
				contMn++;
			}
			if(genero ==1 && fp==3) {
				contHa++;
			}
			if(genero==3 && fp==1) {
				contNbc++;
			}
			if(fp==2 && idade>40) {
				contPn40++;
			}
			if(fp==1 && idade<18) {
				contPc18++;
			}
			pessoas++;
		}
		System.out.println("\nPessoas calmas: "+contPc);
		System.out.println("\nMulheres nervosas: "+contMn);
		System.out.println("\nHomens agresivos: "+contHa);
		System.out.println("\nNão binaries calmos: "+contNbc);
		System.out.println("\nPessoas nervosas com mais de 40 anos: "+contPn40);
		System.out.println("\nPessoas calmas com menos de 18 anos: "+contPc18);
	}
}
