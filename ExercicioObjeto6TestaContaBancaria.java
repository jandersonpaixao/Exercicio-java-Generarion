package exercicios;

public class ExercicioObjeto6TestaContaBancaria {

	public static void main(String[] args) {
		ExercicioObjeto6ClasseContaBancaria conta1 = new ExercicioObjeto6ClasseContaBancaria(87478,55664);
		
		
		System.out.println("============================================");
		System.out.println("Nova conta aberta Nº " + conta1.getNumero());
		conta1.setTitular("janderson paixao");
		System.out.println("nome do Cliente: " + conta1.getTitular());	
		conta1.setCpf("042004200-420");
		System.out.println("CPF: " + conta1.getCpf());
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("Novo deposito efetuado: R$8.000.00");
		
		conta1.deposita(8000);
		System.out.println("Saldo atual da conta: R$" + conta1.getSaldo());
		System.out.println("============================================");
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("----------------------------------------------");
	}

}
