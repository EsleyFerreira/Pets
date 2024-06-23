package com.esley.pets;

public class Gato extends Animal implements EmitirSom {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " Miauu !");
    }
}