package com.mycompany.a04;

import java.util.Scanner;

/*  */
public class A04_03_petshop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* passo 1 inicializar vetores*/
        String[] nomes = new String[5];
        String[] especies = new String[5];

        /*passo 2 iniciaicalizar a variavel de contagem da quantidade*/
        int qtGatos = 0, qtPassaros = 0, qtCachorros = 0;

        /*passo3 leitura de dados*/
        for (int indice = 0; indice < 5; indice++) {
            System.out.println("Nome do Pet :" + (indice + 1) + ": ");
            nomes[indice] = scanner.nextLine();
            System.out.println("Especie (gato, passaro ou cachorro: ");
            especies[indice] = scanner.nextLine();

            /*passo4 contabilizar especie*/
            switch (especies[indice]) {
                case "gato" -> {qtGatos++;}
                case "cachorro" -> {qtCachorros++;}
                case "passaro" -> {qtPassaros++;}
                default -> System.out.println("Erro.");
            }
        }

        /* passo 5 - lista dos animais */
        for (int indice = 0; indice < 5; indice++) {
            System.out.println("Nome: " + nomes[indice] + " |" + "Especie: " + especies[indice]);
        }
        System.out.println("Quantidade por especie");
        System.out.println("Gato: " + qtGatos);
        System.out.println("Cachorro: " + qtCachorros);
        System.out.println("Passaro: " + qtPassaros);
        
        /* passo 7 - identificar espeie + atendida*/
        
        String atendidos;
        if (qtGatos>= qtCachorros && qtGatos >= qtPassaros){
            System.out.println("Gatos");
        } else if (qtCachorros >= qtPassaros){
            System.out.println("Cachorros");
        }else {
            System.out.println("Passaros");
        }
    
    
    }
}
