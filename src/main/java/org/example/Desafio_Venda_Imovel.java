package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class Desafio_Venda_Imovel {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nomeVendedor;
        double valorImovel, valorComissao = 0;

        System.out.print("Digite o seu nome: ");
        nomeVendedor = teclado.next();

        System.out.print("Digite o valor do imóvel: ");
        valorImovel = teclado.nextDouble();

        if (valorImovel >= 50000){
            valorComissao = valorImovel * 20 / 100;
        } else if (valorImovel >= 30000) {
            valorComissao = valorImovel * 15 / 100;
        } else
            valorComissao = valorImovel * 10 / 100;

        System.out.print("O vendedor " + nomeVendedor + ", vendeu uma casa no valor de " + NumberFormat.getCurrencyInstance().format(valorImovel) + " e usa comissão foi de " + NumberFormat.getCurrencyInstance().format(valorComissao));

    }
}
