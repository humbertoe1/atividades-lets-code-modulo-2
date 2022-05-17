package com.company;

public class Arqueiro extends Heroi {
    public Arqueiro(String nome){
        super(nome);
        this.tipoDeAtaque = "PERFURANTE";
    }

    public String interagir(){
        return "Se você esta me vendo, você não é o alvo";
    }
}
