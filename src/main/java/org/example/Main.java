package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Digite um numero ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();

        } while (resp.equals("S"));
        System.out.println("A soma dos valores é " + s);

//
//                System.out.println("Encerrado");





    }
}