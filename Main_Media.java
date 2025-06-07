package com.mycompany.a07;

public class Main_Media {

    public static void main(String[] args) {

        double media = Media.calcularMedia(new double[]{1,2,10,15,16,18});
        System.out.println("A média é: " + media);
        
        System.out.println(Media.primo(27));
        System.out.println(Media.primo(17));
        System.out.println(Media.primo(11));
        System.out.println(Media.primo(2));
        System.out.println(Media.primo(10));
        System.out.println(Media.primo(21));
        
    }

}   