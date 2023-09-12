package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Desafio_Valores_Impares {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = teclado.nextInt();

        int vet[] = new int[tamanho];
        //int vet[] = {1,2,3,4,5,6,7,8,9,10};
        int qtd_impar = 0;

//        for (int v: vet) {
        for (int i = 0; i < tamanho; i++){
            System.out.print("Digite o " + i + " valor: ");
            vet[i] = teclado.nextInt();
        }

        System.out.print("\nValores do vetor: ");
        for (int i = 0; i < tamanho; i++) {
//            System.out.println("Posição " + i + ": " + vet[i]);
            System.out.print(vet[i] + " ");

            if (vet[i] % 2 == 1){
                qtd_impar++;
            }

        }

        teclado.close();


//            System.out.print(v + " ");
//            if (v % 2 == 1){
//                qtd_impar++;
//            }


//        for (int i=1; i <= vet.length; i++){
//            System.out.print("Digite o " + i + " valor: ");
//            vet[i] = teclado.nextInt();
//
//            if (i % 2 == 1){
//                qtd_impar++;
//            }
//        }
//            vet[i] = i;


        System.out.println("\n\nExistem " + qtd_impar + " valores impares no vetor");

    }
}

// Cod OK

//    int vet[] = {1,2,3,4,5,6,7,8,9,10};
//    int qtd_impar = 0;
//
//        for (int v: vet) {
//                System.out.print(v + " ");
//                if (v % 2 == 1){
//                qtd_impar++;
//                }
//         }
//         System.out.println("\n\nExistem " + qtd_impar + " valores impares no vetor");


// Tentei montar um gerar de numeros

//        Random gerador = new Random();
//        int vet[] = new int[10];

//        for (int i=1; i <= vet.length; i++) {
//            System.out.println(i + " - " + gerador.nextInt(100));

//        for (int v=1; v <= vet.length; v++) {
//        for (int v: vet) {
//            System.out.println(v + " - " + gerador.nextInt(10) + "; ");
//            System.out.print(gerador.nextInt(100) + " ");
//            if (v % 2 == 1){
//                qtd_impar++;
//            }
//        }
