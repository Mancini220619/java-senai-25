package com.mycompany.a07;

import java.util.Scanner;

public class Main_conta {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        
        Conta_Bancaria c1 = new Conta_Bancaria(nome, "0559", 0.0);
        
        c1.depositar(300);
        c1.sacar(50);
        c1.exibirSaldo();
        c1.dadosConta();
        
        int numero;
        
    }
}