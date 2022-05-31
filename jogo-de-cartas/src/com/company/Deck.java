package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Deck implements IDeck{

    private ICarta[] cartas;

    public ICarta[] getCartas(){
        return cartas;
    }
    public Deck(ICarta[] cartas){
        this.cartas = cartas;
    }

    @Override
    public ICarta[] embaralharDeck(ICarta[] cartas) {

        List<ICarta> cartasParaEmbaralhar = Arrays.asList(cartas);
        Collections.shuffle(cartasParaEmbaralhar);
        return (ICarta[]) cartasParaEmbaralhar.toArray();
    }
}
