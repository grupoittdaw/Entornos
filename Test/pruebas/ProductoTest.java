/**
 * 
 */
package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import operaciones.Producto;

/**
 * @author Jorge Jaen
 *
 */
class ProductoTest {
	
	private Producto p1;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Inicio de las pruebas de Producto");
		System.out.println("Todos los test se efectúan con un límite de decimales de 3 dígitos para controlar el producto de números altos");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Fin de las pruebas de Producto");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp(TestInfo testing) throws Exception {
		System.out.println("Empezando " + testing.getDisplayName()); //Por consola el test que analizamos
		p1 = new Producto();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown(){
		System.out.println("Test finalizado");
	}

	@Test
	// Test del metodo producto de dos reales
	void productoDosReales(){
		double num1 = 36589.2365;
		double num2 = 26095.311;
		double resultadoEsperado = 954807505.720;
		double resultado;
		try {
			resultado = p1.producto_dos_reales(num1, num2);
			assertEquals(resultadoEsperado, resultado);
		} catch (Exception e) {
			fail("ERROR");
			e.toString();
		}
		
		
	}
	
	@Test
	// Test del metodo producto de dos enteros
	void productoDosEnteros(){
		int num1 = 26589;
		int num2 = 26095;
		int resultadoEsperado = 693839955;
		int resultado;
		try {
			resultado = p1.producto_dos_enteros(num1, num2);
			assertEquals(resultadoEsperado, resultado);
		} catch (Exception e) {
			fail("ERROR");
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	// Test del metodo producto de tres reales
	void productoTresReales(){
		double num1 = 26.300;
		double num2 = 25.200;
		double num3 = 45.900;
		double resultadoEsperado = 30420.684;
		double resultado;
		try {
			resultado = p1.producto_tres_reales(num1, num2, num3);
			assertEquals(resultadoEsperado, resultado);
		} catch (Exception e) {
			fail("ERROR");
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	// Test del metodo potencia de un real
	void productoPotencia() {
		double num1 = 2.3;
		int exp = 2;
		double resultadoEsperado = 5.290;
		double resultado;
		try {
			resultado = p1.producto_potencia(num1, exp);
			assertEquals(resultadoEsperado, resultado);
		} catch (Exception e) {
			fail("ERROR");
			e.printStackTrace();
		}
		
	}
	
		
	

}
