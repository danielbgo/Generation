package conta;

import java.util.Scanner;

import conta.model.ContaPoupanca;
import conta.model.ContaCorrente;
import conta.util.cores;


public class Menu {
	
	public static Scanner leia = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		int opcao;

		
		
		while(true) {
			System.out.println(cores.TEXT_YELLOW+cores.ANSI_BLACK_BACKGROUND);
			System.out.println("*****************************************************************");
			System.out.println("                                                                 ");
			System.out.println("               Banco do Brazil com Z                             ");
			System.out.println("                                                                 ");
			System.out.println("*****************************************************************");
			System.out.println("                                                                 ");
			System.out.println("                  1 - Criar Conta                                ");
			System.out.println("                  2 - Listar todas as Contas                     ");
			System.out.println("                  3 - Buscar Conta por Número                    ");
			System.out.println("                  4 - Atualizar Dados da Conta                   ");
			System.out.println("                  5 - Apagar Conta                               ");
			System.out.println("                  6 - Sacar                                      ");
			System.out.println("                  7 - Depositar                                  ");
			System.out.println("                  8 - Transferir valores entre Contas            ");
			System.out.println("                  9 - sair                                       ");
			System.out.println("                                                                 ");
			System.out.println("*****************************************************************");
			System.out.println("                Entre com a Opção Desejada:                      ");
			System.out.println("                                                                 ");
			System.out.println("                                                                 "+cores.TEXT_RESET);
			
			
			opcao = leia.nextInt();
			

			if(opcao == 9) {
				System.out.println(cores.TEXT_WHITE_BOLD+"\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			
		switch(opcao) {
			case 1:
				System.out.println(cores.TEXT_WHITE+"Criar Conta\n\n");
				break;
			case 2:
				System.out.println(cores.TEXT_WHITE+"Listar todas as Contas\n\n");
				break;
			case 3:
				System.out.println(cores.TEXT_WHITE+"Consultar dados da Conta - por Número\n\n");
				break;
			case 4: 
				System.out.println(cores.TEXT_WHITE+"Atualizar dados da Conta\n\n");
				break;
			case 5:
				System.out.println(cores.TEXT_WHITE+"Apagar a Conta\n\n");
				break;
			case 6:
				System.out.println(cores.TEXT_WHITE+"Saque\n\n");
				break;
			case 7:
				System.out.println(cores.TEXT_WHITE+"Depósito\n\n");
				break;
			case 8:
				System.out.println(cores.TEXT_WHITE+"Transferência entre Contas\n\n");
				break;
			default:
				System.out.println(cores.TEXT_RED_BOLD+"\nOpção Ivalida!!\n"+cores.TEXT_RESET);
				break;
		}
		}
	}

}
