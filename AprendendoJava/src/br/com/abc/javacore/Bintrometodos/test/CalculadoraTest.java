package br.com.abc.javacore.Bintrometodos.test;

import br.com.abc.javacore.Bintrometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(2, 3);
        System.out.println("Divisão:");
        double result = calc.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println("Divisão 2:");
        calc.divideDois(20,0);
        System.out.println("Continuando...");

    }
}
