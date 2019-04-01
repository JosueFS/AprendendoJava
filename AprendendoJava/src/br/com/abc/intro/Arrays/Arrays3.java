package br.com.abc.intro.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros1 = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};

        for (int i=0; i<numeros2.length;i++) {
            System.out.println(numeros2[i]);
        }
        for (int aux : numeros2) {
            System.out.println(aux);
        }

    }
}
