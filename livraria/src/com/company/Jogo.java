package com.company;

import java.math.BigDecimal;

public class Jogo extends Produto {
    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo(String nome, int id, BigDecimal preco, String distribuidora, String genero, String estudio) {
        super(nome, id, preco);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    public void setDistribuidora(String distribuidora){
        this.distribuidora = distribuidora;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setEstudio(String estudio){
        this.estudio = estudio;
    }
    public String getDistribuidora(){
        return distribuidora;
    }
    public String getGenero(){
        return genero;
    }
    public String getEstudio(){
        return estudio;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                super.toString() +
                "distribuidora='" + distribuidora + '\'' +
                ", genero='" + genero + '\'' +
                ", estudio='" + estudio + '\'' +
                '}';
    }
}

