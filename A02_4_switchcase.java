package com.mycompany.a02;

import java.util.Scanner;

/**
 *
 * switch case
 */
public class A02_4_switchcase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*int diaSemana = scanner.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia nao existe");
                throw new AssertionError(); */

            int codProduto = scanner.nextInt(); 

            switch (codProduto) {
                case 100:
                    System.out.println("GM");
                    break;
                case 200:
                    System.out.println("Volks");
                    break;
                case 300:
                    System.out.println("BYD");
                    break;
                case 400:
                    System.out.println("Fiat");
                    break;

                default:
                    System.out.println("codigo nao encontrado");
                    throw new AssertionError();
            }
    }
}
