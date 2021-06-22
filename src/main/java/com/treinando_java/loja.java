package com.treinando_java;

public class Loja {
    // instance fields
    String tipoProduto;
    int inventoryCount;
    double inventoryPrice; 
  
    // constructor method
    public Loja(String produto, int count, double price ) {
  
      tipoProduto = produto;
      inventoryCount = count;
      inventoryPrice = price;
  
    }
    
    // main method
    public static void main(String[] args) {
      
      Loja cookieShop = new Loja("cookies", 12, 3.75 );
      Loja chocolateshop = new Loja ("chocolate", 15, 10.55);
      Loja Shoesstore = new Loja ("tênis", 30, 25.55);
      
      System.out.println (cookieShop);
      System.out.println (chocolateshop);
      System.out.println (Shoesstore);


      
    }
  }