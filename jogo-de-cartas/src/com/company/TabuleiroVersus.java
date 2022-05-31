package com.company;

public class TabuleiroVersus implements ITabuleiro {
    ICarta[][] decks;
    Jogador[] jogadores = new Jogador[2];

    @Override
    public void inserirDeck(ICarta[] deck) {

    }

    @Override
    public boolean receberCartaDeAtaque(ICarta carta) {
        return false;
    }

    @Override
    public boolean verificaSeVenceu(Jogador jogador) {
        return false;
    }
    public TabuleiroVersus(ICarta[] deckJogador1, ICarta[] deckJogador2){
        jogadores[0] = new Jogador(1);
        jogadores[1] = new Jogador(2);

        if(deckJogador1.length == 50){
            inserirDeck(deckJogador1);
        }
        if(deckJogador2.length == 50){
            inserirDeck(deckJogador2);
        }
    }
}
