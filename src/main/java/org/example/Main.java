package org.example;

import java.time.Year;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Crie um vetor de inteiros com o tamanho especificado
        int[] vetor = new int[tamanho];

        // Preencha o vetor com valores fornecidos pelo usuário
        for (int i = 1; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Exiba os valores do vetor
        System.out.println("Valores do vetor:");
        for (int i = 1; i < tamanho; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        // Não se esqueça de fechar o Scanner quando não precisar mais dele
        scanner.close();



///////// ### --------------------------------------------------------------- ###

        // Vertor - For each

        // Não funcionou
//        int vet[] = {3,5,7,9,1,6,2,4};
//        for (int v: vet){
//            System.out.print(v + " ");
//        }
//        System.out.println("");
//        int p = Arrays.binarySearch(vet,5);
//        System.out.println("Encontrei o valor na posição " + p);

        // Vetor com todas a posições iguais
//        int num[] = new int[5];
//        Arrays.fill(num,8);
//        for (int valor: num) {
//            System.out.println(valor + " ");
//        }

//        int num[] = {3,5,7,9,1,6};
        // Colocar em ordem
//        Arrays.sort(num);
//        for (int valor:num) {
//            System.out.println(valor);
//        }

        // Vetor

        // Verificar se o ano é bisexto
//        int ano = 2000;
//        if (ano % 400 ==0){
//            System.out.println(ano + " é um ano bisexto");
//        } else if ((ano % 4 == 0) && (ano % 100 == 0)) {
//            System.out.println(ano + " é um ano bisexto");
//        } else {
//            System.out.println(ano + " não é um ano bisexto");
//        }

        // Vetor para ver quantos dias cada mes tem
//        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
//        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
//        for (int c=0; c< mes.length; c++){
//            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo");
//        }

//        int n[] = {3,2,8,7,5,4};
//        System.out.println("Total de casas de N " + n.length);
//        for (int c=0; c < n.length; c++){
//            System.out.println(c + " - " +n[c]);
//        }

///////// ### --------------------------------------------------------------- ###

        // Array

//        String[]  nomes = {"Gustavo","Rafaela","Manuela"};
//        for(int i = 0; i < nomes.length; i++){
//            System.out.println(nomes[i]);
//        }

///////// ### --------------------------------------------------------------- ###

        // 3º - Repetição Variavel de controle

        // Contador positivo
//        for (int cc=0; cc<5; cc++){
//            System.out.println(cc);
//        }

        // Contador negativo
//        for (int cc=5; cc>=0; cc-=1){
//            System.out.println(cc);
//        }

        // Contador 10 em 10
//        for (int cc=0; cc<=100; cc+=10){
//            System.out.println(cc);
//        }

//        int i,j;
//        for (i=1; i<=3; i++){
//            for (j=0; j<=2; j+=2){
//                System.out.println(j);
//            }
//            System.out.println(i);
//        }
//        System.out.println(i + j);

///////// ### --------------------------------------------------------------- ###

//        int n, s = 0, a = 0, p = 0, i = 0, m = 0, c = 0;
//        do {
//            n = Integer.parseInt (JOptionPane.showInputDialog(null,
//                    "<html>Informe um numero: <br><em>(Valor 0 interrompe)</em></html>"));
//            s += n;
//            if (n != 0){
//                c++;
//            }
//            if (n >= 100){
//                a++;
//            }
//            if (n % 2 == 0){ // Não consigo tirar o numero zero do contador
//                if (n == 0){
//                    break;
//                }
//                p++;
//            }
//            if (n % 2 != 0){
//                i++;
//            }
//            m = s / c;
//        } while (n != 0);
//        JOptionPane.showMessageDialog(null, "<html>Resultado: <hr>" +
//                "<br>Total de valores:  "+ s +
//                "<br>Total de Pares:  "+ p +
//                "<br>Total de Impares:  "+ i +
//                "<br>Acima de 100:  "+ a +
//                "<br>Media de valores:  "+ m +
//                "<br>Contador:  "+ c +
//                "</html>");

//        JOptionPane.showMessageDialog(null, "Olá Mundo","Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
//        int n = Integer.parseInt (JOptionPane.showInputDialog(null, "Informe um numero: "));
//        JOptionPane.showMessageDialog(null,"Você digitou o nunero: " + n);

///////// ### --------------------------------------------------------------- ###

        // 2º - Repetição com Teste no final
        // Fatorial --

//        String resp = "";
//        int s = 0;
//
//        do {
//            System.out.print("\n Digite um numero: ");
//            Scanner teclado = new Scanner(System.in);
//            int n = teclado.nextInt();
//            int f = 1;
//            int c = n;
//            while (c >= 1) {
//                f *= c;
//                c--;
//        }
//            System.out.println("\n Fatorial de " + n + " é " + f);
//
//            System.out.print("\n Quer continuar? [S/N] ");
//            resp = teclado.next();
//
//
//        } while (resp.equals("S"));

///////// ### --------------------------------------------------------------- ###

        // 1º - Repetição com Teste no inicio
        // Fatorial ++
//        int numero = 5;
//        int fatorial = 1;
//        int i = 1;
//
//        while (i <= numero){
//            fatorial = fatorial * i;
//            i++;
//        }
//
//        System.out.println("Fatorial de " + numero + " é " + fatorial);

///////// ### --------------------------------------------------------------- ###

        // While
//        int cc = 0;
//        while (cc < 10){
//            cc++;
//            if (cc == 5 || cc == 7){
//                continue;
//            }
//            if (cc == 5){
//                break;
//            }
//            System.out.println("Cambalhota - " + cc);
//        }

///////// ### --------------------------------------------------------------- ###

        // Do While
//        int n, s = 0;
//        String resp;
//        Scanner teclado = new Scanner(System.in);

//        do {
//            System.out.print("Digite um numero ");
//            n = teclado.nextInt();
//            s += n;
//            System.out.print("Quer continuar? [S/N] ");
//            resp = teclado.next();
//
//        } while (resp.equals("S"));
//        System.out.println("A soma dos valores é " + s);

//
//                System.out.println("Encerrado");

///////// ### --------------------------------------------------------------- ###

    }
}