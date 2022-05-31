package com.company;
//Esse tabuleiro irá receber um Deck que vai lutar contra um Inimigo.
public class Tabuleiro implements ITabuleiro {

    private Deck deck;

    @Override
    public void inserirDeck(Deck deck) {
        this.deck = deck;
    }

    @Override
    public boolean receberCartaDeAtaque(CartaDeAtaque cartaDeAtaque) {
        return false;
    }

    @Override
    public boolean verificaSeVenceu() {
        return false;
    }


}
