package JavaTech;

import java.util.Scanner;

public class IF04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra1, palavra2, palavra3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira palavra: ");
		palavra1 = ler.nextLine();
		System.out.println("\nEntre com a segunda palavra: ");
		palavra2 = ler.nextLine();
		System.out.println("\nEntre com a terceira palavra: ");
		palavra3 = ler.nextLine();
		
		
		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nE uma aguia");
				} else {
					System.out.println("\nE uma pomba");
				}
				
			} else {
				if (palavra3.equalsIgnoreCase("E um onivero")) {
					System.out.println("\nE um ser humano");
					
				}else {
					System.out.println("\nE uma vaca");
				}
			}
			
		}else {
			if (palavra2.equalsIgnoreCase("inseto")) {
				if (palavra3.equalsIgnoreCase("\nE um hematofago")) {
					System.out.println("\nE uma pulga");
				}else {
					if (palavra3.equalsIgnoreCase("")) {
						
					}
				}
				
			}
		}
	}

}
