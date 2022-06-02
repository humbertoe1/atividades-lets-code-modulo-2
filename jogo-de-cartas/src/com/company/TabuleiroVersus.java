package com.company;

public class TabuleiroVersus implements ITabuleiro {

    Jogador[] jogadores = new Jogador[2];
    Deck[] decks = new Deck[2];

    @Override
    public void inserirDeck(Deck deck, int id) {
           decks[id] = deck;
    }

    @Override
    public boolean receberCartaDeAtaque(ICarta carta, Jogador jogador) {
        ICarta[] playerBoard = jogador.playerBoard;
        int cartasDeAtaque = 0;
        int cartasDeAtqueEspecial = 0;

        for(ICarta cartaNoBoard: playerBoard){
            if (cartaNoBoard instanceof CartaDeAtaqueEspecial){
                cartasDeAtqueEspecial++;
            }else{
                cartasDeAtaque++;
            }
        }

        if(carta instanceof CartaDeAtaqueEspecial && cartasDeAtqueEspecial < 2){
            return true;
        }else if(!(carta instanceof CartaDeAtaqueEspecial) && cartasDeAtaque < 5){
            return true;
        }
        return false;
    }

    @Override
    public boolean verificaSeVenceu(Jogador jogador) {
        boolean todosEstaoMortos = true;
        for(Jogador outroJogador: jogadores){
            if(outroJogador.getId() != jogador.getId() && outroJogador.getStatus()){
                todosEstaoMortos = false;
            }
        }
        return todosEstaoMortos;
    }
    public TabuleiroVersus(Deck deckJogador1, Deck deckJogador2){
        jogadores[0] = new Jogador(0);
        jogadores[1] = new Jogador(1);

        if(deckJogador1.getCartas().length == 50){
            inserirDeck(deckJogador1, 0);
        }
        if(deckJogador2.getCartas().length == 50){
            inserirDeck(deckJogador2, 1);
        }
    }
}
