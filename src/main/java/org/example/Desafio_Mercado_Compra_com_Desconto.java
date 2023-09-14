package org.example;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.function.Function;

public class Desafio_Mercado_Compra_com_Desconto {

    public static void main(String[] args) {

        String resp = "";

        do {
        menu();

        double valorProduto = 0;
        String prodescolhido = "";

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual produto deseja? ");
        prodescolhido = teclado.next().toLowerCase();

        switch (prodescolhido){
            case "arroz":
                valorProduto = Double.parseDouble("4.50");
                break;
            case "feijão":
                valorProduto = Double.parseDouble("6.47");
                break;
            case "açucar":
                valorProduto = Double.parseDouble("4.41");
                break;
            case "café":
                valorProduto = Double.parseDouble("13.99");
                break;
            default:
                System.out.println("Produto não encontrado");
                break;
        }


        System.out.print("\nQuantas unidades de " + prodescolhido + " você deseja? ");
        int qtdprodt = teclado.nextInt();

        double total = 0;
        double desc = 0;
        double valComDesc = 0;

        if (qtdprodt <= 10){
            total = valorProduto * qtdprodt;
            System.out.println("\nO valor total da compra de " + qtdprodt +"kg " + prodescolhido + " foi de R$" + total);
        } else if (qtdprodt <= 20){
            total = valorProduto * qtdprodt;
            desc = total * 10/100;
            valComDesc = total - desc;
            System.out.println("\nO valor total da compra de " + qtdprodt +"kg " + prodescolhido +
                    " com 10% de desconto foi de R$" + valComDesc);
        } else if (qtdprodt <= 50){
            total = valorProduto * qtdprodt;
            desc = total * 20/100;
            valComDesc = total - desc;
            System.out.println("\nO valor total da compra de " + qtdprodt +"kg " + prodescolhido +
                            " com 20% de desconto foi de R$" + valComDesc);
//            System.out.printf("%.2f", valComDesc);
        } else {
            total = valorProduto * qtdprodt;
            desc = total * 25/100;
            valComDesc = total - desc;
            System.out.println("\nO valor total da compra de " + qtdprodt +"kg " + prodescolhido +
                    " com 25% de desconto foi de R$" + valComDesc);
        }

            System.out.print("\nDeseja comprar mais algum item? [S/N] ");
            resp = teclado.next().toLowerCase();

        } while (resp.equals("s"));

        System.out.println("\nCompra finalizada com sucesso");

    }

    public static void menu (){
        System.out.println("########################################");
        System.out.println("#                                      #");
        System.out.println("#  Lista de produtos disponiveis       #");
        System.out.println("#                                      #");
        System.out.println("#  * Produto *          * Preço *      #");
        System.out.println("#                                      #");
        System.out.println("#  - Arroz                R$4,50       #");
        System.out.println("#  - Feijão               R$6,47       #");
        System.out.println("#  - Açucar               R$3,41       #");
        System.out.println("#  - Café                 R$13,99      #");
        System.out.println("#                                      #");
        System.out.println("########################################");
        System.out.println(" ");
    }
}

