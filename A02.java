package com.mycompany.a02;

import java.util.Scanner;

public class A02 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
                System.out.println("digite seu salario $ : ");
                double salFunc = scanner.nextDouble();
                
                System.out.println("desconto inss $ : ");
                double desInss = scanner.nextDouble();
                
                System.out.println("desconto irpf $ : ");
                double desIrpf= scanner.nextDouble();
                
                double bonusFunc = 8;
                
                
                double salAcrescimo = salFunc + (salFunc * bonusFunc/100);
                System.out.println("Salario com bonus: " + salAcrescimo);

                System.out.println("Salario: " + salFunc);
                double resInss = salAcrescimo * (desInss / 100);
                
                System.out.println("Desconto INSS: " + resInss);
                double resIrpf = salAcrescimo * (desIrpf / 100);
                
                System.out.println("Desconto IRPF: " + resIrpf);
                double salDesconto = salAcrescimo - (resIrpf + resInss);
                
                System.out.println("Salario com descontos: " + salDesconto);
                
                scanner.close();
    }
}
