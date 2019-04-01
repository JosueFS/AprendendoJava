package br.com.abc.exercicios;

import java.util.Scanner;

public class Exe005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Cadastre o usuário: ");
        String usuario = in.nextLine();

        System.out.println("Cadastre a senha: ");
        String senha = in.nextLine();

        System.out.println("Digite o usuário: ");
        String usuarioTest = in.nextLine();

        System.out.println("Digite o usuário: ");
        String senhaTest = in.next();

//        if (usuario.equals(usuarioTest) && senha.equals(senhaTest)){
        if (usuario.equals(usuarioTest))
        {
            if (senha.equals(senhaTest)){
                System.out.println("Login efetuado com sucesso!");
            }else {
                System.out.println("Senha incorreta.");
            }

        }else{
            System.out.println("Login incorreto.");
        }
    }
}
