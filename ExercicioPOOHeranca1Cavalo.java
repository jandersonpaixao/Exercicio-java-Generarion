package exercicios;

public class ExercicioPOOHeranca1Cavalo extends ExercicioPOOHeranca1Animal {
	
	private String raca;
	private String porte;

	
	public ExercicioPOOHeranca1Cavalo(String animal, String nome, int idade, String som, String locomocao, String raca,
			String porte) {
		super(animal, nome, idade, som, locomocao);
		this.raca = raca;
		this.porte = porte;
		
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}


	
	public void mostracavalo() {
		System.out.println("\nAnimal: "+getAnimal()+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nTipo de som que emite: "+getSom()+"\nCorre em"+getLocomocao()+"\nRaça: "+raca+"\nPorte: "+porte);
	}
	

}
