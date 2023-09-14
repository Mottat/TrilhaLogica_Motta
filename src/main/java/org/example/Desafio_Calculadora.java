package org.example;

import java.util.Scanner;

public class Desafio_Calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String resp, calculo = "";
        int n1, n2, result = 0;

        do {
            System.out.print("\nDigite o primeiro numero: ");
            n1 = teclado.nextInt();

            System.out.print("\nDigite a operação: ");
            calculo = teclado.next();

            System.out.print("\nDigite o segundo numero: ");
            n2 = teclado.nextInt();

            switch (calculo){
                case "+":
                    result = n1 + n2;
                    System.out.println("\nA soma de " + n1 + " " + calculo + " " + n2 + " é: " + result);
                    break;
                case "-":
                    result = n1 - n2;
                    System.out.println("\nA subitração de " + n1 + " " + calculo + " " + n2 + " é: " + result);
                    break;
                case "*":
                    result = n1 * n2;
                    System.out.println("\nA multiplicação de " + n1 + " " + calculo + " " + n2 + " é: " + result);
                    break;
                case "/":
                    result = n1 / n2;
                    System.out.println("\nA divisão de " + n1 + " " + calculo + " " + n2 + " é: " + result);
                    break;
                default:
                    break;
            }

            System.out.print("\nDeseja fazer outro calculo? ");
            resp = teclado.next().toLowerCase();


        } while (resp.equals("s"));

        System.out.println("\nCalculadora encerrada");

    }
}
