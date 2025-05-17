package com.mycompany.a03;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author D18_11
 */
public class A03_02_senha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String login = "admin";
        String senha = "1234";

        System.out.println("login: ");
        String loginTeste = scanner.nextLine();

        System.out.println("senha: ");
        String senhaTeste = scanner.nextLine();

        /*.equalsIgnoreCase ignora case sensitive*/
        
        if (loginTeste.equals(login) && senhaTeste.equals(senha)) {
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha invalido");
        }
        scanner.close();
    }
}
