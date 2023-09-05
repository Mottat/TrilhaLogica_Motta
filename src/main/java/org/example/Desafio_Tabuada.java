package org.example;

import java.util.Scanner;

public class Desafio_Tabuada {
    public static void main(String[] args) {
        int num=1, n1=1, r=0;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num=teclado.nextInt();

        if (num >= 1 && num <= 10) {
            do {
                r = num * n1;
                System.out.println(num + " x " + n1 + " = " + r);
                n1++;
            }while (n1 <= 10);
        } else {
            System.out.println("Digite um numero valido entre 1 e 10");
        }
    }
}
