import java.util.Scanner;

public class ExercicioExtra2DiasEmAnos {
	
}
	public static void main(String[] args) {
		int totalDias,anos, meses,dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o total de dias vividos: ");
		totalDias = leia.nextInt();
		anos = totalDias / 365;
		meses = (totalDias % 365) / 30;
		dias = (totalDias % 365) % 30;
		System.out.println("\nVocê viveu: " + anos + " anos(s),"+ meses +" mes(ses) e " + dias + " dia(s)" );
		
	}
