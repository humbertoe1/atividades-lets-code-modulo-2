package com.company;

public class Jogador {
    private int pontosDeVida;
    private boolean vivoOuMorto;
    private int id;
    ICarta[] playerBoard;

    public int getPontosDeVida(){
        return pontosDeVida;
    }

    public boolean getStatus(){
        return vivoOuMorto;
    }

    public int getId(){
        return id;
    }

    public void atualizaPontosDeVida(int valor){
        this.pontosDeVida += valor;
        if(pontosDeVida <= 0)
            matarJogador();
    }

    private void matarJogador(){
        this.vivoOuMorto = false;
    }

    public Jogador(int id){
        this.pontosDeVida = 50;
        this.vivoOuMorto = true;
        this.id = id;
    }
}
