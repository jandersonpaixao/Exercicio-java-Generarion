package exercicios;

public class ExercicioPOOHeranca1Cavalo extends ExercicioPOOHeranca1Animal {
	
	public ExercicioPOOHeranca1Cavalo() {
		super("tipo animal: Cavalo");
	}
	
	@Override
	public void nome(String nomeAnimal) {
		System.out.println("\nNome do Cavalo: "+nomeAnimal);
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
		System.out.println("\nEste cavalo adora correr na fazenda");
	}
	

}
