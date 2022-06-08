package com.company;

import java.math.BigDecimal;

public class Caixa {
    private BigDecimal saldo;

    public Caixa(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void somaValor(BigDecimal valor) {
        saldo = saldo.add(valor.abs());
    }

    public void subtraiValor(BigDecimal valor) {
        saldo = saldo.subtract(valor.abs());
    }
}
