package org.example;

import java.util.Arrays;
import java.util.Random;

public class Desafio_Valores_Impares {
    public static void main(String[] args) {

        int vet[] = {1,2,3,4,5,6,7,8,9,10};
        int qtd_impar = 0;

        for (int v: vet) {
            System.out.print(v + " ");
            if (v % 2 == 1){
                qtd_impar++;
            }
        }
        System.out.println("\n\nExistem " + qtd_impar + " valores impares no vetor");
    }
}

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
