package exercicios;

public class ExercicioObjeto6ClasseContaBancaria {
	private String titular;
	private double saldo;
	private int agencia; 
	private int numero;
	private String cpf;
	private static int total;
	
	public ExercicioObjeto6ClasseContaBancaria(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	
	
	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		ExercicioObjeto6ClasseContaBancaria.total = total;
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	
}
