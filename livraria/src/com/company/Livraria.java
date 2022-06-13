package com.company;

import java.math.BigDecimal;

public class Livraria {

    private Caixa caixa;
    private Estoque estoque;
    private GeradorDeID geradorDeID;
    private final BigDecimal VALOR_PROMOCIONAL = new BigDecimal("200");
    private final BigDecimal DESCONTO = new BigDecimal("0.85");

    public Livraria() {
        caixa = new Caixa(BigDecimal.ZERO);
        estoque = new Estoque();
        geradorDeID = new GeradorDeID();
    }

    public GeradorDeID getGeradorDeID() {
        return geradorDeID;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void venda(Produto produto, int quantidade) {
        BigDecimal valorPago = calcularValorPago(produto.getPreco(), quantidade);

        caixa.somaValor(valorPago);
        estoque.alterarQuantidadeProdutoOuCadastrar(produto, quantidade);
    }


    private BigDecimal calcularValorPago(BigDecimal valor, int quantidade) {

        BigDecimal valorPago = new BigDecimal(quantidade).multiply(valor);
        if (valorPago.compareTo(VALOR_PROMOCIONAL) >= 0) {
            valorPago = valorPago.multiply(DESCONTO);
        }
        return valorPago;
    }
    public boolean analisarIdentidade(int idade){
        return (idade >= 18);
    }


}
