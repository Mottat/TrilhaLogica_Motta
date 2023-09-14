package org.example;

import java.util.Scanner;

public class Desafio_Encerra_Programa {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num = 0;

        do {
            System.out.print("Digite um numero: ");
            num = Integer.parseInt(teclado.next());
        }while (num != 10);
        System.out.println("\nPrograma Encerrado");
    }
}
