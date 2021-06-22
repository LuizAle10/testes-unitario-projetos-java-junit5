package com.treinando_java;


public class Carro 	{
	
	//campos de instancia
	
String cor;
 // new fields!
  boolean corre;
  int velocidade;
  
  
  //método construtor 
    // new parameters that correspond to the new fields
	public Carro(String corCarro, boolean carroCorrendo, int KM) {
		cor = corCarro;
		
		// assign new parameters to the new fields
		corre = carroCorrendo;
		 velocidade = KM;
  }
  
   // método principal
   public static void main(String[] args) {
	   // new values passed into the method call
	   Carro ferrari = new Carro ("red", true, 27);
	   Carro renault = new Carro ("blue", false, 70);
	   Carro honda = new Carro("green", false, 0);
	   
	   System.out.println(renault.corre);
	   // false
    System.out.println(ferrari.velocidade);
    // 27
	System.out.println(honda.cor);
    // green
	
  }
}
