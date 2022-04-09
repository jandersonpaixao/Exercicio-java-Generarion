package exercicios;

public class ExercicioPOOHeranca1Cachorro extends ExercicioPOOHeranca1Animal{
	
	public ExercicioPOOHeranca1Cachorro() {
		super("tipo animal: cachorro");
	}
	
	@Override
	public void nome(String nomeAnimal) {
		System.out.println("\nNome do cachorro: "+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal) {
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void som(String somAnimal) {
		System.out.println("\ntipo de som que emite: "+somAnimal);
	}
	
	public void corre() {
		System.out.println("\nEste cachorro adora correr no quintal");
	}
	
}
