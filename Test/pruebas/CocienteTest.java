package pruebas;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Cociente;


class CocienteTest {

	@Test
	
	// Pueba de division de dos numeros reales positivos 
	
	public void testDivision_Reales()  {
		Cociente c1 = new Cociente();
		double resultado=0;
		try {
			resultado = c1.division_Reales(8, 2);
		}catch(Exception e) {
			
		}
		double esperado = 4; //8 / 2 = 4
		assertEquals(esperado, resultado);
		
		//Prueba de dos numeros reales uno positivo y otro negativo 
		
		resultado=0;
		try {
			resultado = c1.division_Reales(9, -3);
		}catch(Exception e) {
			
		}
		esperado = -3; // 9 / -3 = -3
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	
	// Pueba de division de dos numeros enteros positivos 
	
	void testDivision_Enteros() {
		Cociente c1 = new Cociente();
		double resultado=0;
		try {
			resultado = c1.division_Enteros(12, 4);
		}catch(Exception e) {
			
		}
		double esperado = 3; // 12 / 4 = 3
		assertEquals(esperado, resultado);
		
		// Pueba de division de dos numeros reales, uno positivo y otro negativo 
		
		resultado=0;
		try {
			resultado = c1.division_Enteros(10, -2);
		}catch(Exception e) {
			
		}
		esperado = -5; // 10 / -2 = -5
		assertEquals(esperado, resultado);
		
		
	}

	@Test
	void testInverso_Numero() {
		Cociente c1 = new Cociente();
		double resultado=0;
		try {
			resultado = c1.inverso_Numero(5);
		}catch(Exception e) {
			
		}
		double esperado = 0.2; // Inverso de 5 = 0.2 por que 5 * 0.2 = 1
		assertEquals(esperado, resultado);
	}

	@Test
	void testRaiz_Numero() {
		Cociente c1 = new Cociente();
		double resultado=0;
		try {
			resultado = c1.raiz_Numero(144);
		}catch(Exception e) {
			
		}
		double esperado = 12; // Raiz cuadrada de 144 = 12
		assertEquals(esperado, resultado);
	}

}
