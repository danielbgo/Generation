package conta.model;

public class Conta {
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
//Métodos especificos
//metodo para sacar o dinheiro da conta
	public boolean sacar(float valor) {
		if(this.getSaldo()<valor) {
			System.out.println("\nSaldo Insuficiente");
			return false;
		}
		this.setSaldo(this.getSaldo()-valor);
		return true;
	}
//Método para depositar dinheiro na conta 
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
//Método para visualizar o saldo da conta
	public void visualizar() {
		String tipo = "";
		
		switch(this.tipo) {
		case 1: tipo = "Conta Corrente"; 
			break;
		case 2: tipo = "Conta Poupança"; 
			break;
		}
		System.out.println("\n\n*************************************************");
		System.out.println("Dados da conta: ");
		System.out.println("*************************************************");
		System.out.println("Numero da conta: "+this.numero);
		System.out.println("Agência: "+this.agencia);
		System.out.println("Tipo da conta: "+tipo);
		System.out.println("Titular da conta: "+this.titular);
		System.out.println("Saldo da conta: "+this.saldo);
	}
	
}
