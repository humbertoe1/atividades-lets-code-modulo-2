package com.company;

import java.util.*;

public class Estoque {
    // private List<Produto> produtosDoEstoque = new ArrayList<>();
    private Map<Produto, Integer> produtosNoEstoque = new HashMap<>();

    public Estoque() {
    }

    public void alterarQuantidadeProdutoOuCadastrar(Produto produto, int quantidade) {
        int novoValor = quantidade;

        if (produtosNoEstoque.containsKey(produto)) {
            novoValor = produtosNoEstoque.get(produto) + quantidade;
        }

        produtosNoEstoque.put(produto, novoValor);
    }

    public Produto verProduto(int id) {
        for (Produto produto : produtosNoEstoque.keySet()) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void removerProduto(Produto produto) {
        produtosNoEstoque.remove(produto);
    }

    public void atualizarProduto(Produto produtoAtualizado) {
        int quantidadeNoEstoque;
        for (Produto produto : produtosNoEstoque.keySet()) {
            if (produto.getId() == produtoAtualizado.getId()) {
                quantidadeNoEstoque = produtosNoEstoque.get(produto);
                produtosNoEstoque.remove(produto);
                produtosNoEstoque.put(produtoAtualizado, quantidadeNoEstoque);
                break;
            }
        }
    }

    public List<Produto> listarPorCategoria(Class clazz) {
        List<Produto> lista = new ArrayList<>();
        for (Produto produto : produtosNoEstoque.keySet()) {
            if (produto.getClass().equals(clazz)) {
                lista.add(produto);
            }
        }
        return lista;
    }

    public List<Produto> listarTudo() {
        List<Produto> lista = new ArrayList<>();
        lista.addAll(produtosNoEstoque.keySet());
        return lista;
    }

    public void imprimirEstoque() {
        for (Produto produto : produtosNoEstoque.keySet()) {
            System.out.println(produto + " || QUANTIDADE: " + produtosNoEstoque.get(produto));
        }
    }

    public void imprimirEstoquePorCategoria(Class clazz){
        for (Produto produto : produtosNoEstoque.keySet()) {
            if(produto.getClass().equals(clazz)) {
                System.out.println(produto + " || QUANTIDADE: " + produtosNoEstoque.get(produto));
            }
        }
    }

    public int getQuantidadeEmEstoque(Produto produto) {
        return produtosNoEstoque.get(produto);
    }
}
