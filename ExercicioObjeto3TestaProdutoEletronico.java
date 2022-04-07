package exercicios;

public class ExercicioObjeto3TestaProdutoEletronico {
	public static void main(String[] args) {
		
		ExercicioObjeto3ClasseProdutoEletronico tocaDisco = new ExercicioObjeto3ClasseProdutoEletronico("som", "fonte de energia", 1985);
		
		tocaDisco.setEstado("ligado");
		tocaDisco.setModelo("Gradiente");
		tocaDisco.mostraInfo();
		
	}
}
