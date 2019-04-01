package br.com.abc.exercicios;

public class Exe012 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantia = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoluz = "Amarela";

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";

        System.out.println(lampada);
    }
}
