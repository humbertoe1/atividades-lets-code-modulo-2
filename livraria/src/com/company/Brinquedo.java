package com.company;

import java.math.BigDecimal;

public class Brinquedo extends Produto {
    private String tipo;

    public Brinquedo(String nome, int id, BigDecimal preco, boolean produtoAdulto, String tipo) {
        super(nome, id, preco, produtoAdulto);
        this.tipo = tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }


    @Override
    public String toString() {
        return "Brinquedo{" +
                super.toString() +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
