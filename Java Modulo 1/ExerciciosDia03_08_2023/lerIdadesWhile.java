package JavaTech;

import java.util.Scanner;

public class lerIdadesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis
		int idadePessoas = 0, contMaior=0, contMenor=0;
		Scanner leia  = new Scanner(System.in);
		
//		Entrada de dados pelo usuario
		while (idadePessoas >= 0) {
			System.out.println("\nEntre com a idade: ");
			idadePessoas = leia.nextInt();
			
			if (idadePessoas < 21) {
				contMenor++;
			}else if (idadePessoas > 50) {
				contMaior++;
			}
			
		}
		System.out.println("\nA quantidade de menores de 21 anos é de: "+contMenor);
		System.out.println("\nA quantidade de maiores de 50 anos é de: "+contMaior);
		

	}

}
