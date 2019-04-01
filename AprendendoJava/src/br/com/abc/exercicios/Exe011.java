package br.com.abc.exercicios;

import java.util.Scanner;

public class Exe011 {
    public static int somaAlgarismos(int num, int soma){
        if(num<1) {
            return soma;
        }

        soma += (num%10);
        return somaAlgarismos(num/10, soma);
    }

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        int num = new Scanner(System.in).nextInt();
        int soma = 0;


        System.out.println(" = "+somaAlgarismos(num, soma));

    }
}
