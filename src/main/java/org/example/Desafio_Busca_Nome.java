package org.example;

import java.util.Scanner;

public class Desafio_Busca_Nome {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nomes[] = new String[10];
//        String nomes[] = {"Ana","Gustavo","Rafaela","Manuela","Thiago"};
        String novonome = "";

        // Inserir clientes no vetor
        for (int i=0; i < nomes.length; i++){
            System.out.print("Digite o " + i + "º nome: ");
            nomes[i] = teclado.nextLine();
        }

        // Exibir clientes do vetor
//        for (int i=0; i < nomes.length; i++){
//            System.out.println(i + "º - " + nomes[i]);
//        }

        //  Novo nome para verificar
        System.out.print("Digite o nome que deseja verificar: ");
         novonome = teclado.nextLine();

        // Verificação se nome existe no vetor
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(novonome)) {
                System.out.println("Achei");
                break;
            } else
                System.out.println("Não Achei");
            break;
        }
        teclado.close();
    }
}
