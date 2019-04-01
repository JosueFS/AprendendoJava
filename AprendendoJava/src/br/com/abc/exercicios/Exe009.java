package br.com.abc.exercicios;

import java.util.Scanner;

public class Exe009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero inicial");
        int inicio = in.nextInt();
        System.out.println("Digite o numero final");
        int fim = in.nextInt();
        int soma = 0;

        for (int i = inicio; i<=fim; i++)
            soma += i;

        System.out.println(soma);




    }
}
