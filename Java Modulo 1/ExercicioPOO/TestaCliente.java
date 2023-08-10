package ExerciciosJava;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		instanciando um objeto da classe Cliente
		
		Cliente cliente01 = new Cliente("Daniel", "Rua das mamonas", 170, 27, 988674223);
		
		cliente01.imprimirInfo();
		
	}
	PessoaFisica CPFCliente = new PessoaFisica(46986390858);
	CPFCliente.imprimirInfoCPF();
	
}
