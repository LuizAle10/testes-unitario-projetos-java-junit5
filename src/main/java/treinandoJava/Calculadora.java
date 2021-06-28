package treinandoJava;

public class Calculadora {

	public int soma(int x, int y) {
		return x + y;
	}

	public int subtracao(int x, int y) {
		return x - y;
	}

	public int multiplicacao(int x, int y) {
		return x * y;
	}

	public int dividisao(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		System.out.println("A soma de x,y é = " + calc.soma(3, 2));
		System.out.println("A substração de x,y é = " + calc.subtracao(15, 5));
		System.out.println("A multiplicação de x,y é = " + calc.multiplicacao(20, 10));
		System.out.println("A divisão é = " + calc.dividisao(30, 5));
	}
}