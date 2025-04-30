// Faça um algoritmo que leia um número inteiro e escreva se é par ou ímpar:
package com.mycompany.prova;

import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        if (n % 2 == 0) {

            System.out.println("Par");

        } else {

            System.out.println("Ímpar");

        }
    }
}
