package JavaTech;

import java.util.Scanner;

public class SomaPositivoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, valores, somaPositivo = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite os Valores: ");
			valores = leia.nextInt();
				if (valores >=0) {
					somaPositivo = somaPositivo + valores;
				}
		} while (valores!=0);
		
		System.out.println("\nA soma de todos os valores positivos é de: "+somaPositivo);

	}

}
