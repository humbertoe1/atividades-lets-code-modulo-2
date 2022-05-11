package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Estoque {
    private int id;
    private String nome;
    public Set<Produto> produtoList;


    public Estoque(String nome, Set<Produto> produtoList){
        this.nome = nome;
        this.produtoList = produtoList;
        this.id = GeradorDeId.INSTANCE.nextIdEstoque();
    }
    public Estoque(String nome){
        this(nome, new HashSet<>());
    }
    public String getNome(){
        return this.nome;
    }
    public int getId(){
        return this.id;
    }
    public void setNome(){
        this.nome = nome;
    }

    public void modificarNomeDoEstoque(String nome){
        this.nome = nome;
    }

    public void listarProdutosDoEstoque(){
        System.out.println("Segue uma lista de Produtos no estoque " + this.nome + ".");
        for(Produto produto: this.produtoList){
            System.out.print("ID: " + produto.getId() + " ");
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Quantidade em Estoque" + produto.getQuantidadeEmEstoque());
        }
        System.out.println("--Fim da Lista--");
    }

    public void detalharProdutoDoEstoque(int idDoProduto){
        Produto produtoProcurado = acharProduto(idDoProduto);
        System.out.println("ID: " + produtoProcurado.getId());
        System.out.println("Nome: " + produtoProcurado.getNome());
        System.out.println("Sessão: " + produtoProcurado.getSessao());
        System.out.println("Marca: " + produtoProcurado.getMarca());
        System.out.println("Tipo: " + produtoProcurado.getTipo());
        System.out.println("Quantidade em Estoque" + produtoProcurado.getQuantidadeEmEstoque());
        System.out.println("---");
    }
    public void adicionarProduto(Produto produto){
        this.produtoList.add(produto);
    }
    public void removerProduto(Produto produto){
        this.produtoList.remove(produto);
    }

    public Produto acharProduto(int idDoProduto){
        for(Produto produto: this.produtoList){
            if (produto.getId() == idDoProduto){
                return produto;
            }
        }
        System.out.println("PRODUTO NÃO ENCONTRADO!!!");
        return null;
    }
    public void atualizarProduto(Produto produto, Produto novoProduto){
        produto.atualizar(novoProduto);
    }
}