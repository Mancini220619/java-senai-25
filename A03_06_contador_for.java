package com.mycompany.a03;

import java.util.Scanner;

public class A03_06_contador_for {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        /*Crie um programa que solicite um numero e que inicie uma contagem regressiva ate o 0*/
        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 0; i--) {
            
//            System.out.println(i);
//            
//            Thread.sleep(1);
//            
            int contagem = +i;
            System.out.println("variavel i: " + i);
            System.out.println("Seu tempo acabou: " + contagem);

        }
    }
}
