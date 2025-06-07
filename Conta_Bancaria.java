package com.mycompany.a07;

public class Conta_Bancaria {

    /*atributos*/
    private String titular;
    private String conta;
    private double saldo;

    /* metodo contrutor >> cria representante pro atributo que esta privado*/
    public Conta_Bancaria(String titular, String conta, double saldo) {
        this.titular = titular;
        this.conta = conta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de: " + valor);
        System.out.println("Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque de: " + valor);
        System.out.println("Saldo atual: " + saldo);
    }

    public void exibirSaldo(){
        System.out.println("Saldo atualizado de " + titular + " R$: " + saldo);
    }
    
    public void dadosConta(){
        System.out.println("nome: " + titular + " conta: "+ conta + " saldo: "+ saldo);
    }
    
}
