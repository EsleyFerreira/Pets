package com.esley.pets;

public class Cachorro extends Animal implements EmitirSom {

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println(getNome() + " AUAU !");
    }
}