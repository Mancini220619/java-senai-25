package com.mycompany.a08;

import java.util.*;
import javax.swing.JOptionPane;

public class ExecLivro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* criando vetor de objetos */
        Livro[] livros = new Livro[5];
        int contador = 5;

        System.out.println("Kindle da boa - cadastro de livros");

        for (int i = 0; i < livros.length; i++) {
            System.out.println("Titulo: ");
            String titulo = JOptionPane.showInputDialog("Titulo: ");
            System.out.println("Autor: ");
            String autor = JOptionPane.showInputDialog("Autor: ");
            System.out.println("Ano: ");
            String Ano = JOptionPane.showInputDialog("Ano: ");
            int ano = Integer.parseInt(Ano);
            
            livros[i] = new Livro(titulo, autor, ano);

        }

        for (int i = 0; i < livros.length; i++) {
            livros[i].exibirLivro();

        }
        
        StringBuilder listaLivros = new StringBuilder();
        
        for (int i = 0; i < livros.length; i++) {
            listaLivros.append(livros[i].toString()).append('\n');
            livros[i].exibirLivro();
        }
        JOptionPane.showMessageDialog(null, "Livros cadastrados: \n" + listaLivros.toString());
    }
}