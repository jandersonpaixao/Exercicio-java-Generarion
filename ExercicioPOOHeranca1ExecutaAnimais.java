package exercicios;

public class ExercicioPOOHeranca1ExecutaAnimais {
	 public static void main(String[] args) {
		
		 ExercicioPOOHeranca1Cachorro Cachorro = new ExercicioPOOHeranca1Cachorro("cachorro","Rex", 7, "latido", "terra", "Vira-lata", "Médio", "Alto");
		 ExercicioPOOHeranca1Cavalo Cavalo = new ExercicioPOOHeranca1Cavalo("cavalo", "Pé de pano", 17, "relincha", "Terra", "Mustangue", "Grande");
		 ExercicioPOOHeranca1Preguica Preguica = new ExercicioPOOHeranca1Preguica("Bicho Preguiça", "Marcha lenta", 43, "Som agudo", "Árvores","Preguiça-bentinho" , "Folhas");
		 
		 Cachorro.mostradivisao(); 
		 Cachorro.mostracachorro();
		
		 Cachorro.mostradivisao();
		
		 Cavalo.mostracavalo();
		 
		 Cavalo.mostradivisao();
		 
		 Preguica.mostrapreguica();
		 

	
	 
	 }
}
