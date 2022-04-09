package exercicios;

public abstract class ExercicioPOOHeranca1Animal {
	
	
	private String tipoAnimal;
	
	public ExercicioPOOHeranca1Animal (String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	abstract public void nome(String nomeAnimal);
	abstract public void idade(int idadeAnimal);
	abstract public void som(String somAnimal);

	
	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	
	}
	 
	 
	 
	 
	 
	 
	 
	 

