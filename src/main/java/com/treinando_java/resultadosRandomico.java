package com.treinando_java;

import java.util.Random;

public class ResultadosRandomicoo {

    //Listagem 1: Exemplo básico de utilização da classe Random.
    public  void aleatoriosInteirosConstrutorPadrao() {

        //instância um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();

        //imprime sequência de 10 números inteiros aleatórios
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt());
        }
    }


	
    //Listagem 2: Gerando sequência de números aleatórios inteiros com valores entre 0 e 25.	
	public void aleatoriosInteirosConstrutorBasico() {

        //instância um objeto da classe Random usando o construtor básico
        Random gerador = new Random();

        //imprime sequência de 10 números inteiros aleatórios entre 0 e 25
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(26));
         }
  
    }



    //Listagem 3: Especificando a semente.
    public void especificandoASemente() {

        //instância um objeto da classe Random especificando a semente
        Random gerador = new Random(19700621);

        //imprime sequência de 10 números inteiros aleatórios entre 0 e 25
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(26));
         }
    }



    //Listagem 4: Números reais.
    public void numerosReais() {

        Random r = new Random();

        System.out.println(r.nextDouble());
        System.out.println(r.nextFloat());
    }



    //Listagem 5: Gerando números reais e inteiros aleatórios de 0 à 100
    public  void GerarNumeroAleatorio() {

        Random random = new Random();

        int numeroInteiroAleatorio_0_a_10 = random.nextInt(10);
        System.out.println("Número inteiro aleatório de 0 até 10: " + numeroInteiroAleatorio_0_a_10);

        double numeroRealAleatorio_0_a_1 = random.nextDouble();
        System.out.println("Número real aleatório de 0 até 1: " + numeroRealAleatorio_0_a_1);

        double numeroRealAleatorio_0_a_10 = random.nextDouble() * 10;
        System.out.println("Número real aleatório de 0 até 10: " + numeroRealAleatorio_0_a_10);
    }



    //Listagem 6: Escolha 4 nomes numa lista de 10 e que eles nao se repitam
    public void aleatorioSemRepetir(){

        int [] array = new int[4];
        Random random = new Random();
        boolean temnumero = false;
        for (int i =0; i < 4; i ++)
        {
        int valor = random.nextInt(10);
        for (int j = 0; j < 4; j ++)
        {
        if (array[j] == valor)
        {
        
        j = 4;
        temnumero = true;
        }
        }
        
        if (!temnumero)
        {
        array[i] = valor;
        }
        
        else
        {
        temnumero = false;
        i--;
        }
        }
        
        for (int i = 0; i < 4; i ++)
        {
        System.out.println(array[i]);
        }
    }
        
        
        
    // método principal
    public static void main(String [] args) {
              
            ResultadosRandomicoo numerosAleatorios  = new ResultadosRandomicoo(); 
          
          System.out.println("==================RESULTADOS RANDOMICOS====================");
          System.out.println("Listagem 1: Exemplo básico de utilização da classe Random: ");
          numerosAleatorios.aleatoriosInteirosConstrutorPadrao();
        
          System.out.println("=======================================================================================");
          System.out.println("Listagem 2: Gerando sequência de números aleatórios inteiros com valores entre 0 e 25: ");
          numerosAleatorios.aleatoriosInteirosConstrutorBasico();
        
          System.out.println("========================================================================================");
          System.out.println("Listagem 3: Especificando a semente: ");
          numerosAleatorios.especificandoASemente();
        
          System.out.println("========================================================================================");
          System.out.println("Listagem 4: Números reais: ");
          numerosAleatorios.numerosReais();
        
          System.out.println("========================================================================================");
          System.out.println("Listagem 5: Gerando números reais e inteiros aleatórios de 0 à 100: ");
          numerosAleatorios.GerarNumeroAleatorio();
        
          System.out.println("========================================================================================");
          System.out.println("Listagem 6: Escolha 4 nomes numa lista de 10 e que eles nao se repitam: ");
          numerosAleatorios.aleatorioSemRepetir();      
    }

}

	
	
	
	
	
	
	
	
	
	
	


