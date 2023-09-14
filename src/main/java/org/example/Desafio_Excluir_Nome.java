package org.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Desafio_Excluir_Nome {
    public static void main(String[] args) {

        String[] names = {"Ana","Tiago","Gustavo","Rafaela","Manuela","Maria","Lauro","Marcos","Carlos","Leonardo",
                "Bruno","Rafael","Samuel","Carla","Paula","Manuela","Rafaela","Gustavo","Tiago","Ana"};

        String[] rem = removerduplicados(names);

        System.out.println("Nomes do vetor Original: ");
        System.out.println(Arrays.toString(names) + " ");

        System.out.println("Nomes que restaram após exclusão: ");
        System.out.println(Arrays.toString(rem) + " ");

    }

    private static String[] removerduplicados(String[] names) {

        int n = names.length;
        String[] rem = Arrays.copyOf(names, n);

        for (int i = 0; i < n; i++) {
            int k = i + 1;
            int removidos = 0;
            for (int j = i + 1; j < n; j++) {
                if (rem[j] == rem[i]) {
                    removidos++;
                } else {
                    rem[k++] = rem[j];
                }
            }
            n = n - removidos;
        }

        rem = Arrays.copyOf(rem, n);

        return rem;
    }
}
