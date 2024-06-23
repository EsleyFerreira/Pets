package com.esley.pets;

// Herança = Cachorro é um animal, e tem um comportamento específico(Polimofismo)
public class Cachorro extends Animal implements EmitirSom {

    //Construtor
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void emitirSom(){ //Polimofismo
        System.out.println(getNome() + " AUAU !");
    }
}