package projetocursoads;

import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
	
		double n1 , n2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Coloque a sua primeira nota: ");
		n1 = input.nextDouble();
		
	while (n1 < 10) {
		
		n1++;
		
		System.out.println("N1 virou " + n1);
		break;
	}
	
	}

}
