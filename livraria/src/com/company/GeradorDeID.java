package com.company;

public class GeradorDeID {
    private int id = 999;

    public GeradorDeID(){

    }
    public int gerarId(){
        incrementaId();
        return this.id;
    }
    public void incrementaId(){
        this.id = this.id + 1;
    }
}
