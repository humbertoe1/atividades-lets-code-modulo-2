package com.company;

public interface ITabuleiro {
    void inserirDeck(ICarta[] deck, int id);
    boolean receberCartaDeAtaque(ICarta carta);
    boolean verificaSeVenceu(Jogador jogador);

}
