package com.treinando_java;

public class loja {
    // instance fields
    String tipoProduto;
    int inventoryCount;
    double inventoryPrice; 
  
    // constructor method
    public loja(String produto, int count, double price ) {
  
      tipoProduto = produto;
      inventoryCount = count;
      inventoryPrice = price;
  
    }
    
    // main method
    public static void main(String[] args) {
      
      loja cookieShop = new loja("cookies", 12, 3.75 );
      loja chocolateshop = new loja ("chocolate", 15, 10.55);
      loja Shoesstore = new loja ("tênis", 30, 25.55);
      
      System.out.println (cookieShop);
      System.out.println (chocolateshop);
      System.out.println (Shoesstore);


      
    }
  }