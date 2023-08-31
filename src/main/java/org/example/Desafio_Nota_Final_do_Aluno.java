package org.example;

import java.util.Scanner;

public class Desafio_Nota_Final_do_Aluno {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nomeAluno;
        int N1, N2, N3, media;
        String resp;

        do {
            System.out.print("Qual é o nome do aluno? ");
            nomeAluno = teclado.next();
            System.out.println("");
            System.out.print("Digite a primeira nota do aluno: ");
            N1 = teclado.nextInt();
            System.out.print("Digite a segunda nota do aluno: ");
            N2 = teclado.nextInt();
            System.out.print("Digite a terceira nota do aluno: ");
            N3 = teclado.nextInt();
            media = (N1 + N2 + N3) / 3;

            System.out.println("");

            if (media <= 5){
                System.out.println("Média: " + media + " - Aluno(a) " + nomeAluno + " Reprovado");
            } else if (media < 7) {
                System.out.println("Média: " + media + " - Aluno(a) " + nomeAluno + " em Recuperação");
            } else {
                System.out.println("Média: " + media + " - Aluno(a) " + nomeAluno + " Aprovado");
            }

            System.out.println("");

            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();

            System.out.println("");

        } while (resp.equals("S"));

        System.out.println("Lançamento das notas encerrado");

    }
}
