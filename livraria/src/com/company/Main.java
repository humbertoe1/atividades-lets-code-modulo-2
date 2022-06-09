package com.company;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	    System.out.println("SISTEMA DE LIVRARIA");
	    Livro biblia = new Livro("Biblia", 1, BigDecimal.TEN, "Religioso", "Diversos", "Paulos");
        Livro bibliaNova = new Livro("Biblia2.0", 1, BigDecimal.ONE, "Religioso2", "Diversos2", "Paulos2");

        Estoque estoque = new Estoque();
        estoque.alterarQuantidadeProduto(biblia, 10);
        List<Produto> livros = estoque.listarPorCategoria(Livro.class);

        estoque.atualizarProduto(bibliaNova);

        livros = estoque.listarPorCategoria(Livro.class);


        Jogo xadrez = new Jogo("Xadrez", 3, new BigDecimal("3.4"), "Jagex", "Estrategia", "Grow");
        estoque.alterarQuantidadeProduto(xadrez, 3);

        estoque.alterarQuantidadeProduto(biblia, -3);
        estoque.imprimirEstoque();
    }
}
