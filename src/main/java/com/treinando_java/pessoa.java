package com.treinando_java;


public class Pessoa {
    // state of an object
    int idade;
    String nome;
    String nacionalidade;
    String natural;
    String profissão;
    String time;
    String sexo;
    //double cep;
    String logradouro;
    int numeroLogradouro;
    
    // behavior of an object
    public void dadosPessoa() {

      idade = 29;
      nome = "Alexandre";
      nacionalidade = "Brasileiro";
      natural ="São Paulo";
      profissão = "QA";
      time = "Palmeiras";
      sexo = "M";
      //cep = 02409000;
      logradouro = "Rua a direita" ;
      numeroLogradouro = 88;

    }
    public void obterValor() {
      System.out.println("idade é " + idade);
      System.out.println("nome é " + nome);
    }
    
    // main method
    public static void main(String [] args) {
      // creates a new Person object
      Pessoa p = new Pessoa(); 
      
      // changes state through behavior
      p.dadosPessoa();
    }
  }
  
  
  /*
  
  public class Person {
    int age;
    // Constructor:
    public Person(int a) {
      age = a;
    }
    
    public static void main(String [] args) {
      // Here, we create a new instance of the Person class:
      Person p = new Person(20);
      System.out.println("Age is " + p.age); // Prints: Age is 20
    }
  }
  
  
  */
  
  /*
  
  
  Instância Java
  Instâncias Java são objetos baseados em classes. Por exemplo, Bobpode ser uma instância da classe Person.
  
  Cada instância tem acesso a seu próprio conjunto de variáveis ​​que são conhecidas como campos de instância , que são variáveis ​​declaradas dentro do escopo da instância. Os valores dos campos de instância são atribuídos no método do construtor.
  
  public class Person {
    int age;
    String name;
    
    // Constructor method
    public Person(int age, String name) {
      this.age = age;
      this.name = name;
    }
    
    public static void main(String[] args) {
      Person Bob = new Person(31, "Bob");
      Person Alice = new Person(27, "Alice");
    }
  }
  

   */