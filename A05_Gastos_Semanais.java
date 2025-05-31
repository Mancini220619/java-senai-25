package com.mycompany.a05;

import java.util.*;
import javax.swing.JOptionPane;

public class A05_Gastos_Semanais {

    public static void main(String[] args) {
        String[] dias = {"segunda", "terca", "quarta", "quinta", "sexta", "sabado", "domingo"};
        double[][] gastos = new double[2][7]; //[Semanas] [Dias]
        double total = 0;
        /*double [linhas = semanas][colunas = dias] gastos = new double[2 semanas][7 dias]*/

 /*Entrada de Dados -> loop for aninhado*/
        for (int semana = 0; semana < 2; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                /*JOptionPane serve para apresentar o pop-up na tela*/
                String entrada = JOptionPane.showInputDialog("Digite o gasto da semana" + (semana + 1) + ": " + dias[dia]);
                gastos[semana][dia] = Double.parseDouble(entrada);

                total += gastos[semana][dia];
                System.out.println(total);

            }

        }
        double media = total / 14;
        String mensagem = "gastos totais das duas semanas: R$ " + String.format("%.2f", total);
        mensagem += "Media de gastos por dia: R$ " + String.format("%.2f", media);
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
