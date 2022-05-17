package com.company;

public class Guerreiro extends Heroi {
    protected int pontosDeVida;
    public Guerreiro(String nome){
        super(nome);
        this.tipoDeAtaque = "PANCADA";
    }

    public String interagir(){
        return "Eu vou cumprir minha missão";
    }
}
