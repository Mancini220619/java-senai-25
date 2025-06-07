package com.mycompany.a07;

import java.util.Scanner;
        
        
public class Cadastroprodutos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produto[] produtos = new Produto[2];

        int contador = 0;

        while (true) {

            System.out.println("1 - cadastrar");
            System.out.println("2 - listar");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt(); 
            
            scanner.nextLine();//limpar buffer

            switch (opcao) {
                case 1:
                    if (contador < produtos.length) {

                        System.out.println("Nome do produto: ");
                        String nome = scanner.nextLine();

                        System.out.println("Preço do produto: ");
                        double preco = scanner.nextDouble();
                        
                        System.out.println("Quantidade do produto: ");
                        double qtd = scanner.nextDouble();
                        
                        scanner.nextLine();//limpar buffer

                        produtos[contador] = new Produto(nome, preco, qtd);

                        contador++;

                        System.out.println("Produto cadastrado com sucesso");
                    } else {
                        System.out.println("\nLlista de produtos atingido");
                    }
                    break;

                case 2:

                    System.out.println("Lista de produtos");
                    for (int i = 0; i < contador; i++) {
                        produtos[i].exibirProduto();

                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    scanner.close();

                default:
                    System.out.println("Opção invalida");
            }

        }

    }

}
