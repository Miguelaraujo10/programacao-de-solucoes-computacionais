package projetocursoads;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Dolar {

	public static void main(String[] args) {
		

	     //Joption
		   
		   double cash1 , muchc1, total1;
		   
	     
	     cash1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o atual valor do dólar? "));
	     
	     muchc1 = Double.parseDouble(JOptionPane.showInputDialog("Quantos dolares você tem? "));
	     
	     double total12 = muchc1 * cash1;
	     
	     JOptionPane.showMessageDialog(null, "Atualmente você tem" + total12 + "reais em dolares");
		
		
		
		
		
		
		
		//Scanner
     Scanner input = new Scanner (System.in);
     
     System.out.println("Qual é o atual valor do dólar em relação ao real atualmente ? ");
     double cash = input.nextDouble();
     
     System.out.println("Quantos dolares você tem? ");
     double muchc = input.nextDouble();
     
     System.out.println("Atualmente você tem  " + 
     cash * muchc + " reais em dólares"  );
     
    
     
     
     input.close();
	   System.exit(0);
     
	}

}