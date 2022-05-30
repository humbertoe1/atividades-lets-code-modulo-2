package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class Deck implements IDeck{

    private ArrayList<Carta> cartas;


    @Override
    public void embaralharDeck(ArrayList<Carta> cartas) {
        Collections.shuffle(cartas);
    }
}
