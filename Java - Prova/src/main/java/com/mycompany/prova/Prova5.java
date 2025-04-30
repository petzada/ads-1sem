// Tempo do coelhinho
package com.mycompany.prova;

import java.util.Scanner;

public class Prova5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, a, b;

        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        if (a + b <= n) {

            System.out.println("Farei hoje!");

        } else {

            System.out.println("Deixa para amanhã!");

        }
    }
}
