package com.mycompany.a04;

import java.util.Scanner;

/*  */
public class A04_01_temperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String semana[] = {"segunda", "terca", "quarta", "quinta", "sexta", "sabado", "domingo"};
        double[] temperatura = new double[7];
        double media = 0;

        for (int i = 0; i < semana.length; i++) {
            System.out.print("Informe a temperatura " + semana[i] + ": ");
            temperatura[i] = scanner.nextDouble();
            media += temperatura[i];

        }
        System.out.println("\ntemperaturas registradas");
        for (int i = 0; i < semana.length; i++) {
            System.out.println(semana[i] + ": " + temperatura[i] + "ºC");

        }
        double finaltemp = media / temperatura.length;
        System.out.println("temperatura média: " + finaltemp);

        /*calculo de dias com temperatura acima da media*/
        System.out.println("Dias com temperatura acima da media");

        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > finaltemp) {
                System.out.printf("Dia %d %.2fc\n", (i + 1), temperatura[i]);
            }
        }
        scanner.close();
    }
}
