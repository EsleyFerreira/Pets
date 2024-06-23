package com.esley.pets;

public class Application {
    public static void main(String[] args) {
        Cachorro snoopy = new Cachorro("Snoopy", 3);
        Gato mia = new Gato("Mia", 4);

        snoopy.emitirSom();
        mia.emitirSom();

    }
}