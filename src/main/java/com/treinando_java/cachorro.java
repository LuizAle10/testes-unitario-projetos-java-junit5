package com.treinando_java;

public class Cachorro {
  String procriar;
  boolean temDono;
  int idade;

  public Cachorro(String racaCachorro, boolean cachorroComDono, int IdadeCachorro) {

    System.out.println("Construtor invocado!");

    procriar = racaCachorro;
    temDono = cachorroComDono;
    idade = IdadeCachorro;
  }

  public static void main(String[] args) {
    System.out.println("Método principal iniciado");

    Cachorro fido = new Cachorro("poodle", false, 4);
    Cachorro nunzio = new Cachorro("shiba inu", true, 12);

    int totalIdadeCachorro = nunzio.idade + fido.idade;

    System.out.println("Temos dois cachorros criados: um " + fido.procriar + " e um " + nunzio.procriar);
    System.out.println("A idade total dos cães é: " + totalIdadeCachorro + " anos");

    if (fido == nunzio) {
      System.out.println("Fido tem dono");
    }

    else {
      System.out.println("Fido não tem dono");
    }

    if (fido != nunzio) {
      System.out.println("Nunzio tem dono");
    }

    // if else abreviado, conhecido como operador ternário
    String cachorroMaisVelho = (fido.idade > nunzio.idade) ? "Fido é um cachorro mais velho"
        : "Nunzio é um cachorro mais velho";
    System.out.println(cachorroMaisVelho);

    System.out.println("Método principal encerrado");

  }
}
