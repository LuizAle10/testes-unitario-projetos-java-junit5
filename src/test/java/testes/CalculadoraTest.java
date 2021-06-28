package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import treinandoJava.Calculadora;

class CalculadoraTest {

	static Calculadora calc;

	@BeforeAll
	static void configuracaoInicial() {
		calc = new Calculadora();

	}

	@DisplayName("Teste de Soma")
	@Test
	void testeSomaResultadoPositivo() {
		assertEquals(4, calc.soma(1, 3), "Soma com erro");

	}

	@DisplayName("Teste de Subtração")
	@Test
	void testeSubtracaoResultadoNegativo() {
		assertEquals(-2, calc.subtracao(1, 3), "Subtração com erro");

	}

	@DisplayName("Teste de Multiplicação")
	@Test
	void testeMultiplicacaoResultadoPositivo() {
		assertEquals(3, calc.multiplicacao(1, 3), "Multiplicação com erro");

	}

	@DisplayName("Teste de Divisão")
	@Test
	void testeDividisaoResultadoPositivo() {
		assertEquals(1, calc.dividisao(3, 3), "Divisão com erro");

	}

	@ParameterizedTest
	@ValueSource(ints = { Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE })
	void testSubtracaoParametrizada_ResultadoZero(int parametroDeEntrada) {
		assertEquals(0, calc.subtracao(parametroDeEntrada, parametroDeEntrada),
				"Subtração de dois números iguais resultou diferente de zero");
	}

	// Escrevendo testes com massa de testes até agora era massa de dados
	@ParameterizedTest
	@CsvSource({ "-1,0", "0,0", "1,0" })
	void testSubtracaoMassaDeTeste_ResultadoZero(int parametroDeEntrada, int parametroDeSaida) {
		assertEquals(parametroDeSaida, calc.subtracao(parametroDeEntrada, parametroDeEntrada),
				"Subtração de dois números iguais resultou diferente de zero");

	}

	// Escrevendo testes com massa de testes de um arquivo CSV
	@ParameterizedTest
	@CsvFileSource(resources = "/dados(excel).csv", numLinesToSkip = 1, delimiter = ';' ) 
	void testSubtracaoMassaDeTesteArquivoCsv_ResultadoZero(String parametroDeEntradaString, String parametroDeSaidaString) {
    
	int entradaInt = Integer.parseInt(parametroDeEntradaString);
	int saidaInt = Integer.parseInt(parametroDeSaidaString);
	assertEquals(saidaInt, calc.subtracao(entradaInt, entradaInt), "Subtração de dois números iguais resultou diferente de zero");
	}

}










