package JavaTech;

import java.util.Scanner;

public class ParENegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int valor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor: ");
		valor = leia.nextInt();
		
		if (valor >= 0 && valor%2 ==0 ) {
			System.out.println("\nO valor e par e positivo");
			
		} else if (valor<0 && valor%2 !=0) {
			System.out.println("\nO valor e impar e negativo");
			
		}else if (valor>=0 && valor%2 !=0) {
			System.out.println("\nO valor e impar e positivo");
			
		}else if (valor<0 && valor%2 ==0) {
			System.out.println("\nO valor e par e negativo");
			
		}
		
	}

}
