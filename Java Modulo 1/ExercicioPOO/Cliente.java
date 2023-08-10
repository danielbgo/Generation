package ExerciciosJava;

public class Cliente {
//		declaração de objetos
		private String nomeCliente;
		private String endereco;
		private int altura;
		private int iddCliente;
		private int telefone;
		
		
//		metodo construtor
		public Cliente(String nomeCliente, String endereco, int altura, int iddCliente, int telefone) {
			super();
			
//			inicializando os atributos
				this.nomeCliente = nomeCliente;
				this.endereco = endereco;
				this.altura = altura;
				this.iddCliente = iddCliente;
				this.telefone = telefone;
			}

//		GETs e SETs


		public String getNomeCliente() {
			return nomeCliente;
		}


		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}


		public String getEndereco() {
			return endereco;
		}


		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}


		public int getAltura() {
			return altura;
		}


		public void setAltura(int altura) {
			this.altura = altura;
		}


		public int getIddCliente() {
			return iddCliente;
		}


		public void setIddCliente(int iddCliente) {
			this.iddCliente = iddCliente;
		}


		public int getTelefone() {
			return telefone;
		}


		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
			

		public void imprimirInfo() {
			System.out.println("\nNome do Cliente: "+getNomeCliente()+
					"\nEndereço do Cliente: "+getEndereco()+
					"\nAltura do Cliente (em centímetros): "+getAltura()+
					"\nIdade do Cliente: "+getIddCliente()+
					"\nTelefone do cliente: "+getTelefone());
		}


}
