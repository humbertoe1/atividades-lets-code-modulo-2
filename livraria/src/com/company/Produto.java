package com.company;

import java.math.BigDecimal;
import java.util.Objects;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id.equals(produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
                ", id='" + id + '\'' +
                ", preço='" + preco + '\''
                ;
    }
}
