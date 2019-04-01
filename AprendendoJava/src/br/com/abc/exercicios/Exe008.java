package br.com.abc.exercicios;

import java.util.Scanner;

public class Exe008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 1;

        for (int i = 2; i<=100; i++)
//            System.out.println(soma + " + " + i + " = " + (soma+i));
            soma += i;
            System.out.println(soma);


    }
}


