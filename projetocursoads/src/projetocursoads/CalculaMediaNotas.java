package pratica01;


    public class Equacao {
	 private double a ;
	 private double b ;
	 private double c ;
	 private double delta ;
	 private double x1 ;
	 private double x2;  
	
    
  
	
//	EXEMPLO COM PARAMETROS PORÉM NAO REFERENCIA O ATRIBUTO 
//	public double calculaDelta (double a, double b, double c) {
//		
//		delta = (Math.pow(b, 2)) - 4* a *c;
//		return  delta;
//	}
	 
     public double calculaDelta () {
		
		this.delta = (Math.pow(this.b, 2)) - 4* this.a *this.c;
		return  delta;
	}
     
     
	public double calculaX1(double x1) {
		
		x1 = (-b + Math.sqrt(delta) /   ( 2 * a ) );
		
		return x1;
		 
	}
	
	public double calculaX2(double x2) {
		
		x1 = (-b - Math.sqrt(delta) /   ( 2 * a ) );
		
		return x2;
   
	}

}
