package com.mycompany.a03;

import java.util.*;
import javax.swing.JOptionPane;

/* Calcule desconto produto tipo user Premuim 15% Pro 10% start 5%*/
public class A03_05_desconto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double descontoPremium = 15;
        double descontoPro = 10;
        double descontoStart = 5;

        System.out.println("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o tipo de comprador");
        System.out.println("1 - Para Premium || 2 - Para Pro || 3 - Para Start");

        int tipoCliente = scanner.nextInt();

        if ((tipoCliente == 1) || (tipoCliente == 2) || (tipoCliente == 3)) {
            switch (tipoCliente) {
                case 1:
                    double valorFinalProd = (precoProduto * descontoPremium) / 100;
                    double precoFinalDesconto = precoProduto - valorFinalProd;
                    System.out.println("Cliente Premium selecionado");
                    System.out.println("Valor com desconto: " + precoFinalDesconto);
                    break;
                case 2:
                    double valorFinalProd2 = (precoProduto * descontoPro) / 100;
                    double precoFinalDesconto2 = precoProduto - valorFinalProd2;
                    System.out.println("Cliente Pro selecionado");
                    System.out.println("Valor com desconto: " + precoFinalDesconto2);
                    break;
                case 3:
                    double valorFinalProd3 = (precoProduto * descontoStart) / 100;
                    double precoFinalDesconto3 = precoProduto - valorFinalProd3;
                    System.out.println("Cliente Start selecionado");
                    System.out.println("Valor com desconto: " + precoFinalDesconto3);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Operacao invalida");
                    throw new AssertionError();
            }
        } else {
            System.out.println("Este tipo de cliente nao existe");
        }
    }
}
