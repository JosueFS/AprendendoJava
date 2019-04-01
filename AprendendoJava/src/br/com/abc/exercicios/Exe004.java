package br.com.abc.exercicios;

import java.util.Scanner;

public class Exe004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idadeFilho = in.nextInt();

        System.out.println("Digite a idade da sua mãe: ");
        int idadeMae = in.nextInt();

        System.out.println("Minha idade é: "+idadeFilho+".");
        System.out.println("Minha mãe tem "+idadeMae+" anos de idade.");
        System.out.println("Minha mãe é "+(idadeMae - idadeFilho)+" anos mais velha do que eu.");

    }
}
