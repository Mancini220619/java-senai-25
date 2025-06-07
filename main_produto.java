
package com.mycompany.a07;

public class main_produto {
    public static void main (String[] args) {
        /* instanciar um objeto é a mesma coisa que utilizar um molde fornecido para criar o objeto e fazer uso dos metodos dele.
        Classe >> é a receita do bolo
        Instancia >> como usar a receita para fazer o bolo
        Definição >> Instanciar é criar um objeto seria o processo de criação e um objeto real baseado na estrutura definida por uma classe*/
        
        
        Produtos produto1 = new Produtos();
        
        produto1.nome = "Sabao liquido 21";
        produto1.preco = 23.90;
        produto1.quantidade = 10;
        
        produto1.exibirinfo();
        
    }
    
}
