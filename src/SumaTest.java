
import operaciones.Suma;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
/*
 * Con este conjunto de tests buscamos hacer unas pruebas unitarias
 * Consisten en probar que los metodos de la clase suma implementada en el proyecto 
 * funcionan como si actuaran independiente de las demás clases.
 * Serían las pruebas más basicas y precederían a las pruebas de 
 * integración o las pruebas funcionales
 * Despues de ejecutar los resultados se interpretarán de la siguiente manera:
 * 
 * Verde, la prueba se ha superado
 * Azul, la prueba ha ido mal, alguna aserción no se ha cumplido o se ha ejecutado
 * la funcion fail()
 * Rojo, la prueba ha fallado aunque no es concluyente.
 */
class SumaTest {
	
	
	double acum;
	private Suma s1;
	
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
		s1 = new Suma();//Creamos un objeto suma limpio antes de cada test
	}
	
	
	/**
	 * En esta prueba unitaria debemos de probar que nuestro metodo "Suma2RealesTest" de la clase
	 * Suma funciona adecuadamente. Un metodo funciona adecuadamente cuando la operación 
	 * que realiza, nos devuelve el valor adecuado.
	 * 
	 * Para probar que este metodo funciona bien, debemos de pasar por todos los casos del metodo
	 * (o por todas las lineas)
	 * 
	 * 
	 * 
	 * En esta prueba unitaria vamos a probar con el ejemplo que tendria que hacer una suma de
	 * dos numeros reales y observar si esta suma es la esperada por el metodo mediante
	 * el AssertEquals
	 */
	@Test
	
	public void Suma2RealesTest() {
		
		double a=2.3;
		double b=1.1;
		double resultado_esperado=3.4;
		double actual= s1.suma_Real(a, b);
		assertEquals(resultado_esperado,actual);
		
		
		
	}
	
	/**
	 * En esta prueba unitaria debemos de probar que nuestro metodo "SumaEnterosTest" de la clase
	 * Suma funciona adecuadamente. Un metodo funciona adecuadamente cuando la operación 
	 * que realiza, nos devuelve el valor adecuado.
	 * 
	 * Para probar que este metodo funciona bien, debemos de pasar por todos los casos del metodo
	 * (o por todas las lineas)
	 * 
	 * 
	 * 
	 * En esta prueba unitaria vamos a probar con el ejemplo que tendria que hacer una suma de
	 * dos numeros enteros y observar si esta suma es la esperada por el metodo mediante
	 * el AssertEquals
	 */
	@Test
	
	public void SumaEnterosTest()  {
		
		int a=2;
		int b=-4;
		int resultado_esperado=-2;
		int actual= s1.suma_Dos_Entero(a, b);
		assertEquals(resultado_esperado,actual);
		
		
		
	}
	/**
	 * En esta prueba unitaria debemos de probar que nuestro metodo "Suma3RealesTest" de la clase
	 * Suma funciona adecuadamente. Un metodo funciona adecuadamente cuando la operación 
	 * que realiza, nos devuelve el valor adecuado.
	 * 
	 * Para probar que este metodo funciona bien, debemos de pasar por todos los casos del metodo
	 * (o por todas las lineas)
	 * 
	 * 
	 * 
	 * En esta prueba unitaria vamos a probar con el ejemplo que tendria que hacer una suma de
	 * tres numeros reales y observar si esta suma es la esperada por el metodo mediante
	 * el AssertEquals
	 */
@Test
	
	public void Suma3RealesTest()  {
		
		double a=2.9;
		double b=1.1;
		double c=-8.5;
		double resultado_esperado=-4.5;
		double actual= s1.suma_Tres_Real(a, b,c);
		assertEquals(resultado_esperado,actual);
		
		
		
	}
/**
 * En esta prueba unitaria debemos de probar que nuestro metodo "AcumuladoTest" de la clase
 * Suma funciona adecuadamente. Un metodo funciona adecuadamente cuando la operación 
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

public void AcumuladoTest() throws Exception {
	double resultado_esperado;
	double a=1;
	 
	  acum=s1.getAcumulado();
	if (acum==0) {
		resultado_esperado=1;
	}else {
		
		resultado_esperado=acum+1;
	}
	 s1.acumular(a);
	 acum=s1.getAcumulado();
	 double esperado=acum;
	assertEquals(resultado_esperado,esperado);
	
	
	
}







}
