package menuPetshop;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import petShop.util.Cores;
import petShop.controller.petShopController;
import petShop.model.clientePetShop;


public class menu {

	public static void main(String[] args) {
		
		petShopController clientes = new petShopController();
		
		Scanner leia = new Scanner(System.in);
		int opcao, numero=0, sexoAnimal;
		String nomeDono, NomeAnimal, raca, porteAnimal;
		float telefone;
		
		

		while(true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND+
					"*************************************************************************************************************");
			System.out.println("                                                                                                 ");
			System.out.println(" d8888b. d88888b d888888b     .d8888. db   db  .d88b.  d8888b.     d8888b. d88888b db    db       ");
			System.out.println(" 88  `8D 88'     `~~88~~'     88'  YP 88   88 .8P  Y8. 88  `8D     88  `8D 88'     88    88       ");
			System.out.println(" 88oodD' 88ooooo    88        `8bo.   88ooo88 88    88 88oodD'     88   88 88ooooo Y8    8P       ");
			System.out.println(" 88~~~   88~~~~~    88          `Y8b. 88~~~88 88    88 88~~~       88   88 88~~~~~ `8b  d8'       ");
			System.out.println(" 88      88.        88        db   8D 88   88 `8b  d8' 88          88  .8D 88.      `8bd8'        ");
			System.out.println(" 88      Y88888P    YP        `8888Y' YP   YP  `Y88P'  88          Y8888D' Y88888P    YP          ");
			System.out.println("                                                                                                 ");
			System.out.println("                                                                                                 ");
			System.out.println("*************************************************************************************************");
			System.out.println("                                                                                                 ");
			System.out.println("                  1 - Cadastrar novo Cliente                                                     ");
			System.out.println("                  2 - Agendar Banho/Tosa                                                         ");
			System.out.println("                  3 - Listar Clientes                                                            ");
			System.out.println("                  4 - Atualizar Dados dos Clientes                                               ");
			System.out.println("                  5 - Apagar Cadastro de Clientes                                                ");
			System.out.println("                  6 - Sair                                                                       ");
			System.out.println("                                                                                                 ");
			System.out.println("*************************************************************************************************");
			System.out.println("                  Entre com a Opção Desejada:                                                    ");
			System.out.println("                                                                                                 ");
			System.out.println("                                                                                                 ");
			opcao = leia.nextInt();
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nDigite valores Inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			if (opcao == 6) {
				System.out.println("\nPET SHOP DEV");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Cadastrar Novo Cliente\n\n");
					switch(opcao) {
					case 1:
						System.out.println(Cores.TEXT_WHITE+ "Cadastrar Novo Cliente: ");
						
						System.out.println("Digite numero do cadastro do cliente: ");
						numero = leia.nextInt();
						System.out.println("Digite o Nome do Cliente: ");
						nomeDono = leia.nextLine();
						leia.skip("\\R?");
						System.out.println("Digite o Telefone do Cliente: ");
						telefone = leia.nextFloat();
						System.out.println("Digite o nome do Animal: ");
						NomeAnimal = leia.next();
						System.out.println("Digite a raça do Animal: ");
						raca = leia.next();
						System.out.println("Digite o Sexo do Animal: ");
						sexoAnimal = leia.nextInt();
						System.out.println("Digite o Portedo Animal: ");
						porteAnimal = leia.next();
						
					}

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Agendar Banho/Tosa\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Listar Cliente\n\n");
				System.out.println(Cores.TEXT_WHITE + "Listar todos os Clientes\n\n");
				clientes.listarTodos();

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Atualizar dados do Cliente\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Apagar Cadastro de Clientes\n\n");
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD+"\nOpção Inválida!\n");
				break;
			}
		
	}
   }
	public static void keyPress() throws IOException {
		System.out.println(Cores.TEXT_RESET+ "\n\nPressione Enter Para Continuar...");
	}
		
}




