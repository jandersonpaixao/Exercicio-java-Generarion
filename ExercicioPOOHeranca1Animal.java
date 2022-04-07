package exercicios;

public class ExercicioPOOHeranca1Animal {
	
	
	 private String animal;
	 private String nome;
	 private int idade;
	 private String som;
	 private String locomocao;
	 
	 
	public ExercicioPOOHeranca1Animal(String animal, String nome, int idade, String som, String locomocao) {
		super();
		this.animal = animal;
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.locomocao = locomocao;
	}
 
	

	public String getAnimal() {
		return animal;
	}



	public void setAnimal(String animal) {
		this.animal = animal;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}


	public String getLocomocao() {
		return locomocao;
	}


	public void setLocomocao(String locomocao) {
		this.locomocao = locomocao;
	}
	
		
	
	
	
	public void mostradivisao() {
		
		System.out.println("\n*************************************************");
		System.out.println("\t====Os Animaizinhos====");
		//System.out.println("\nAnimal do tipo "+animal+"\n, Tem atualmente "+idade+" anos de vida. Tem o "+som+" como som caracteristico");
	}
	 
	 
	 
	 
	 
	 
	 
	 
}
