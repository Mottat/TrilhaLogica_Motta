package org.example;

import java.util.Scanner;

public class Desafio_Busca_Nome {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String[] nomes = new String[10];
//        String[] nomes = {"a","s","d"};
        String novonome = "";

        // Inserir clientes no vetor
        for (int i=0; i < nomes.length; i++){
            System.out.print("Digite o " + i + "º nome: ");
            nomes[i] = teclado.nextLine().toLowerCase();
        }

        // Exibir clientes do vetor
//        for (int i=0; i < nomes.length; i++){
//            System.out.println(i + "º - " + nomes[i]);
//        }

        //  Novo nome para verificar
        System.out.print("Digite o nome que deseja verificar: ");
         novonome = teclado.nextLine().toLowerCase();

        // Verificação se nome existe no vetor
        boolean existe = false;
        for (String nome : nomes) {
            if (novonome.equals(nome)){
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }
        teclado.close();
    }
}
