package com.mycompany.a02;

/**
 * aprovado ou reprovado
 */
import java.util.Scanner;

public class A02_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double limiteFaltas = 100;

        System.out.println("digite n1: ");
        double n1 = scanner.nextDouble();

        System.out.println("digite n2: ");
        double n2 = scanner.nextDouble();

        System.out.println("digite n3: ");
        double n3 = scanner.nextDouble();

        System.out.println("digite n4: ");
        double n4 = scanner.nextDouble();

        System.out.println("digite as faltas do aluno: ");
        double numeroFaltas = scanner.nextDouble();

        double media = (n1 + n2 + n3 + n4)/4;

        double saldoFaltas = (numeroFaltas / limiteFaltas) * 100;
        
        System.out.println("" + saldoFaltas);

        if (media >= 6 && saldoFaltas < 75) {
            System.out.println("Aprovado com média: " + media);
            System.out.println("Porcentagem de faltas: " + saldoFaltas + "%");
        } else {
            System.out.println("Reprovado por média: " + media);
            System.out.println("Porcentagem de faltas: " + saldoFaltas + "%");
        }

        scanner.close();
    }

}
