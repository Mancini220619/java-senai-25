package com.mycompany.a06_exemplo_classe;

public class main {

    public static void main(String[] args) {
        /* criar objeto */
        /* <nome-da-classe> <nome-do-usuario> */

        Usuario usuario = new Usuario();

        /*atributos*/
        
        usuario.nome = "Astolfo";
        usuario.senha = "1234";
        usuario.ID = 0001;
        
        usuario.exibirInfo();
        usuario.logar();
        
    }
}
