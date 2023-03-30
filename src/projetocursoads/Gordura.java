package projetocursoads;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Gordura {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o seu peso:  ");
		double weight = input.nextDouble();
         
		//Sempre seguir essa ordem
		//Colocar a variável antes da (Divisão ou multiplicação e etc...)
		
		double more =  ( weight *15 / 100  ) + weight   ;
		double less =  weight -(  weight * 20 / 100  )  ;
	
		System.out.print("Se você engordar 15% vai ficar com " + more + " Kg"  );
		
		
		System.out.println( " Se você emagrecer 20% vai ficar com " + less + " Kg" );
		
		  input.close();
		   System.exit(0);
		
		//JOption
		
		weight = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
		
		double morejop =  ( weight *15 / 100  ) + weight   ;
		double lessjop =  weight -(  weight * 20 / 100  )  ;
		
		JOptionPane.showMessageDialog(null, "Se você engordar 15% vai ficar com "+ morejop + "Kg");
		JOptionPane.showMessageDialog(null, "Se você emagrecere 20% vai ficar com "+ lessjop + "Kg");

	}

}
