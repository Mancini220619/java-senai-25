package com.mycompany.a08;

public class ProdutoAlimenticio extends Produto {

 /* extends > indica que uma classe esta herdando outra, ou seja, a classe ProdutoAlimenticio herda os atributos e metodos da classe produuto */
 /*criando novos atributos*/
    
    private String dataValidade;

    public ProdutoAlimenticio(String Nome, double preco, int ID, String dataValidade) {

        /* super > palavra reservada utilizada no computador da classe derivada e acessa metodos da classe pai */
        super(Nome, preco, ID);
        this.dataValidade = dataValidade;
        
        /* this indica que */
        
        
    }
    
}
