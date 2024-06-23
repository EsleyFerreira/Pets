package com.esley.pets;

// Herança = gato é um animal, e tem um comportamento específico(Polimofismo)
public class Gato extends Animal implements EmitirSom {

    //Construtor
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() { //Polimofismo
        System.out.println(getNome() + " Miauu !");
    }
}