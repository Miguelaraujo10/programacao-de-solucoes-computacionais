package projetocursoads;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        Equacao eq = new Equacao();
        double delta, x1, x2, num;
        Scanner  input = new Scanner(System.in);
      
         
        System.out.print("Digite o valor de a: ");
        num = input.nextDouble();
        eq.setA(num);
          	
        System.out.print("Digite o valor de b: ");
        num = input.nextDouble();
        eq.setB(num);
        
        System.out.print("Digite o valor de c: ");
        num= input.nextDouble();
        eq.setC(num);
        
        delta = eq.calculaDelta();
        x1 = eq.calculaX1();
        x2 = eq.calculax2(); 
  	  
        input.close();
	   System.exit(0);
      
        
//        System.out.println("Delta = " + delta +
//                "\n X1 = " + x1 +
//                "\n X2 = " + x2);
                
        System.out.printf("Delta= %s\n X1= %s\n X2= %s",delta,x1,x2);
        
        
        
        
        
    }
    
}
