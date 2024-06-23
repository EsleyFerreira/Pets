package com.esley.pets;

public class Application {
    // Função Principal
    public static void main(String[] args) {

        //Criação de Objetos
        Cachorro snoopy = new Cachorro("Snoopy", 3);
        Gato mia = new Gato("Mia", 4);

        snoopy.emitirSom();
        mia.emitirSom();
    }
}