package com.mycompany.a04;

import javax.swing.JOptionPane;

public class A04_02_Temperatura_Perfumaria {

    public static void main(String[] args) {

        String semana[] = {"segunda", "terca", "quarta", "quinta", "sexta", "sabado", "domingo"};
        double[] temperatura = new double[7];
        double media = 0;

        for (int i = 0; i < semana.length; i++) {
            String entrada = JOptionPane.showInputDialog("Digite a Temperatura media do dia: " + semana[i] + ": ");
            temperatura[i] = Double.parseDouble(entrada);
            media += temperatura[i];
        }

        media /= semana.length;

        String mensagem = "Dias com temperatura acima da média:\n";
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > media) {
                mensagem += "Dia " + (i + 1) + ": " + String.format("%.2f", temperatura[i]) + "ºC\n";
            }
        }

        mensagem += "\nMédia da semana: " + String.format("%.2f", media) + "ºC";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
