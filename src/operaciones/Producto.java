package operaciones;

/** Se van a implementar cuatro maneras de multiplicar para realizar operaciones numéricas básicas 
 * con las funciones:
 * 
 * <p>-Producto de dos números reales.
 * <p>-Producto de dos números enteros.
 * <p>-Producto de tres números reales.
 * <p>-Potencia.
 *  
 * @author Angel Sanchez-Sierra Cruz
 * @since 09/02/2021
 *
 */
public class Producto {
	/**
	 * @param producto_dos_reales Tendra un valor real, como resultado que nos devolverá la 
	 * función producto_realesdos()
	 */
	double producto_dos_reales;
	
	/**@param producto_dos_enteros Tendra un valor entero, como resultado que nos devolverá la 
	 * función producto_enterosdos()
	 */
	int producto_dos_enteros;
	
	/**@param producto_tres_reales Tendra un valor real, como resultado que nos devolverá la 
	 * función producto_realestres()
	 */
	double producto_tres_reales;
	
	/**@param valorPotencia Tendra un valor real, como resultado que nos devolverá la 
	 * funcion producto_potencia()
	 */
	double producto_potencia;
	
	/**Constructor por defecto de la clase Producto <p>
	 * Inicia el objeto Producto recién creado sin el paso de ningún parámetro.
	 * 
	 */
	public Producto(){
		
	}//Cierre constructor
	
	 /**

     * Multiplica dos números reales, tendrá dos parámetros de entrada y uno de salida que será la solución. <p>
     *        NOTA:<p> valor n1 * n2
     * 
     * @return Valor real que nos devuelve la función o método (producto)
     * @param n1Real Primer valor numerico entero que sera el multiplicando 
     * @param n2Real Segundo valor numerico real que será el multiplicador
     * @throws Exception -Numero mayor de 64 bits en n1Real,n2Real o producto_dos_reales
     * Introducir letras en vez de números
     * 
     *{@link Exception#getMessage()}

     */
	public double producto_dos_reales(double n1Real, double n2Real) throws Exception {
		
		producto_dos_reales=n1Real*n2Real;
		
		return producto_dos_reales;
	}//Cierre función producto_dos_reales

	/**

     * Multiplica dos números enteros, tendrá dos parámetros de entrada y uno de salida que será la solución. <p>
     * 
     	          NOTA: valor n1 * n2<p>
     	
     * @return Valor real que nos devuelve la función o método (producto)
     * @param n1Real Primer numero entero que será el multiplicando 
     * @param n2Real Segundo numero entero que será el multiplicador
		@throws Exception -Numero mayor de 32 bits en n1Entero,n2Real o producto_dos_enteros
		Introducir letras en vez de números. Introducir numero real en numero entero.
		{@link Exception#getMessage()}
     */
	public int producto_dos_enteros(int n1Entero, int n2Entero)throws Exception {
		
		producto_dos_enteros=n1Entero*n2Entero;
		
		return producto_dos_enteros;
	}//Cierre funcion producto_dos_enteros
	
	/**

     *  Multiplica tres números reales, tendrá tres parámetros de entrada y uno de salida que será la solución. <p>
     	 NOTA:<p>valor n1 * n2 * n3. 
     	 	
     * @return Valor real que nos devuelve la función o método (producto)
     * @param n1Real Primer numero real que será el multiplicando en la primera operación que hace la función
     * @param n2Real Segundo numero real que será el multiplicador en la primera operacion que hace la función
     * @param n3Real Tercer numero real  que sera el multiplicador del resultado del producto entre n1Real y n2Real
		
		@throws Exception -Numero mayor de 64 bits en n1Real,n2Real,n3Real o producto_tres_reales
		{@link Exception#getMessage()}
     */

	public double producto_tres_reales(double n1Real,double n2Real,double n3Real)throws Exception {
		
		producto_tres_reales=n1Real*n2Real*n3Real;
		
		return producto_tres_reales;
	}//Cierre funcion producto_Real3
	
	 /**

     * Devuelve el resultado de calcular la potencia de un numero REAL <p>
     * 
     * NOTA:<p>Se debe introducir el valor numerico al que le aplicamos la potencia y otro valor numerico que es la potencia 
     * NOTA:<p>valor potencia pot de n1 
     * 
     * @return Valor REAL que nos devuelve la función o método (potencia)
     * @param base Numero real sobre el cual se calculara su potencia.
     * @param exponente Número entero que significa el número de veces que se multiplica la base.
     * @throws Exception Numero mayor de 64bits base o potenciaNumero. Numero mayor de 32 bits en exponente.
     * Introducir letras en vez de números. Introducir numero real en numero entero.
     * 
     * {@link Exception#getMessage()}

     */

	public double producto_potencia(double base, int exponente) {
		producto_potencia=Math.pow(base, exponente);
		
		return producto_potencia;

	}//Cierre función potencia_Numero
	
}//Cierre de la clase Producto
