package exercicios;

public class ExercicioObjeto2ClasseAviao {
	
	private String modelo;
	private int quantPoltronas;
	private String companhiaAerea;
	
	
	public ExercicioObjeto2ClasseAviao(String modelo,String companhiaAerea) {
		this.modelo = modelo;
		this.companhiaAerea = companhiaAerea;
		
	}
	
	
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getQuantPoltronas() {
		return quantPoltronas;
	}
	
	public void setQuantPoltronas(int quantPoltronas) {
		this.quantPoltronas = quantPoltronas;
	}
	
	public String getCompanhiaAerea() {
		return companhiaAerea;
	}
	
	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}
	
	public void mostraAviao() 
	{
		
		System.out.println("\nModelo: "+modelo);
		System.out.println("\nCompanhia aerea: "+ companhiaAerea);
		
		
		
		
		
		
	}
	
	

}
