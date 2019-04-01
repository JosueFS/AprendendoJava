package br.com.abc.exercicios;

import java.util.Scanner;

public class Exe010 {
    public static void main(String[] args) {

        System.out.println("Digite um numero: ");
        int num = new Scanner(System.in).nextInt();
        int soma = 0;

        while (num > 0) {
            soma += (num%10);
            num = num/10;


        }
        System.out.println(soma);

    }
}
