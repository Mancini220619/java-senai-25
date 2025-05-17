package com.mycompany.a03;

import java.util.Scanner;

/* IMC */
public class A03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc > 29.9 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc > 39.9 && imc <= 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }
        scanner.close();
    }
}
