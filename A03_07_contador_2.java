package com.mycompany.a03;

import java.util.Scanner;

public class A03_07_contador_2 {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        /*Crie um programa que solicite um numero e que inicie uma contagem de 2 em 2, no caso aqui até 20*/
        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();

        for (int i =0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }
}
