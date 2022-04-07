package exercicios;

public class ExercicioObjeto2TestaAviao {
	public static void main(String[] args) {
		ExercicioObjeto2ClasseAviao aviao1 = new ExercicioObjeto2ClasseAviao("Boing 87-87", "Voa Voa Passarinho" );
		
		aviao1.setQuantPoltronas(250);
		aviao1.mostraAviao();
		System.out.println("\nEste avião possui "+aviao1.getQuantPoltronas()+" poltronas.");
				
	
	}

}
