package br.com.abc.exercicios;

import java.util.Scanner;

public class Exe003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = in.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = in.nextInt();
        System.out.println("Digite sua cidade de nascimento: ");
        String cidade = in.next();

        System.out.println("Olá. \nMeu nome é "+nome+", sou natural de "+cidade+", tenho "+idade+" anos e estou aprendendo a programar.");





    }
}
