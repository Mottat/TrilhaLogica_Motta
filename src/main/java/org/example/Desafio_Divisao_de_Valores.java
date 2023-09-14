package org.example;

import java.util.Scanner;

public class Desafio_Divisao_de_Valores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1=0, n2=0, resp=0, resto=0;
        String res = "";

        do {
            System.out.print("\nDigite o primeiro número: ");
            n1 = teclado.nextInt();
            System.out.print("\nDigite o segundo número: ");
            n2 = teclado.nextInt();

            if (n2 > 0){
//                resp = n1 / n2;
                resto = n1 % n2;
//                System.out.println("\nA divisão de " + n1 + " por " + n2 + " é: " + resp);
                System.out.println("\nO resto da divisão de " + n1 + " por " + n2 + " é: " + resto);
            } else {
                System.out.println("\nInformar um número valido");
            }
            System.out.print("\nDeseja continuar? ");
            res = teclado.next().toLowerCase();

        }while (res.equals("s"));
    }
}
