package exercicios;

public class ExercicioPOOHeranca1Cachorro extends ExercicioPOOHeranca1Animal{
	
	private String raca;
	private String porte;
	private String latido;
	
	
	public ExercicioPOOHeranca1Cachorro(String animal, String nome, int idade, String som, String locomocao,
			String raca, String porte, String latido) {
		super(animal, nome, idade, som, locomocao);
		this.raca = raca;
		this.porte = porte;
		this.latido = latido;
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


	public String getLatido() {
		return latido;
	}


	public void setLatido(String latido) {
		this.latido = latido;
	}
	
	public void mostracachorro() {
		System.out.println("\nAnimal: "+getAnimal()+"\nNome: "+getNome()+"\nIdade: "+getIdade()+" \nTipo de som que emite: "+getSom()+"\nLocomoção:"+getLocomocao()+"\nRaça: "+raca+"\nPorte: "+porte+"\nLatido: "+latido);
	}
	

}
