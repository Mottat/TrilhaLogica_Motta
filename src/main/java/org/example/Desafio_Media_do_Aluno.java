package org.example;

import java.util.Scanner;

public class Desafio_Media_do_Aluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2, media;
        String resp, aluno;

        do {
            System.out.print("\nDigite o nome do aluno: ");
            aluno = teclado.next();
            System.out.print("\nDigite a primeira nota do aluno: ");
            n1 = teclado.nextInt();
            System.out.print("\nDigite a primeira nota do aluno: ");
            n2 = teclado.nextInt();

            media = (n1 + n2) / 2;

            if (media >=7){
                System.out.println("\nAluno(a) " + aluno + " aprovado com média: "+ media);
            }else {
                System.out.println("\nAluno(a) " + aluno + " reprovado com média: "+ media);
            }

            System.out.print("\nDeseja continua? ");
            resp = teclado.next().toLowerCase();
        }while (resp.equals("s"));
    }
}
