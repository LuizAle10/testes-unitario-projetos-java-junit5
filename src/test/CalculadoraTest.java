package com.treinando_java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import calculadora.Calculadora;

class CalculadoraTeste {

	static Calculadora c;

	@BeforeAll
	static void configuracaoInicial() {
		c = new Calculadora();
	}

	@DisplayName("Teste de Soma com Resultado Positivo")
	@Test
	@Order(1)
	@Tag("soma")
	void testeSomaResultadoPositivo() {
		assertEquals(4, c.soma(1, 3), "Soma positiva com erro");
	}
	
	@DisplayName("Teste de Subtracao com Resultado Positivo")
	@Test
	@Order(2)
	@Tag("subtracao")
	void testeSubtracaoResultadoPositivo() {
		assertEquals(1, c.subtracao(5, 4), "Subtracao positiva com erro");
	}
	
	@DisplayName("Teste de Subtracao com Resultado Negativo")
	@Test
	@Order(3)
	//@RepeatedTest(5)
	@Tag("subtracao")
	void testeSubtracaoResultadoNegativo() {
		//assertEquals(-1, c.subtracao(4, 5), "Substracao com Resultado Negativo com resultado diferente do esperado");
		assertThat(c.subtracao(4, 5), is(equalTo(-1)));
	}	
	
	@DisplayName("Teste de Soma com números negativos")
	@Test
	@Order(4)
	@Tag("soma")
	void testeSomaComNumerosNegativos() {
		assertEquals(-9, c.soma(-2, -7), "Soma de números de negativos com resultado diferente do esperado");
	}
	
	@ParameterizedTest
	@ValueSource(ints = {Integer.MIN_VALUE, 1, 2, 3, 10, Integer.MAX_VALUE})
	@Order(5)
	@Tag("subtracao")
	void testeSubstracaoComResultadoZero(int number) {
	    assertThat(c.subtracao(number, number), is(equalTo(0)));
	}
	
	@ParameterizedTest
	@CsvSource({"0,0", "10,0"})
	@Order(6)
	@Tag("subtracao")
	void testeSubstracaoComResultadoZeroCvs(int entrada, int saida) {
	    assertThat(c.subtracao(entrada, entrada), is(equalTo(saida)));
	}	

	@ParameterizedTest
	@CsvFileSource(resources = "/dados.csv", numLinesToSkip = 1, delimiter = ';' )
	@Order(7)
	@Tag("subtracao")
	void testeSubstracaoComResultadoZeroCvsFile(String entradaString, String saidaString) {
		int entrada = Integer.parseInt(entradaString);
		int saida = Integer.parseInt(saidaString);
	    assertThat(c.subtracao(entrada, entrada), is(equalTo(saida)));
	}
	
}