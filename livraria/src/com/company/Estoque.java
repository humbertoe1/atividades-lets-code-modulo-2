package com.company;

import java.util.*;

public class Estoque{
    private List<Produto> produtosDoEstoque = new ArrayList<>();


    public Estoque(){}

    public void adicionarProduto(Produto produto) {

        produtosDoEstoque.add(produto);
        ordenarEstoque();
    }

    public Produto verProduto(int id) {
        for (Produto produto : produtosDoEstoque) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void removerProduto(Produto produto) {
        produtosDoEstoque.remove(produto);

    }

    public void atualizarProduto(Produto produtoAtualizado) {
        for (Produto produto : produtosDoEstoque) {
            if (produto.getId() == produtoAtualizado.getId()) {
                produtosDoEstoque.remove(produto);
                produtosDoEstoque.add(produtoAtualizado);
                ordenarEstoque();
                break;
            }
        }
    }

    public List<Produto> listarPorCategoria(Class clazz) {
        List<Produto> lista = new ArrayList<>();
        for (Produto produto : produtosDoEstoque) {
            if (produto.getClass().equals(clazz)) {
                lista.add(produto);
            }
        }
        return lista;
    }

    public List<Produto> listarTudo() {
        return produtosDoEstoque;
    }

    public void imprimirEstoque(){
        for (Produto produto: produtosDoEstoque) {
            System.out.println(produto);
        }

    }

    private void ordenarEstoque(){
        Collections.sort(produtosDoEstoque);
    }
}
