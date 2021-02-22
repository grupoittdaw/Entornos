package operaciones;
/**
 * 
 * @author Diego Llive
 *
 */



public class Suma {

	public Suma () {} ; 	
	
/**
 * Construcor , permite realizar los metodos para las operaciones . 
 */
	                               
	                          

		
		
	/**
	 * 
	 * @param a 
	 * @param b 
	 * @return devuelve el  valor de la suma 
	 */
		
 public int suma_enteros (int a , int b) { // mètodo que nos devuele un valor entero , con los parametros a y b 
	  
	  int totals ;
	  	totals = a+b ;
	  	return totals ; 
  }
	
 /**
  * 
  * @param a
  * @param b
  * @return devuelve el valor de la suma 
  */
 
  public double suma_reales (double a , double b) { // mètodo que nos devuelve un valor decimal , con los parametros a y b 
	  
	  double totalr ; 
	  	totalr = a+b ;
	  	return totalr ;
	  }
  
  
  /**
   * 
   * @param a
   * @param b
   * @param c
   * @return devuelve el valor de la suma 
   */
  
  public double suma_3reales (double a , double b , double c) { // mètodo que nos devuelve un valor decimal , con los parametros a , b y c
	  
	  double totalr3 ;
	  totalr3 = (a+b+c) ;
	  return totalr3 ; 
  }
  
  
  /**
   * 
   * @param a
   * @return
   */
  public double valor_acumulado (double a) {
	  
	  double totalv ;
	  totalv = a ;
	  
	  double Sumatorio = 0 ;
	  double Contador = 0 ;
	  
	  while (Contador !=0) {
		  
		  Sumatorio = Sumatorio + Contador ; 
		  Contador -- ; 
		  
		  
	  }
	  
	  return totalv ; 
  }
  
}



