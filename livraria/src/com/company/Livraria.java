package com.company;

import java.math.BigDecimal;

public class Livraria {

    public Caixa caixa;
    public Estoque estoque;

    public Livraria(){
        caixa = new Caixa(BigDecimal.ZERO);
        estoque = new Estoque();
    }

    public void venda(Produto produto, int quantidade){
        BigDecimal valorPago = new BigDecimal("quantidade").multiply(produto.getPreco());
        caixa.somaValor(valorPago);
        estoque.alterarQuantidadeProduto(produto, quantidade);
    }

}
