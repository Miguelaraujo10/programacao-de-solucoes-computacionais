package projetocursoads;

import java.util.Scanner;

public class CalculaMediaNotas {

    public static void main(String[]args ) {
    	Scanner teclado = new Scanner (System.in);
    	
    	 
    	System.out.print ("Coloque a sua primeira nota : ");
        float n1 = teclado.nextFloat();
       
       System.out.println("Coloque a sua segunda nota: ");
       float n2 = teclado.nextFloat();
      
       float m = ( n1 + n2 ) / 2 ;
       
       System.out.println("Seu resultado foi : " + m  );
       
       if  ( m > 9 ); 
    	   System.out.println("Parábens voc6e conseguiu uma média para entrar em Harvard");
       
       if ( m < 4   )
    	   System.out.println("Você infelizmente não passou de ano");
    	   
    }
}