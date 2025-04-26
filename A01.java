package com.mycompany.a01;

public class A01 {
  public static void main(String[] args) {
    // Create variables of different data types
    int idade = 50;
    String nome = "Juliano";
    double b_altura = 1.98;
    float valor = 2.99f;
    char corrente = '$';

//    Print variables
    System.out.println("Minha idade e: " + idade);
    System.out.println("Meu nome e: " + nome);
    System.out.println("Altura e: " + b_altura);
    System.out.println("Total cost = " + corrente + valor);
    System.out.println("Valor :" + corrente);
    
    //digite > sout + tab > System.out.println(""); > autocompleta
    System.out.println("");
    
    /*operações matemáticas */
    
    int n1 = 10;
    int n2 = 5;
    double n3 = 2.5;
    
    int soma = n1 + n2;
    int sub = n1 - n2;
    int div = n1 / n2;
    int mul = n1 * n2;
    System.out.println("soma : " + soma);
    System.out.println("subtracao :" + sub);
    System.out.println("divisao :" + div);
    System.out.println("multiplicacao :" + mul);
    
    int x = 10;
    x += 5;
      System.out.println("print" + x);
      
    double y = n1 /= n2;
      System.out.println("print" + y);
      
    /*operações matematicas basicas*/
    /*exe1*/
    
    double prod = 250.00;
    double desc = 15;
    double result = prod * desc /100;
        System.out.println(prod - result);
      
    /*exe2*/
    
    double val_conta = 139.00;
    double luz_multa = 10;
    double luz_result = val_conta * luz_multa /100;
      System.out.println(val_conta + luz_result);
   
    /*exe3*/  
    
    double raio = 5;
    double altura = 20;
    double pi = 3.1416;
        
        // Calculando a área lateral
        double areaLateral = 2 * pi * raio * altura;
        
        // Calculando o volume
        double volume = pi * raio * raio * altura; 
        
        System.out.println("Area lateral do cilindro: " + areaLateral + " cm²");
        System.out.println("Volume do cilindro: " + volume + " cm³");
        
    /*exe4*/
    
    double P1 = 10.0;
    double P2 = 8.5;
    double P3 = 7.3;
    double P4 = 8.9;
    
      System.out.println("Calculo da media " + (P1+P2+P3+P4)/4);
      
      
    /*exe5 - Calculo de IMC*/
    
    double peso = 79;
    double imc_altura = 1.70;
    
      System.out.println(peso / (imc_altura * imc_altura));
            
  }
}
