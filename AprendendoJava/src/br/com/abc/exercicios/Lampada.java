package br.com.abc.exercicios;

import java.util.Arrays;

public class Lampada {

        String modelo;
        String tensao;
        int potencia;
        String cor;
        String tipoluz;
        int garantia;
        String[] tipos;

        @Override
        public String toString() {
                return "Lampada{" +
                        "modelo='" + modelo + '\'' +
                        ", tensao='" + tensao + '\'' +
                        ", potencia=" + potencia +
                        ", cor='" + cor + '\'' +
                        ", tipoluz='" + tipoluz + '\'' +
                        ", garantia=" + garantia +
                        ", tipos=" + (tipos == null ? null : Arrays.asList(tipos)) +
                        '}';
        }

}

