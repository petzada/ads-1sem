// Escreva um programa que leia um valor inteiro N.
// N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
package com.mycompany.prova;

import java.util.Scanner;

public class Prova6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, x, y, z;
        n = sc.nextInt();

        for (z = 1; z <= n; z++) {
            
            x = z * z;
            y = z * z * z;

            System.out.println(z + " " + x + " " + y);
            
        }

    }

}
