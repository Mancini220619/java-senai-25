package com.mycompany.a04;

import java.util.Scanner;

/* array ou vetores */
public class A04 {

    public static void main(String[] args) {

//        // declaração arrays
//        int [] numeros;
//        
//        //inicialização com valores
//        int [] notas = {1,2,3,4,5};
//        
//        //inicialização por tamanho
//        int [] quantidade = new int [10];
//        /* [][][]][][][][]..........*/
//        
//        /* acesso e modificação dos elementos */
//        int [] numeros1 = {10,20,30,40,50};
//        System.out.println(numeros1[2]);
//        System.out.println("modificando o valor");
//        numeros1 [2] = 100;
//        
//        System.out.println(numeros1[2]);
//        
//        
//        /* iterar sobre arrays - for */
//        
//        for (int i = 0; i < numeros1.length; i++) {
//            System.out.println("Elemento na posicao " + i + " i " + numeros1[i]);
//            
//        /* for-each */
//        
//            for (int num : numeros1) {
//                System.out.println("ler num "+ num);
//                
//            }
//            
//        }
//        
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars[1]);

        /* passo 1: definindo o tamamho pelo usuario array*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos numeros deseja inserir");
        int tamanho = scanner.nextInt();
        double [] numeros = new double [tamanho];
        
        //passo 2 lendo numeros//
        double soma = 0;
        
        for (int i = 0; i< numeros.length; i++){
            System.out.println("digite o numero " + (i+1)+ ", ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
            System.out.println("o valor de soma e [" + soma + "]");
        }
        
        double media = soma/tamanho;
        System.out.println("Media "+ media + "YES");
            
    }
}
