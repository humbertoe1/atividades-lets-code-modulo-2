package com.company;

public class Inimigo {

    private int pontosDeVida;
    private int pontosDePoder;
    private String[] tipo = {"goblin", "vampiro", "morcego"};

    int nivel;

    public Inimigo(int nivel){

    }

    public int getPontosDeVida(){
        return  this.pontosDeVida;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getPontosDePoder(){
        return this.pontosDePoder;
    }
}
