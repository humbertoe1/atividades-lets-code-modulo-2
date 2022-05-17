package com.company;

public class Mago extends Heroi {
    public Mago(String nome){
        super(nome);
        this.tipoDeAtaque = "FOGO";
    }

    public String interagir(){
        return "Eu trago a luz";
    }
}
