package com.company;

import java.math.BigDecimal;


public abstract class Produto implements Comparable<Produto> {

    private String nome;
    private Integer id;
    private BigDecimal preco;

    public Produto(String nome, int id, BigDecimal preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }


    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto o1) {
        return id.compareTo(o1.getId());
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", id=" + id + '\'' +
                ", preco=" + preco + '\''
                ;
    }
}
