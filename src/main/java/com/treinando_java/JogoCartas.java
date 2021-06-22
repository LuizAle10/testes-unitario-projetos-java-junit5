package com.treinando_java;


//7
//Como randomizar os valores de um objeto em java

/*
Estou construindo um programa de jogo de cartas, no qual em um determinado momento ele deverá misturar as cartas e pegar a que está na posição 0, mas não consigo fazer isso. Segue o código:
*/


import java.util.Random;


public class JogoCartas {

    JogoCartas[] cartas = new JogoCartas[52];
    String[] naipes = {"Copas", "Espada", "Ouros", "Paus"};
    String[] nomes = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String coringa;
    Random aleatorio = new Random();

    public JogoCartas() {
        int cont = 0;
        for (String naipe : naipes) {
            for (String nome : nomes) {
                JogoCartas cartas = new JogoCartas();
                cartas.setNaipe(naipes);
                cartas.setNome(nomes);
                this.cartas[cont] = cartas;
                this.embaralha(naipes);
                cont++;
            }
        }
        System.out.println(cartas);//Teste
    }
    public void embaralha(String[] carta) {//Esta parte aqui!
        
        aleatorio.naipes();
    }
    
    public void daCarta() {
       
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[0] == null) {
                break;
            }else {
                System.out.println(cartas[0]);
            }
        }
    }
   
    public boolean temCarta() {
        boolean TouF = true;
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] != null) {
                TouF = false;
            }else {
                TouF = true;
            }
        }
        return TouF;
    }
   
    public void imprime() {
        for (int i = 0; i < cartas.length; i++) {
            System.out.println(cartas[i]);
        }
    }
    }
    
    
    /*Você pode usar o método shuffle() da classe Collections. Ele recebe uma lista como parâmetro. Como você tem um array, utilize o Arrays.asList() para converter o array em lista.
    
    Supondo que você tenha um array chamado baralho, tudo o que você precisa para embaralhá-lo é usar:
    
    Collections.shuffle(Arrays.asList(baralho));
    O exemplo abaixo vai imprimir um valor aleatório cada vez que o programa é executado:  
    
    
    public static void main(String[] args) {
    
        String[] baralho = new String[20];
        for (int i = 0; i < baralho.length; i++) {
            baralho[i] = String.valueOf(i);
        }
    
        Collections.shuffle(Arrays.asList(baralho));
        System.out.println(baralho[0]);
    }
    
    */
    
    
    