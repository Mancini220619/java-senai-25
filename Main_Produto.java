/*classe main é responsavel pela execução*/

package com.mycompany.a08;

public class Main_Produto {

    public static void main(String[] args) {
        /* Instanciando o objeto
        Instanciar é a mesma coisa que criar, chamar o objeto*/
        
        Produto produto1 = new Produto ("Projetor", 999.00, 333);
        Produto produto2 = new Produto ("Fusca", 3339.00, 999);
        Produto produto3 = new Produto ("Batata", 2.00, 111);
        
        /*Chamando/Executando um metodo para o objeto*/
        
        produto1.mostrarDetalhes();
        produto2.mostrarDetalhes();
        produto3.mostrarDetalhes();
        
        /* utilizando getters e setters*/
        
        produto1.setPreco (4200.00);
        produto1.mostrarDetalhes();
        produto1.setNome("Projetor mais caro");
        
        produto1.mostrarDetalhes();
        produto1.setPreco (200.00);
        produto1.setNome("Projetor mais barato");
        produto1.mostrarDetalhes();
        
    }
}
