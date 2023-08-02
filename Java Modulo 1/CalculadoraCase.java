package JavaTech;

import java.util.Scanner;

public class CalculadoraCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float valor1,valor2, soma, subtra, multi, divisao;
		int opcao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscolha uma opcao da calculadora: ");
		 	opcao = leia.nextInt();
		 	
		 	
		 	switch (opcao) {
			case 1:
				System.out.println("\nSoma: ");
				System.out.println("\nDigite o primeiro valor: ");
				   valor1 = leia.nextFloat();
				 System.out.println("\nDigite o segundo Valor: ");
				   valor2 = leia.nextFloat();
				   
				  soma = valor1 + valor2;
				  System.out.println("\nResultado: "+soma);
			break;	
			case 2:
				System.out.println("\nSubtracao: ");
				System.out.println("\nDigite o primeiro valor: ");
				   valor1 = leia.nextFloat();
				 System.out.println("\nDigite o segundo Valor: ");
				   valor2 = leia.nextFloat();
				   
				  subtra = valor1 - valor2;
				  System.out.println("\nResultado: "+subtra);
			break;
			case 3:
				System.out.println("\nMultiplicacao: ");
				System.out.println("\nDigite o primeiro valor: ");
				   valor1 = leia.nextFloat();
				 System.out.println("\nDigite o segundo Valor: ");
				   valor2 = leia.nextFloat();
				   
				  multi = valor1 * valor2;
				  System.out.println("\nResultado: "+multi);
			break;
			case 4:
				System.out.println("\nDivisao: ");
				System.out.println("\nDigite o primeiro valor: ");
				   valor1 = leia.nextFloat();
				 System.out.println("\nDigite o segundo Valor: ");
				   valor2 = leia.nextFloat();
				   
				  divisao = valor1 / valor2;
				  System.out.println("\nResultado: "+divisao);
			break;	
			default:
				System.out.println("\nErro!! Tente de novo, por favor");
				break;
			}
		 	 
	}

}
