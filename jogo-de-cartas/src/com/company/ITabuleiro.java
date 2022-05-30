package com.company;

public interface ITabuleiro {
    public void inserirDeck(Deck deck);
    public boolean receberCartaDeAtaque(CartaDeAtaque cartaDeAtaque);
    public boolean verificaSeVenceu();
    public Inimigo[] gerarInimigos();
}
