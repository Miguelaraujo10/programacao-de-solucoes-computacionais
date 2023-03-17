package projetocursoads;


      public class Equacao {
	 private double a ;
	 private double b ;
	 private double c ;
	 private double delta ;
	 private double x1 ;
	 private double x2;  
	
    
  
	
	
	public double calculaDelta (double a, double b, double c) {
		
		delta = Math.pow(b, 2) - 4* a *c;
		return  delta;
	}
	
	public double calculaX1(double x1, double x2) {
		
		x1 = (-b + Math.sqrt(delta) /   ( 2 * a ) );
		
		return x1;
		 
	}
	
	public double calculaX2() {
		
		x1 = (-b - Math.sqrt(delta) /   ( 2 * a ) );
		
		return x2;
   
	}

}

