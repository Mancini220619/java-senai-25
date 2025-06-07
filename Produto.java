package com.mycompany.a07;

/* armazenar produtos e seus repespctivos preço em um vetor, com orientação a objeto para criar uma classe que seja responsavel por modelar os objetos, seus atributos e metodos
 */
public class Produto {

    private String nome;
    private double preco;
    private double qtd;

    public Produto(String nome, double preco, double qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }    

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    public double getQtd() {
        return qtd;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome + " Preco: " + preco + " Quantidade: " + qtd);
    }
}

