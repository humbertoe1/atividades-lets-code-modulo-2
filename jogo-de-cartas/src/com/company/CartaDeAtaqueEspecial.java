package com.company;

public class CartaDeAtaqueEspecial extends CartaDeAtaque {

    private String efeito;

    public CartaDeAtaqueEspecial(String nome, String tipo, int custo, int poder, int resistencia, String efeito){
        super(nome, tipo, custo, poder, resistencia);
        this.efeito = efeito;
    }
    public String getEfeitos(){
        return efeito;
    }
}
