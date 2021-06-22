package com.treinando_java;

public class Calculadora {
	
	public int somar(int x, int y) {
		return x+y;
	}
	
	public int subtrair(int x, int y) {
		return x-y;
	}

	public int multiplicar(int x, int y) {
		return x*y;
	}
	
	public int dividir(int x, int y) {
		return x/y;
	}	


public static void main(String[] args) {
	
		Calculadora calc = new Calculadora();
			
		System.out.println("A soma de x,y é = " + calc.somar(3, 2));
		System.out.println("A substração de x,y é = " + calc.subtrair(15, 5));
		System.out.println("A multiplicação de x,y é = " + calc.multiplicar(20, 10));
        System.out.println("A divisão é = " + calc.dividir(30, 5));
		

		}
	
}