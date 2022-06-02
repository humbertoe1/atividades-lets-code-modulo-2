package com.company;
//Esse tabuleiro irá receber um Deck que vai lutar contra um Inimigo.
public class Tabuleiro implements ITabuleiro {

    private Deck deck;

    @Override
    public void inserirDeck(Deck deck, int id) {

    }

    @Override
    public boolean receberCartaDeAtaque(ICarta carta, Jogador jogador) {
        return false;
    }

    @Override
    public boolean verificaSeVenceu(Jogador jogador) {
        return false;
    }
}
