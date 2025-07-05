package com.mycompany.a08;

public class ProdutoEletronico extends Produto {

    private String NF;

    public ProdutoEletronico(String nome, double preco, int id, String NF) {
        super(nome, preco, id);
        this.NF = NF;
    }

    @Override
    public void mostrarDetalhes() {
        /* cria um metodo novo para mostrar detalhes */
        
        super.mostrarDetalhes();
        System.out.println("NF: " + NF);
        /*adiciona ao metodo mostrarDetalhes uma nova informação a NF do produto*/
    }
}