package com.mycompany.a07;

/*crie uma função para calcular a media que receba uma lista de numeros como parametro e retorne a media aritimetica desses numeros
 */
public class Media {

    public static double calcularMedia(double[] numeros) {
        double soma = 0;

        // Somar todos os números do array
        for (double num : numeros) {
            soma += num;
        }

        // Calcular a média (soma dividida pela quantidade de números)
        double media = soma / numeros.length;

        return media;
    }

    public static boolean primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    
}
