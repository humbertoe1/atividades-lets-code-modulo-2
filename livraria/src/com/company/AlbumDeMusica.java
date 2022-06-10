package com.company;

import java.math.BigDecimal;

public class AlbumDeMusica extends Produto {
    private String musicoOuBanda;
    private String genero;
    private String selo;

    public AlbumDeMusica(String nome, int id, BigDecimal preco, boolean produtoAdulto, String musicoOuBanda, String genero, String selo) {
        super(nome, id, preco, produtoAdulto);
        this.musicoOuBanda = musicoOuBanda;
        this.genero = genero;
        this.selo = selo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setMusicoOuBanda(String musicoOuBanda) {
        this.musicoOuBanda = musicoOuBanda;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

    public String getGenero() {
        return genero;
    }

    public String getMusicoOuBanda() {
        return musicoOuBanda;
    }

    public String getSelo() {
        return selo;
    }

    @Override
    public String toString() {
        return "AlbumDeMusica{" +
                super.toString() +
                ", musicoOuBanda='" + musicoOuBanda + '\'' +
                ", genero='" + genero + '\'' +
                ", selo='" + selo + '\'' +
                '}';
    }
}
