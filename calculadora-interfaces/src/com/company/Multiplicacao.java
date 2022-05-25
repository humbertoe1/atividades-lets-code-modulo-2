package com.company;

public class Multiplicacao implements Calculo {

    @Override
    public double operacao(double valor1, double valor2) {
        return valor1*valor2;
    }
}
