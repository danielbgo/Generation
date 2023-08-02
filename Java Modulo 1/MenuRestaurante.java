package JavaTech;

import java.util.Scanner;

public class MenuRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variáveis
		Double ValorTotal;
		int quantidade, codProduto;

		Scanner leia = new Scanner(System.in);

//		entrada de dados

		System.out.println("\nOlá, Cliente. Escolha o lanche desejado, e depois a quantidade: ");
		codProduto = leia.nextInt();
		
		switch (codProduto) {
		case 1:
				System.out.println("\nCachorro-Quente: R$10.00");
				System.out.println("\nQual a quantidade desejada? ");
				    quantidade = leia.nextInt();
				    	System.out.println(quantidade+" Cachorros-Quentes");
				    	
				    	ValorTotal = 10.00 * quantidade;
				    		System.out.println("\nO valor Total do Pedido é: "+"R$"+ValorTotal);				    	
		break;
		case 2:
			System.out.println("\nX-Salada: R$15.00");
			System.out.println("\nQual a quantidade desejada? ");
			    quantidade = leia.nextInt();
			    	System.out.println(quantidade+" X-Saladas");
			    	
			    	ValorTotal = 15.00 * quantidade;
			    		System.out.println("\nO valor Total do Pedido é: "+"R$"+ValorTotal);				    	
		break;
		case 3:
			System.out.println("\nX-Bacon: R$18.00");
			System.out.println("\nQual a quantidade desejada? ");
			    quantidade = leia.nextInt();
			    	System.out.println(quantidade+" X-Bacons");
			    	
			    	ValorTotal = 18.00 * quantidade;
			    		System.out.println("\nO valor Total do Pedido é: "+"R$"+ValorTotal);				    	
		break;
		case 4:
			System.out.println("\nBauru: R$12.00");
			System.out.println("\nQual a quantidade desejada? ");
			    quantidade = leia.nextInt();
			    	System.out.println(quantidade+" Baurus");
			    	
			    	ValorTotal = 12.00 * quantidade;
			    		System.out.println("\nO valor Total do Pedido é: "+"R$"+ValorTotal);				    	
	    break;
		case 5:
			System.out.println("\nRefrigerante: R$8.00");
			System.out.println("\nQual a quantidade desejada? ");
			    quantidade = leia.nextInt();
			    	System.out.println(quantidade+" Refrigerantes");
			    	
			    	ValorTotal = 8.00 * quantidade;
			    		System.out.println("\nO valor Total do Pedido é: "+"R$"+ValorTotal);				    	
	    break;
		case 6:
			System.out.println("\nSuco de Laranja: R$13.00");
			System.out.println("\nQual a quantidade desejada? ");
			    quantidade = leia.nextInt();
			    	System.out.println(quantidade+" Sucos de Laranja");
			    	
			    	ValorTotal = 13.00 * quantidade;
			    		System.out.println("\nO valor Total do Pedido é: "+"R$"+ValorTotal);				    	
	    break;
		default:
			System.out.println("\nErro!! Tente de novo por favor");
			break;
		}
	}

}
