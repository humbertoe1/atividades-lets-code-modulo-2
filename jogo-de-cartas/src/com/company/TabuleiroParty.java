package com.company;

public class TabuleiroParty implements ITabuleiro {
    Jogador[] jogadores = {
            new Jogador(0),
            new Jogador(1),
            new Jogador(2),
            new Jogador(3),
            new Jogador(4)
    };
    Deck[] decks =  new Deck[5];

    @Override
    public void inserirDeck(Deck deck, int id) {
        decks[id] = deck;
    }

    @Override
    public boolean receberCartaDeAtaque(ICarta carta, Jogador jogador) {
        int totalDeCartas = 0;

        for(Jogador jogadorNaLista: jogadores){
            totalDeCartas += jogadorNaLista.playerBoard.length;
        }
        return totalDeCartas < 34;
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

    public TabuleiroParty(Deck deckJogador1,
                          Deck deckJogador2,
                          Deck deckJogador3,
                          Deck deckJogador4,
                          Deck deckJogador5){
        if(deckJogador1.getCartas().length == 80){
            inserirDeck(deckJogador1, 0);
        }
        if(deckJogador2.getCartas().length == 80){
            inserirDeck(deckJogador2, 1);
        }
        if(deckJogador3.getCartas().length == 80){
            inserirDeck(deckJogador3, 2);
        }
        if(deckJogador4.getCartas().length == 80){
            inserirDeck(deckJogador4, 3);
        }
        if(deckJogador5.getCartas().length == 80){
            inserirDeck(deckJogador5, 5);
        }
    }
}
