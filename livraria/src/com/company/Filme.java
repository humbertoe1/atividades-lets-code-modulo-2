package com.company;

import java.math.BigDecimal;

public class Filme extends Produto {
    private String estudio;
    private String diretor;
    private String genero;
    private String produtor;

    public Filme(String nome, int id, BigDecimal preco, String estudio, String diretor, String genero, String produtor) {
        super(nome, id, preco);
        this.estudio = estudio;
        this.diretor = diretor;
        this.genero = genero;
        this.produtor = produtor;
    }

    public void setEstudio(String estudio){
        this.estudio = estudio;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setProdutor(String produtor){
        this.produtor = produtor;
    }
    public String getEstudio(){
        return estudio;
    }
    public String getDiretor(){
        return diretor;
    }
    public String getGenero(){
        return genero;
    }
    public String getProdutor(){
        return produtor;
    }

    @Override
    public String toString() {
        return "Filme{" +
                super.toString() +
                ", estudio='" + estudio + '\'' +
                ", diretor='" + diretor + '\'' +
                ", genero='" + genero + '\'' +
                ", produtor='" + produtor + '\'' +
                '}';
    }
}
