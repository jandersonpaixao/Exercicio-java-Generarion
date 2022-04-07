package exercicios;

public class ExercicioObjeto4ClasseFuncionario {
	
	public String nomeFuncionario;
	public int cpfFuncionario;
	public int idfuncionario;
	public double salario;
	public String funcao;
	
	
	
	
	
	
	public ExercicioObjeto4ClasseFuncionario(String nomeFuncionario, int cpfFuncionario, int idfuncionario,	double salario, String funcao) {
		
		this.nomeFuncionario = nomeFuncionario;
		this.cpfFuncionario = cpfFuncionario;
		this.idfuncionario = idfuncionario;
		this.salario = salario;
		this.funcao = funcao;
	}



	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(int cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public int getIdfuncionario() {
		return idfuncionario;
	}

	public void setIdfuncionario(int idfuncionario) {
		this.idfuncionario = idfuncionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
	public void mostrainfo() {
		System.out.println("+-------------------------------+");
		System.out.println("|=====Crachá do funcionario=====|");
		System.out.println("|Nome do funcionario: "+nomeFuncionario+" |");
		System.out.println("|ID: "+idfuncionario+"=====================|");
		System.out.println("|CPF: "+cpfFuncionario+"===================|");
		System.out.println("|Funcão: "+funcao+"============|");
		System.out.println("+-------------------------------+");
	}
	
	
	
}
