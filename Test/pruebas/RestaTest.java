package pruebas;

import operaciones.Resta;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
/*
 * Con este conjunto de tests buscamos hacer unas pruebas unitarias
 * Consisten en probar que los metodos de la clase resta implementada en el proyecto 
 * Funcionan como si actuaran independiente de las demás clases.
 * Serían las pruebas más basicas y precederían a las pruebas de 
 * integración o las pruebas funcionales
 * Despues de ejecutar los resultados se interpretarán de la siguiente manera:
 * 
 * Verde, la prueba se ha superado
 * Azul, la prueba ha ido mal, alguna aserción no se ha cumplido o se ha ejecutado
 * la funcion fail()
 * Rojo, la prueba ha fallado aunque no es concluyente.
 */
class RestaTest {
	
	
	double acum;
	private Resta r1;
	
	@BeforeAll //Este mensaje aparecerá antes de empezar el análisist.
	static void AntesTodo() throws Exception {
		System.out.println("Comienza el analisis...");
	}
	@AfterAll//Este mensaje aparecerá al finalizar el análisis completo
	static void DespuesTodo() throws Exception {
		System.out.println("HA FINALIZADO EL ANÁLISIS");
	}
	
	@BeforeEach//Este mensaje aparecerá antes de cada test
	
	public void init(TestInfo testing) {
		System.out.println("Empezando "+testing.getDisplayName());//Con esto escribimos por consola el test que analizamos
		r1 = new Resta();//Creamos un objeto resta limpio antes de cada test
	}
	
	
	/**
	 * En esta prueba unitaria debemos de probar que nuestro metodo "Resta2Reales" de la clase
	 * Resta funciona adecuadamente. Un metodo funciona adecuadamente cuando la operación 
	 * que realiza, nos devuelve el valor adecuado.
	 * 
	 * Para probar que este metodo funciona bien, debemos de pasar por todos los casos del metodo
	 * (o por todas las lineas)
	 * 
	 * 
	 * 
	 * En esta prueba unitaria vamos a probar con el ejemplo que tendria que hacer una Resta de
	 * dos numeros reales y observar si esta resta es la esperada por el metodo mediante
	 * el AssertEquals
	 * @throws Exception 
	 */
	@Test
	
	public void Resta2RealesTest()  {
		
		double a=2.5;
		double b=1.1;
		double resultado_esperado=1.4;
		double actual = 0;
		try {
			actual = r1.resta_Real(a, b);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		assertEquals(resultado_esperado,actual);
		
		
		
		
	}
	
	/**
	 * En esta prueba unitaria debemos de probar que nuestro metodo "RestaEnteros" de la clase
	 * Resta funciona adecuadamente. Un metodo funciona adecuadamente cuando la operación 
	 * que realiza, nos devuelve el valor adecuado.
	 * 
	 * Para probar que este metodo funciona bien, debemos de pasar por todos los casos del metodo
	 * (o por todas las lineas)
	 * 
	 * 
	 * 
	 * En esta prueba unitaria vamos a probar con el ejemplo que tendria que hacer una resta de
	 * dos numeros enteros y observar si esta resta es la esperada por el metodo mediante
	 * el AssertEquals
	 * @throws Exception 
	 */
	@Test
	
	public void RestaEnterosTest()   {
		
		int a=4;
		int b=2;
		int resultado_esperado=2;
		int actual = 0;
		try {
			actual = r1.resta_Dos_Entero(a, b);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		assertEquals(resultado_esperado,actual);
		
		
		
	}
	/**
	 * En esta prueba unitaria debemos de probar que nuestro metodo "Resta3Reales" de la clase
	 * Resta funciona adecuadamente. Un metodo funciona adecuadamente cuando la operación 
	 * que realiza, nos devuelve el valor adecuado.
	 * 
	 * Para probar que este metodo funciona bien, debemos de pasar por todos los casos del metodo
	 * (o por todas las lineas)
	 * 
	 * 
	 * 
	 * En esta prueba unitaria vamos a probar con el ejemplo que tendria que hacer resta  de
	 * tres numeros reales y observar si esta resta es la esperada por el metodo mediante
	 * el AssertEquals
	 * @throws Exception 
	 */
@Test
	
	public void Resta3RealesTest()   {
		
		double a=8.5;
		double b=1.1;
		double c=2.7;
		double resultado_esperado=4.7;
		double actual = 0;
		try {
			actual = r1.resta_Tres_Real(a, b,c);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		assertEquals(resultado_esperado,actual);
		
		
		
	}
/**
 * En esta prueba unitaria debemos de probar que nuestro metodo "Acumular" de la clase
 * Resta funciona adecuadamente. Un metodo funciona adecuadamente cuando la operación 
 * que realiza, nos devuelve el valor adecuado.
 * 
 * Para probar que este metodo funciona bien, debemos de pasar por todos los casos del metodo
 * (o por todas las lineas)
 * 
 * 
 * 
 * En esta prueba unitaria vamos a probar con el ejemplo que tendria que hacer una operacion 
 * de acumulado y comprobar que funciona correctamente comparando el resultado con el 
 * valor esperado mediante  el AssertEquals
 */

@Test

public void AcumularTest() throws Exception {
	double resultado_esperado;
	double a=1;
	 
	  acum=r1.getAcumulado();
	if (acum==0) {
		resultado_esperado=1;
	}else {
		
		resultado_esperado=acum-1;
	}
	 r1.acumular(a);
	 acum=r1.getAcumulado();
	 double esperado=acum;
	assertEquals(resultado_esperado,esperado);
	
	
	
}

}

