package com.mycompany.a03;

import java.util.*;
import javax.swing.JOptionPane;


/*Calculadora
 */
public class A03_04_calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero 1: ");
        double N1 = scanner.nextDouble();
        System.out.println("Digite o numero 2: ");
        double N2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Escolha a operação: [+] [-] [*] [/]");
        String operacao = scanner.nextLine();
        
        switch (operacao) {
            case "+":
                System.out.println("Resultado: " + (N1+N2));
                break;
            case "-":
                System.out.println("Resultado: " + (N1-N2));
                break;
            case "/":
                if (N1 == 0 || N2 == 0) {
                    System.out.println("Nao divida por 0, erro");
                    break;
                }
                System.out.println("Resultado: " + (N1/N2));
                break;
            case "*":
                System.out.println("Resultado: " + (N1*N2));
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Operacao invalida");
                throw new AssertionError();
        }
        scanner.close();
    }
}