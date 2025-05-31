package com.mycompany.a05;

import java.util.*;
import javax.swing.JOptionPane;

/*Calculadora
 */
public class A05_Calculadora {

    public static void main(String[] args) {

        try {
            String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
            double num1 = Double.parseDouble(input1);

            String operador = JOptionPane.showInputDialog("Digite o operador (+, -, *, /):");

            String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
            double num2 = Double.parseDouble(input2);

            double resultado = 0;
            boolean operacaoValida = true;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num1 == 0 || num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: divisão por zero.");
                        operacaoValida = false;
                    } else {
                        resultado = num1 / num2;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operador inválido. Use apenas +, -, * ou /.");
                    operacaoValida = false;
            }

            if (operacaoValida) {
                String msg = String.format("Resultado: %.2f %s %.2f = %.2f", num1, operador, num2, resultado);
                JOptionPane.showMessageDialog(null, msg);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: você digitou um valor inválido (letra ou símbolo).");
        } finally {
            JOptionPane.showMessageDialog(null, "Executado com sucesso");
        }
    }
}


//NumberFormatException: Ocorre ao tentar converter uma string mal formatada em número, como "abc" para int.
//
//InputMismatchException: Lançada quando o Scanner recebe um tipo diferente do esperado (ex: letra em vez de número).
//
//ArithmeticException: Exceção gerada por erros matemáticos, como divisão por zero (10 / 0).