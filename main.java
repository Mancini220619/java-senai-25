package com.mycompany.a07;

//import java.util.Scanner
        
public class main {
    
    
    /* como  chamar uma função que nao depende de objeto*/
    public static void main(String[] args){
        exFuncao.mensagem();
        
        
        System.out.println("resultado " + exFuncao.Somar(10, 5));
        
        
        /* outra maneira de printar na tela com uma função */
        String msg = exFuncao.aviso();
        System.out.println(msg);
        
        
    }
    
  
        
    
}
