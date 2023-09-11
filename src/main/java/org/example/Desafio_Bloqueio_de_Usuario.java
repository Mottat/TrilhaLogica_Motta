package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Desafio_Bloqueio_de_Usuario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String user, pass, resp;
        boolean autenticado = false;

        for (int cont = 0; cont < 3; cont++){
            System.out.print("Digite o nome de usuário: ");
            user = teclado.next();
            System.out.print("Digite a senha: ");
            pass = teclado.next();

            if (Objects.equals(user, "aluno") && (Objects.equals(pass,"segredo"))){
                autenticado = true;
                break;
            }else {
                System.out.println("Usuário ou senha estão incorretos");
            }
        }

        if (!autenticado) {
            System.out.println("Acesso bloqueado");
        } else {
            System.out.println("Bem vindo");
        }


//        do {
//            int cont = 0;
//            cont++;
//
//            System.out.print("Digite o nome de usuário: ");
//            user = teclado.next();
//            System.out.print("Digite a senha: ");
//            pass = teclado.next();
//
//            if (Objects.equals(user, "aluno") && (Objects.equals(pass,"segredo"))){
//                System.out.println("Bem vindo");
//                break;
//            }else
//                System.out.println("Usuário ou senha estão incorretos");
//
//            if (cont >= 3){
//                System.out.println("Acesso bloqueado");
//                break;
//            }
//            System.out.print("\nDeseja tentar novamente? ");
//            resp = teclado.next();
//        }while (resp.equals("S"));

    }
}
