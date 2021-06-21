package com.treinando_java;


public class cachorro {
  String procriar;
  boolean temDono;
  int idade;
  
  public cachorro(String racaCachorro, boolean dogOwned, int dogYears) {
    System.out.println("Construtor invocado!");
    procriar = racaCachorro;
    temDono = dogOwned;
    idade = dogYears;
  }
  
  public static void main(String[] args) {

    System.out.println("Método principal iniciado");
    
    cachorro fido = new cachorro("poodle", false, 4);
    cachorro nunzio = new cachorro("shiba inu", true, 12);
    boolean fidoMaisVelho = fido.idade > nunzio.idade;
    int totalIdadeCachorro = nunzio.idade + fido.idade;

    System.out.println("Dois cachorros criados: um " + fido.procriar + " e um " + nunzio.procriar);
    System.out.println("A afirmação de que fido é um cachorro mais velho é: " + fidoMaisVelho);
    System.out.println("A idade total dos cães é: " + totalIdadeCachorro);
    System.out.println("Método principal encerrado");
  }
}