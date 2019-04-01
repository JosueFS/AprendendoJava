package br.com.abc.javacore.Aintroclasses.test;

import br.com.abc.javacore.Aintroclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fusion";
        carro.placa = "AAA6789";
        carro.velMax = 220f;


        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velMax);

    }
}
