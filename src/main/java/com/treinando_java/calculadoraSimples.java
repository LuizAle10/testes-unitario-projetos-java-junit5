

//https://github.com/marcelodebittencourt/CalculadoraJavaTestes_CursoSisnema

//Calculadora com soma e subtracao com testes unitarios

package com.treinando_java;

public class calculadoraSimples {
	
	public int soma(int x, int y) {
		return x+y;
	}
	
	public int substracao(int x, int y) {
		return x-y;
	}


	public void principal () {

		calculadoraSimples calc = new calculadoraSimples();

		System.out.println(calc.soma(3, 2));

	}

}
