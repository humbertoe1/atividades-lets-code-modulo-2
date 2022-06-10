package com.company;

import java.math.BigDecimal;

public class Livro extends Produto {
    private String genero;
    private String escritor;
    private String editora;

    public Livro(String nome, int id, BigDecimal preco, boolean produtoAdulto, String genero, String escritor, String editora) {
        super(nome, id, preco, produtoAdulto);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public String getEditora() {
        return editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                super.toString() +
                ", genero='" + genero + '\'' +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }


}
