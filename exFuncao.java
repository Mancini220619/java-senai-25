package com.mycompany.a07;

/*
 */
public class exFuncao {

    /*funcao >> sem parametro e sem retorno*/
 /*static >> pode ser usado sem que esteja associado a um objeto da classe*/
    public static void mensagem() {
        System.out.println("mensagem");
    }

      /* 2- funcao com parametro e com retorno*/
    /* funcao com retorno tem que estar associada a um tipo String, int boolean*/

    public static int Somar(int a, int b) {
        return a + b;
    }

    /* 3 funcao sem parametro e com retorno*/
    public static String aviso(){
        return "Finished";
    }
    
}
