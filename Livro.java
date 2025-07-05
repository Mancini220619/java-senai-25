
package com.mycompany.a08;

public class Livro {
    
    private String Titulo, Autor;
    private int Ano;

    public Livro(String titulo, String autor, int ano) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.Ano = ano;
    }
    
    @Override
    public String toString(){
        return "Titulo " + Titulo + " Autor " + Autor + " Ano: " + Ano;
    }

    /* metodo paraexibir dados de cada livro*/
    
    public void exibirLivro(){
        System.out.println("----------------------------------------");
        System.out.println(" Titulo: " + Titulo + " Autor: " + Autor + " Ano: "+ Ano);
    }
    
    //public void 
    
}
