package br.com.abc.exercicios;

import java.util.Scanner;

public class Exe006 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        if (new Scanner(System.in).nextInt() >10){
//            System.out.println("O numero é maior que 10.");
//        }else{
//            System.out.println("O numero é menor que 10.");
//        }

        System.out.println("Simplificando o código.");
        System.out.println("O número digitado é "+((new Scanner(System.in).nextInt() > 10)? "maior" : "menor") + " que 10.");

        }

    }

