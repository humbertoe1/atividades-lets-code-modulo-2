package com.company;

import java.util.Objects;

public class Produto {
    private int id;
    private String nome;
    private String sessao;
    private String marca;
    private String tipo;
    private int quantidadeEmEstoque;

    Produto(String nome, String sessao, String marca, String tipo, int quantidade) {
        this.id = GeradorDeId.INSTANCE.nextIdProduto();
        this.nome = nome;
        this.sessao = sessao;
        this.marca = marca;
        this.tipo = tipo;
        this.quantidadeEmEstoque = quantidade;
    }
    public Produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public int getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public String getSessao(){
        return this.sessao;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getQuantidadeEmEstoque(){
        return this.quantidadeEmEstoque;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSessao(String sessao){
        this.sessao = sessao;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setQuantidadeEmEstoque(int quantidade){
        this.quantidadeEmEstoque = quantidade;
    }
    public void adicionarQuantidade(int quantidade){
        this.quantidadeEmEstoque += quantidade;
    }
    public void imprimirProdutos(){
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Marca: " + this.marca);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Sessao: " + this.sessao);
        System.out.println("Quantidade: " + this.quantidadeEmEstoque);
        System.out.println("---------------------");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return nome.toLowerCase().equals(produto.nome.toLowerCase()) &&
                marca.toLowerCase().equals(produto.marca.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome.toLowerCase(), marca.toLowerCase());
    }

    public void atualizar(Produto novoProduto) {
        this.nome = novoProduto.nome;
        this.marca = novoProduto.marca;
        this.quantidadeEmEstoque = novoProduto.quantidadeEmEstoque;
        this.tipo = novoProduto.tipo;
        this.sessao = novoProduto.sessao;
    }
}
