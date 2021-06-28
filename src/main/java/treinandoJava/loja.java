package treinandoJava;

public class Loja {
  // campos de instância
  String tipoProduto;
  int contagemInventario;
  double precoEstoque;

  // método construtor
  public Loja(String produto, int contar, double preco) {

    tipoProduto = produto;
    contagemInventario = contar;
    precoEstoque = preco;
  }

  // método principal
  public static void main(String[] args) {

    Loja lojaCookie = new Loja("cookies", 12, 3.75);
    Loja lojaChocolate = new Loja("chocolate", 15, 10.55);
    Loja lojaSapatos = new Loja("tênis", 30, 25.55);

    // listar produtos
    System.out.println("Lista de produtos:");
    System.out.println(lojaCookie);
    System.out.println(lojaChocolate);
    System.out.println(lojaSapatos);

    double valorCookies = 3.75;
    double valorChocolate = 10.55;
    double valorSapatos = 10.55;

    double valorTotal = valorCookies + valorChocolate + valorSapatos;
    System.out.println(valorTotal);

    if (valorTotal <= 15) {
      System.out.println("Devo comprar!");
    } else {
      System.out.println("É muito caro!");
    }
  }
}