package br.com.abc.cursoemvideo.Aula12;

public class Cachorro extends Mamifero {
    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando o Rabo");
    }

    public void rosnar(){
        System.out.println("Rosnando..");
    }

    public void reagir (String frase){
        if (frase == "Toma comida" || frase == "Olá"){
            this.abanarRabo();
        }else{
            this.rosnar();
        }
    }
    public void reagir (int hora, int min){
        if (hora<12){
            this.abanarRabo();
        }else if (hora>=18){
            System.out.println("Ignorando");
        }else{
            abanarRabo();
            this.emitirSom();
        }
    }
    public void reagir (boolean dono){
        if (dono==true){
            this.abanarRabo();
        }else{
            this.rosnar();
            this.emitirSom();
        }
    }
    public void reagir (int idade, float peso){
if (idade<5){
    if(peso<10){
        this.abanarRabo();
    }else{
        this.emitirSom();
    }
}else{
    if(peso<10){
        this.rosnar();
    }else{
        System.out.println("Ignorar");
    }

}
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
}
