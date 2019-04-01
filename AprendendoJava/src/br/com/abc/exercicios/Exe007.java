package br.com.abc.exercicios;

import java.util.Scanner;

public class Exe007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha um numero para ver sua tabuada: ");
        int num = in.nextInt();

        for (int i = 10; i>0;i--){
            System.out.println(num + " x " + i + " = " + num*i);
        }

    }
}
