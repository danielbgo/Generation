package ExerciciosJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_Fila01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<>();
		
		Scanner ler = new Scanner(System.in);
		int opcao;
		String cliente;
		
		System.out.println("**************************************************************"); 
		System.out.println(                                                                );
		System.out.println("             1 - Adicionar Cliente na Fila                    ");
		System.out.println("             2 - Listar Todos os clientes da Fila             ");
		System.out.println("             3 - Retirar Cliente da Fila                      ");
		System.out.println("             0 - Sair                                         ");
		System.out.println("                                                              ");
		System.out.println("**************************************************************");
		System.out.println("             Entre com a Opcao Desejada:                      ");
	
		opcao = ler.nextInt();
		
		fila.add("Pedro");
		fila.add("Matheus");
		fila.add("Jorge");
		fila.add("Carlos");
		
		
		switch (opcao) {
		case 1:
			System.out.println("\nEssa é a fila atual: "+fila);
			System.out.println("\nOpção 1: Adicionar Cliente na Fila");
			System.out.println("\nDigite o que quer adicionar na fila: ");
				cliente = ler.next();
				fila.add(cliente);
			System.out.println(cliente+" foi adicionado a lista");
			System.out.println("\nEssa é a fila atualizada: "+fila);
			break;
		case 2:
			System.out.println("\nOpção 2: Listar Todos os Clientes da Fila");
			System.out.println("\nEsses são os elementos da Fila: "+fila);
			break;
		case 3:
			System.out.println("\nOpção 3: Retirar clientes da Fila");
			System.out.println("\nEssa é a Fila atual: "+fila+"\nDeseja retirar qual nome da fila?");
			cliente = ler.next();	
			fila.remove(cliente);
			System.out.println("Tudo certo, "+cliente+" foi removido com sucesso!");
			System.out.println("Essa é a fila atualizada: "+fila);
			break;
		case 0:
			System.out.println("Opção 0: Sair");
			System.out.println("Muito Obrigado por utilizar o sistema!");
			break;
		default:
			System.out.println("Opção invalida!");
			break;
		}
		
		

		
	}

}
