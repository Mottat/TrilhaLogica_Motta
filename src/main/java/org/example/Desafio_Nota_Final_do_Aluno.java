package org.example;

import java.util.Scanner;

public class Desafio_Nota_Final_do_Aluno {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nomeAluno;
        int N1, N2, N3, media;
        String resp;

        do {
            System.out.print("\nQual é o nome do aluno? ");
            nomeAluno = teclado.next();
            System.out.print("\nDigite a primeira nota do aluno: ");
            N1 = teclado.nextInt();
            System.out.print("\nDigite a segunda nota do aluno: ");
            N2 = teclado.nextInt();
            System.out.print("\nDigite a terceira nota do aluno: ");
            N3 = teclado.nextInt();
            media = (N1 + N2 + N3) / 3;

            if (media <= 5){
                System.out.println("\nMédia: " + media + " - Aluno(a) " + nomeAluno + " Reprovado");
            } else if (media < 7) {
                System.out.println("\nMédia: " + media + " - Aluno(a) " + nomeAluno + " em Recuperação");
            } else {
                System.out.println("\nMédia: " + media + " - Aluno(a) " + nomeAluno + " Aprovado");
            }

            System.out.print("\nQuer continuar? [S/N] ");
            resp = teclado.next().toLowerCase();

        } while (resp.equals("s"));

        System.out.println("\nLançamento das notas encerrado");

    }
}

