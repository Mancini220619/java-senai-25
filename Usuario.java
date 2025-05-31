package com.mycompany.a06_exemplo_classe;

public class Usuario {

    /*atributos do objeto > caracteristica*/
 /*usuario: nome id senha        */
    String nome, senha;
    int ID;

    /*atribuindo valores ao atributos*/
    public void exibirInfo() {

        System.out.println("Nome: " + nome);
        System.out.println("ID: " + ID);
        System.out.println("Senha: " + senha);

    }

    /* usando os metodos do objeto */
    public void logar() {
        System.out.println(nome + "\nlogado");

    }
}
