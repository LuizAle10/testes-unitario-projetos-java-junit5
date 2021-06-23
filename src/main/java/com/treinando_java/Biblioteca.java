package com.treinando_java;

import java.util.ArrayList;


//construtor automatico botao direito -> inserir codigo
public class Biblioteca {
        
    public Biblioteca() {
    }
    
        
    private ArrayList<Livro> lista = new ArrayList<Livro>();
    
    
    
    public void addlivro(Livro nome_livro){
       lista.add(nome_livro);
    }
    
    public void listaBiblioteca(){        
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
    


public  Livro (){
    
    
    private String titulo;
    private String autor;
    private int id;

    public Livro(String titulo, String autor, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
    }
                    
        
    public void setTitulo(String titulo){
     
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;                
    }
    
    public String getAutor(String autor){
        return this.autor;
    } 
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(int id){
        return this.id;
    }     
    
}



public ProjetoBiblioteca() {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Livro livro1 = new Livro("Ricardo","Rita",12344);
        Livro livro2 = new Livro("O caçador de pipas ", "The king ", 122332);
        Livro livro3 = new Livro("awt", "teste", 33443);
        
        
        System.out.println(livro1);
        
        Biblioteca adcionar = new Biblioteca();
               
        
        adcionar.addlivro(livro1);
        adcionar.addlivro(livro2);
        adcionar.addlivro(livro3);
        
        adcionar.listaBiblioteca();
        
        
    }
}

/*
Oque está sendo impresso é o endereço de memória…
Para ser impresso os valores que foram atribuidos ao livro:

public void listaBiblioteca(){           
        for(int i=0; i<lista.size(); i++){   
            System.out.println(lista.get(i).getTitulo + " " + lista.get(i).getAutor);   
        }   
    }   

    */




