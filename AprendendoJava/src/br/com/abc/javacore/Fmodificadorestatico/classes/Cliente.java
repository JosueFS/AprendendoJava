package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Cliente {
    // 1 - Bloco de inicializacao estatico é executado quando a JVM carregar a classe (é executado apenas 1 vez)
    // 2 - Alocado espaço na memória para o objeto que será criado
    // 3 - Cada Atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 4 - Bloco de inicializacao é executado
    // 5 - Construtor é executado

    private static int [] parcelas;
    static {
        System.out.println("1");
       parcelas = new int[100];
       for(int i = 1; i<=100; i++){
           parcelas[i-1] = i;
       }
    }
    static {
        System.out.println("2");
    }
    static {
        System.out.println("3");
    }

    public Cliente(){
    }

    public static int[] getParcelas() {
        return parcelas;
    }

    public void imprime(){
        System.out.println(Cliente.parcelas);
    }
}
