package conta.model;

public class ContaCorrente extends Conta {
	
	private float limite;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
//	Metodo para sacar valor da conta
	@Override
	public boolean sacar(float valor) {
//		verifica se o valor do saque é menor do que o saldo Disponivel na conta
		if(this.getSaldo() + this.getLimite() < valor) {
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return false;
	}
//	Executa o metodo super.visuaizarque executa o metodo visualizar da classe conta
//	comando Super pode ser utilizado na Classe filha para chamar qualquer método da Classe pai.
	public void visualizar() {
		super.visualizar();
		System.out.println("limite de Crédito: " + this.limite);
	}

	
}
