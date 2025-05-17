package com.mycompany.a03;

import java.util.*;
import javax.swing.JOptionPane;

/* senhas com while - acesso negado apos 3 tentativas */
public class A03_10_senhas_while {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String login = "admin";
        String senha = "1234";

        int contador = 0;

        while (contador < 3) {

            System.out.println("login: ");
            String loginTeste = scanner.nextLine();

            System.out.println("senha: ");
            String senhaTeste = scanner.nextLine();

            /*.equalsIgnoreCase ignora case sensitive*/
            if (loginTeste.equals(login) && senhaTeste.equals(senha)) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha invalido");
            }

            contador++;
            System.out.println(contador);
        }
            System.out.println("Acesso Negado");
    }
}
