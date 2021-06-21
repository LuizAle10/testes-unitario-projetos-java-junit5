import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import principal.Calculadora;

class CalculadoraTeste {

	Calculadora calc = new Calculadora();

	@Test
	@DisplayName("Soma de números positivos")
	void testSomaNumerosPositivos_ResultadoPositivo() {
		assertEquals(5, calc.soma(3, 2));
	}

	@Test
	void testSomaNumerosNegativos_ResultadoNegativo() {
		assertEquals(-3, calc.soma(-1, -2));
	}

	@Test
	void testSubstracaoNumerosPositivos_ResultadoPositivo() {
		assertEquals(4, calc.substracao(9, 5));
	}

}