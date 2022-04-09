package exercicios;

public class ExercicioPOOHeranca1Preguica extends ExercicioPOOHeranca1Animal{
	
	public ExercicioPOOHeranca1Preguica() {
		super("tipo animal: Cavalo");
	}
	
	@Override
	public void nome(String nomeAnimal) {
		System.out.println("\nNome da Preguiça: "+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal) {
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void som(String somAnimal) {
		System.out.println("\ntipo de som que emite: "+somAnimal);
	}
	
	public void arvore() {
		System.out.println("\nEsta preguiça adora dormir nas arvores");
	}
	
	
	

}
