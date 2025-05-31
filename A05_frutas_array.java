package com.mycompany.a05;

import java.util.Scanner;

/* lISTA DE COMPRAS UTILIZANDO MATRIZ, OBJETIVO CCRIE PROGRAMA 5 ITENS INSERIDOS, ARMAZENAR EM UMA STRING
 */
public class A05_frutas_array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* passo 1 inicializar vetores*/
        String[] frutas = new String[5];
                
        for (int indice = 0; indice < 5; indice++) {
            System.out.println("Nome da fruta: " + (indice + 1) + ": ");
            frutas[indice] = scanner.nextLine();
            }
        for (int i = 0; i < 5; i++) {
            System.out.println("Nome das Frutas " + frutas[i]);
            
        }
       }
                       
        
    }

