package org.example;

import java.util.Scanner;

public class Desafio_Calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String resp, calculo = "";
        int n1, n2, result = 0;

        do {
            System.out.print("Digite o primeiro numero: ");
            n1 = teclado.nextInt();

            System.out.print("Digite a operação: ");
            calculo = teclado.next();

            System.out.print("Digite o segundo numero: ");
            n2 = teclado.nextInt();
            System.out.println("");

            switch (calculo){
                case "+":
                    result = n1 + n2;
                    System.out.println("A soma de " + n1 + " " + calculo + " " + n2 + " é: " + result);
                    break;
                case "-":
                    result = n1 - n2;
                    System.out.println("A subitração de " + n1 + " " + calculo + " " + n2 + " é: " + result);
                    break;
                case "*":
                    result = n1 * n2;
                    System.out.println("A multiplicação de " + n1 + " " + calculo + " " + n2 + " é: " + result);
                    break;
                case "/":
                    result = n1 / n2;
                    System.out.println("A divisão de " + n1 + " " + calculo + " " + n2 + " é: " + result);
                    break;
                default:
                    break;
            }

            System.out.println("");
            System.out.print("Deseja fazer outro calculo? ");
            resp = teclado.next();
            System.out.println("");


        } while (resp.equals("S"));

        System.out.println("");
        System.out.println("Calculadora encerrada");

    }
}
