package com.treinando_java;


public class Carro 	{
	
	//campos de instancia
	
  String cor;
  boolean corre;
  int velocidade;
  
  
  //método construtor 
	public Carro(String corCarro, boolean carroCorrendo, int KM) {
		
		cor = corCarro;
		corre = carroCorrendo;
		velocidade = KM;
  }
  
   // método principal
   public static void main(String[] args) {
	   
	   Carro ferrari = new Carro ("vermelho", true, 200);
	   Carro renault = new Carro ("azul", false, 130);
	   Carro honda = new Carro("verde", false, 160);

    
	   System.out.println("A Cor do carro da ferrari é " + ferrari.cor);
	   System.out.println("A velocidade do carro da ferrari é " + ferrari.velocidade + " KM");
	   System.out.println("=================================================================");

	   System.out.println("A Cor do carro da renault é " + renault.cor);
       System.out.println("A velocidade do carro da renault é " + renault.velocidade + " KM");
       System.out.println("=================================================================");

	   System.out.println("A Cor do carro da honda é " + honda.cor);
       System.out.println("A velocidade do carro da honda é " + honda.velocidade + " KM");
       System.out.println("=================================================================");

       System.out.println("Status dos carros:");
       System.out.println("=================================================================");


        //carro parado
        if (renault.corre == false) {
		   System.out.println("O carro da Renault está parado");
		   System.out.println("=================================================================");
		}
		
		else {
		    System.out.println("O carro da Renault está andando");
		    System.out.println("=================================================================");
		}

	   //carro correndo
		if (ferrari.corre != false) {
		   System.out.println("O carro da Ferrari está correndo");
		   System.out.println("=================================================================");
		}
	   
	
		//if else abreviado, conhecido como operador ternário
		String carroParado = (honda.corre == renault.corre)? "Os carros  da " + renault + " e o da " + honda +" estão parados" : "Os dois carros estão correndo";
		System.out.println(carroParado);
		System.out.println("=================================================================");


        //verificar o carro mais rápido
		if (ferrari.corre == ferrari.corre) {
		   System.out.println("Ferrari é o carro mais rápido");
	    }	
    }
}
