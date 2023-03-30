package projetocursoads;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AumentoSalario {

	public static void main(String[] args) {
		Scanner input = new Scanner ( System.in );
		
		System.out.println(" Parábens você recebeu um acréscimo de 25% no seu salário  ");
		System.out.println("Digite o valor do seu salário: ");
		double salary = input.nextDouble();
		
		double more = salary + ( salary * 25 / 100);
		
		System.out.println("O seu salário agora é: "+ more );
          
		  input.close();
		   System.exit(0);
		
		//JOption
		
		JOptionPane.showMessageDialog(null, "Parábens você recebeu um acréscimo de 25% no seu salário ");
		salary = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário. "));
		JOptionPane.showMessageDialog(null, "O seu salário agora é de " + more );
		
		
	}

}
