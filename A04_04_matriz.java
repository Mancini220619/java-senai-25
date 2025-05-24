package com.mycompany.a04;

/* matriz
 */
public class A04_04_matriz {
    public static void main(String[] args) {
        
        int [][] matriz = new int [3][3];
        /*
        [][][]
        [][][]
        [][][]
        */
        int[][] matriz1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int linhas = 0, colunas = 0;
        int [][] matriz2 = new int [linhas][colunas];
        System.out.println(matriz1[2][1]); /* primeiro linha depois coluna*/
        
        /*repetição aninhada*/
        
        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1.length; coluna++) {
                System.out.println(matriz1[linha][coluna]);
                
            }
        }
    }

}
