package com.company;

public class Carta implements ICarta {
    private String nome;
    private String tipo;
    private int custo;

    @Override
    public String getNome(){
        return this.nome;
    }
    @Override
    public String getTipo(){
        return this.tipo;
    }
    @Override
    public int getCusto(){
        return this.custo;
    }
}
