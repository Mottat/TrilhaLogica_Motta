package org.example;

/*
Você irá escrever um programa de console para um mercado que vende apenas dois tipos de bebida:
 cerveja, refrigerante e água.
 O programa deve perguntar qual tipo de bebida a pessoa deseja comprar e
 caso ela opte pela cerveja o programa deve perguntar a idade da pessoa.
 Caso a pessoa seja menor de idade deve printar "compra negada".
 Em todos os outros casos deve printar "compra efetuada com sucesso".
 */

import java.util.Scanner;

public class Desafio_Mercado_Compra {
    public static void main(String[] args) {
        System.out.println("###################################");
        System.out.println("#  Bebidas disponiveis no mercado #");
        System.out.println("#  - Cerveja                      #");
        System.out.println("#  - Refrigerante                 #");
        System.out.println("#  - Agua                         #");
        System.out.println("###################################");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual bebida deseja comprar? ");
        String bebida = teclado.nextLine().toLowerCase();
        int idade = 0;
        if (bebida.contains("cerveja")) {
            System.out.print("Qual sua idade? ");
            idade = teclado.nextInt();
            if (idade < 18) {
                System.out.print("Compra Negada");
            } else {
                System.out.println("Compra efetuada com sucesso");
            }
        } else if (bebida.contains("refrigerante") || bebida.contains("agua")) {
            System.out.println("Compra efetuada com sucesso");
        } else {
            System.out.println("Item não encontrado");
        }
    }
}

