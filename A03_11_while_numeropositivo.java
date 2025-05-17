package com.mycompany.a03;

import java.util.*;
import javax.swing.JOptionPane;

/*leia numero enquanto for menor que 10, peça para inserir outro numero */
public class A03_11_while_numeropositivo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        while (numero < 10) {

            System.out.println("digite numero: ");
            numero = scanner.nextInt();

        }
        System.out.println("Numero inserido " + numero);
    }
}
