package exercicios;

public class ExercicioPOOHeranca1Preguica extends ExercicioPOOHeranca1Animal{
	
	private String especie;
	private String alimento;
	
	public ExercicioPOOHeranca1Preguica(String animal, String nome, int idade, String som, String locomocao,
			String especie, String alimento) {
		super(animal, nome, idade, som, locomocao);
		this.especie = especie;
		this.alimento = alimento;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	
	public void mostrapreguica() {
		System.out.println("\nAnimal: "+getAnimal()+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nTipo de som que emite: "+getSom()+"\nLocomoção"+getLocomocao()+"\nEspecie: "+especie+"\nalimentação: "+alimento);
	}
	
	
	

}
