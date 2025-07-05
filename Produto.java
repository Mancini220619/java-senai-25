package com.mycompany.a08;

/* HERANCA

classe produto (atual) > classe pai ou superclass
classe produtoAlimenticio > classe filha ou classe derivada
classe PodutoEletronico > calsse filha ou classe derivada

extends > palavra chave que permite de uma classe deriva informações de outra

*/

public class Produto {
    
    /*Atributos da classe*/
    private String Nome;
    private double Preco;
    private int ID;
    
    /*Metodo construtor - é uma função que padroniza a criação de objetos, ele precisa ter o mesmo nome da classe, alem de garantir que os atributos (privados) possam sem acessados*/
    /* este é um metodo com parametro e sem retorno*/
    public Produto (String nome, double preco, int id){
        this.Nome = nome;
        this.Preco = preco;
        this.ID = id;
    }
    
    /* Getters e Setters (ENCAPSULAMENTO)
    Getters >> get (pega as informações) atributo de leitura
    Setters >> post (modificam as informações) atributo de escrita
    
    Quero apenas acessar o atributo > somente get
    Quero apenas modificar o atributo > somente set    
    Quero leitura e modificacao o atributo > get e set
    */

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        if (Preco > 0) {
        this.Preco = Preco;
    } else {
            System.out.println("Preco invalido");
        }
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    
    
    /*Metodo que exibe as info dos produtos*/
    /*void representa que o metodo nao possui retorno,ou seja, o retorno é vazio*/
    
    public void mostrarDetalhes(){
        System.out.println("Produto "+ Nome);
        System.out.println("Preco "+ Preco);
        System.out.println("ID "+ ID);
    }
    
}
