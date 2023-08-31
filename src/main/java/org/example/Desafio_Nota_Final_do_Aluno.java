package org.example;

import java.util.Scanner;

public class Desafio_Nota_Final_do_Aluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomeAluno;
        int N1, N2, N3, media;

        System.out.print("Qual é o nome do aluno? ");
        nomeAluno = teclado.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");
        N1 = teclado.nextInt();
        System.out.print("Digite a segunda nota do aluno: ");
        N2 = teclado.nextInt();
        System.out.print("Digite a terceira nota do aluno: ");
        N3 = teclado.nextInt();
        media = (N1 + N2 + N3) / 3;

        if (media <= 5){
            System.out.println("Nota: " + media + " - Aluno Reprovado");
        } else if (media < 7) {
            System.out.println("Nota: " + media + " - Aluno em Recuperação");
        } else {
            System.out.println("Nota: " + media + " - Aluno Aprovado");
        }

    }
}
