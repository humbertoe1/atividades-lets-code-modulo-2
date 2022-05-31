package com.company;

public class CartaDeAtaque implements ICarta {
    protected String nome;
    protected String tipo;
    protected int custo;
    protected int poder;
    protected int resistencia;

    public CartaDeAtaque(String nome, String tipo, int custo, int poder, int resistencia) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
        this.poder = poder;
        this.resistencia = resistencia;
    }


    public int getPoder(){
        return this.poder;
    }
    public int getResistencia(){
        return this.resistencia;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public int getCusto() {
        return custo;
    }
}
