// Leia dois números double e mostre a subtração e divisão:
package com.mycompany.prova;

import java.util.Scanner;

public class Prova3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, sub, div;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        sub = n1 - n2;
        div = n1 / n2;

        System.out.println("Divisão = " + div);
        System.out.println("Subtração = " + sub);

    }
}
