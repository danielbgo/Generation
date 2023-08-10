package ExerciciosJava;

public class PessoaFisica extends Cliente{

	private int cpfCliente;

	public PessoaFisica(String nomeCliente, String endereco, int altura, int iddCliente, int telefone, int cpfCliente) {
		super(nomeCliente, endereco, altura, iddCliente, telefone);
		this.cpfCliente = cpfCliente;
	}

	public int getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public void imprimirinfoCPF() {
		System.out.println("Nome do Cliente PEssoa Fisica: "+getNomeCliente()+"CPF do cliente: "+getCpfCliente());
	}
}
