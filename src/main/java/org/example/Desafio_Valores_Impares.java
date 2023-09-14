package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Desafio_Valores_Impares {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = teclado.nextInt();

        int[] vet = new int[tamanho];
        int qtd_impar = 0;

        for (int i = 0; i < tamanho; i++){
            System.out.print("Digite o " + i + " valor: ");
            vet[i] = teclado.nextInt();
        }

        System.out.print("\nValores do vetor: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vet[i] + " ");

            if (vet[i] % 2 == 1){
                qtd_impar++;
            }
        }
        teclado.close();

        System.out.println("\n\nExistem " + qtd_impar + " valores impares no vetor");

    }
}
