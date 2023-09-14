package org.example;

public class Desafio_Soma_de_Valores {
    public static void main(String[] args) {
        int num=1, s=0;

        while (num <=100){
            s += num;
            num++;
        }
        System.out.println("Soma total dos numeros interios entre 1 e 100 é:  " + s);
    }
}
