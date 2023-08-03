package JavaTech;

import java.util.Scanner;

public class lerNumerosParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis
		int numero1, numero2;
		int x,y,somaPar=0,somaImpar=0;
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados pelo Usuario com o laço de repetição for
		for(x=1; x<=5; x++) {
			System.out.println("\nEntre com o primeiro Número: ");
				numero1 = leia.nextInt();
				if (numero1 %2 !=0) {
					//totalImpar = somaImpar+1;
					somaImpar++;
				}
		}
		for(y=1; y<=5;y++) {
			System.out.println("\nEntre com o segundo Número: ");
				numero2 = leia.nextInt();
				if(numero2 %2 == 0) {
					//totalPar = somaPar+1;
					somaPar++;
				}
		}
		
		System.out.println("\nO total de numeros pares é de: "+somaPar);
		System.out.println("\nO Total de números Ímpares é de: "+somaImpar);
		
		
		
	}

}
