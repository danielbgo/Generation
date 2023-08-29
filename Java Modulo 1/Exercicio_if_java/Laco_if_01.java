package JavaTech;

import java.util.Scanner;

public class Laco_if_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int soma, valor1, valor2,valor3;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite o primeiro valor: ");
			valor1 = leia.nextInt();
			System.out.println("\nDigite o segundo valor: ");
			valor2 = leia.nextInt();
			System.out.println("\nDigite o terceiro valor: ");
			valor3 = leia.nextInt();
			
			soma = valor1+valor2;if (soma<=valor3) {
			System.out.println("\nA soma do priemiro com o segundo valor e menor que o 3");
			}
			System.out.println("\nO valor da soma dos dois primeiros valores e: "+soma);
				
			
			
		
	}

}
