package com.esley.pets;

// Atributos (Polimofismo)
public abstract class Animal {
    private String nome;
    private int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para obter o nome (Abstração)
    public String getNome() {
        return nome;
    }

    // Método para definir o Nome (Abstração)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Polimofismo
    public abstract void emitirSom();
}