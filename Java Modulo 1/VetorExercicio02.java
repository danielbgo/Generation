package JavaTech;

import java.util.Scanner;

public class VetorExercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valores = new int[10];
		int soma=0;
		double mediaValores;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\nDigite os numeros: ");
		for(int x = 0; x<10; x++) {
			valores[x] = sc.nextInt();
		}
//		numeros Impares do vetor
		System.out.println("/nTodos os valores ímpares do vetor: ");
		for(int x = 1; x < 10; x +=2) {
			System.out.println(valores[x] + " ");
		}
		
//		numeros Pares do vetor
		System.out.println("\nTodos os valores pares do vetor: ");
		for(int x = 0; x < 10; x++) {
			if(valores[x] %2 == 0) {
				System.out.println(valores[x]+ " ");
			}
		}
//		Calcular a soma dos valores do vetor
		for(int x = 0; x < 10; x++) {
			soma += valores[x];
		}
		System.out.println("\nSoma de todos os Valores do vetor: " + soma);
		
//		calcular a média de todos os valores do vetor
		mediaValores = (double) soma/10;
		System.out.println("\nA Média de todos os valores do vetor é: "+mediaValores);

	}

}
