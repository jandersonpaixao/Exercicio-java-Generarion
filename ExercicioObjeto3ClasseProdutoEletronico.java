package exercicios;

public class ExercicioObjeto3ClasseProdutoEletronico {	
	
		public String tipoDeAparelho;
		public String tipoDeAlimentação;
		public String conexao;
		public int anoDeLancamento;
		public String estado;
		public String modelo;
		
		public ExercicioObjeto3ClasseProdutoEletronico(String tipoDeAparelho,String tipoDeAlimentação,int anoDeLancamento) {
			
			this.tipoDeAparelho = tipoDeAparelho;
			this.tipoDeAlimentação = tipoDeAlimentação;
			this.anoDeLancamento = anoDeLancamento;
			
		}

		
		
		public String getEstado() {
			return estado;
		}



		public void setEstado(String estado) {
			if(this.estado == "ligado") {
				this.liga();
			}else if(this.estado == "desligado") {
				this.desliga();
			}
			this.estado = estado;
		}



		public String getModelo() {
			return modelo;
		}



		public void setModelo(String modelo) {
			this.modelo = modelo;
		}



		public String getTipoDeAparelho() {
			return tipoDeAparelho;
		}

		public void setTipoDeAparelho(String tipoDeAparelho) {
			this.tipoDeAparelho = tipoDeAparelho;
		}

		public String getTipoDeAlimentação() {
			return tipoDeAlimentação;
		}

		public void setTipoDeAlimentação(String tipoDeAlimentação) {
			this.tipoDeAlimentação = tipoDeAlimentação;
		}

		public String getConexao() {
			return conexao;
		}

		public void setConexao(String wifi) {
			this.conexao = wifi;
		}

		public int getAnoDeLancamento() {
			return anoDeLancamento;
		}

		public void setAnoDeLancamento(int anoDeLancamento) {
			this.anoDeLancamento = anoDeLancamento;
		}
	
		public void liga() {
			System.out.println("\nLigado");
		}
		
		public void desliga() {
			System.out.println("\nDesligado");
		}
		
		public void mostraInfo() {
			System.out.println("\n==================================");
			System.out.println("\nTipo do aparelho: "+tipoDeAparelho);
			System.out.println("\nAlimentação: "+tipoDeAlimentação);
			System.out.println("\nAparelho: "+estado);
			System.out.println("\nModelo: "+modelo);
		}
		
		
			
}

