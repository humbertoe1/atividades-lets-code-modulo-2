package com.company;

public interface ITabuleiro {
    void inserirDeck(Deck deck, int id);
    boolean receberCartaDeAtaque(ICarta carta, Jogador jogador);
    boolean verificaSeVenceu(Jogador jogador);

}
