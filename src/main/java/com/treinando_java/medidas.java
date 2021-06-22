



//1-Pacote 	
package com.treinando_java;
//2- Referência as bibliotecas


//3- Classe
public class Medidas {	
	//3.1- Atributos - Caracteristicas 
	
	//3.2- Métodos e Funções
public static void main(String[]args){

    System.out.println("Cálculo de areas");
	
		//Calcular area - Reduzido
	int largura = 4;
	int comprimento = 3;
	int resultado = largura * comprimento;
	
    System.out.println("Para a largura de " + largura + "m e o comprimento de "
                          + comprimento + "m, a área é de " + resultado + "m2");
}




public void calcularAreaModoExtenso(){
	//Calculo de área - Exemplo: o tamanho do tapete ou piso 
    int largura;
    int comprimento;
	int resultado; 


    largura = 5;  //lagura recebe 5
    comprimento = 6;// comprimento recebe 6
	
	resultado = largura * comprimento;

    System.out.println("Para a largura de " + largura +"m e o comprimento de"
                          + comprimento + " m  a área é de " + resultado + " m2");
}


public void calcularAreaModoCompacto(){
	//Calcular area - Reduzido
	int largura = 4;
	int comprimento = 3;
	int resultado = largura * comprimento;

	
System.out.println("Para a largura de " + largura +" m e o comprimento de"
                          + comprimento + " m  a área é de" + resultado + " m2");
						  						  
						  
}
}