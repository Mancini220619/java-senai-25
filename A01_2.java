package com.mycompany.a01;

    import java.util.Scanner;
        public class A01_2 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner (System.in);

                /*System.out.println("Escreva alguma coisa aqui :");
                String frase = scanner.nextLine();
                System.out.println("Voce digitou: " + frase);
                
                System.out.println("Escreva um numero");
                int numeroInt = scanner.nextInt();
                System.out.println("Voce digitou " + numeroInt + " inteiros");
                
                double numeroDouble = scanner.nextDouble(); */
                
                /*Se o usuário digitar várias palavras com espaços (como "Olá Mundo"), o next() vai pegar apenas a primeira palavra ("Olá").*/
     //           String caractere = scanner.next();
                
                
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

    }
}
