package com.mycompany.a05;
import java.util.*;
/* 
 */
public class A05_Tratamento_excecoes {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
                    
        try {
            System.out.println("Digite o numerador: ");
            int numerador = Integer.parseInt (scanner.nextLine());
            
            System.out.println("Digita o denominador: ");
            int denominador = Integer.parseInt (scanner.nextLine());
                    
            int resultado = numerador / denominador;
            System.out.println("Resultado " + resultado);
        
        } catch (ArithmeticException e) {
        //} catch (NumberFormatException e) {
            System.out.println("digite numeros inteiros" + e.getMessage());
        } finally {
            System.out.println("executado com sucesso");
    }
        scanner.close();
    }
}
