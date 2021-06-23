package com.treinando_java;


public class ContaPoupanca {
  
    int saldo;
    
    public ContaPoupanca(int balancoInicial){
      saldo = balancoInicial;
    }
    
    public static void main(String[] args){
      ContaPoupanca poupanca = new ContaPoupanca(2000);
      
      //Verifique o saldo
      System.out.println("Olá!");
      System.out.println("Seu saldo atualizado é de R$ "+ poupanca.saldo);
      System.out.println("======================================");
      
      //Depois de retirar
      int aposSacar = poupanca.saldo - 300;
      poupanca.saldo = aposSacar;
      System.out.println("Olá!");
      System.out.println("Você acabou de sacar R$ "+ 300);
      System.out.println("======================================");
      
      //Verifique o saldo
      System.out.println("Olá!");
      System.out.println("Seu saldo atualizado é de R$ " + poupanca.saldo);
      System.out.println("======================================");
      
      //Depósito
      int aposDeposito = poupanca.saldo + 600;
      poupanca.saldo = aposDeposito;
      System.out.println("Você acabou de depositar R$ "+ 600);
      System.out.println("======================================");
      
      //Verifique o saldo
      System.out.println("Olá!");
      System.out.println("Seu saldo é atualizado é de R$ "+ poupanca.saldo);
      System.out.println("======================================");
      
      //Depósito
      int aposDeposito2 = poupanca.saldo + 600;
      poupanca.saldo = aposDeposito2;
      System.out.println("Você acabou de depositar R$ " + 600);
      System.out.println("======================================");
      
      //Verifique o saldo
      System.out.println("Olá!");
      System.out.println("Seu saldo é de R$ " + poupanca.saldo);
      System.out.println("======================================");

      //Sem limite na conta
      //Depósito
      int aposDeposito3 = poupanca.saldo - 2900;
      poupanca.saldo = aposDeposito3;
      System.out.println("Você acabou de sacar R$ "+ 2900);
      System.out.println("======================================");

      //Verifique o saldo
      System.out.println("Olá!");
      System.out.println("Seu saldo é de R$ " + poupanca.saldo);
      System.out.println("======================================");
      
      if (poupanca.saldo == 0) {
         System.out.println("Seu saldo é de R$ 0, por esse motivo\nnão é possivel seguir com a solicitação");
      }
    }       
}
  