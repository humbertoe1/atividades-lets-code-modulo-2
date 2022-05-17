package com.company;

public class Generico {
    int pontosDeVida;
    protected String nome;
    public Generico(){
        this.pontosDeVida = 30;
        this.nome = "Goblin";
    }

    public int atacar(int dados){
        System.out.println("causou " +  dados*3 + " de dano");
        return 3*dados;
    }
    public int getPontosDeVida(){
        return this.pontosDeVida;
    }
    public String apanhar(int dano, String tipo){
        this.pontosDeVida = this.pontosDeVida - dano;
        if(this.pontosDeVida <= 0) {
            return "INIMIGO ABATIDO";
        }else{
            return "recebeu " + dano + " de dano";
        }
    }
    public String interagir(){
        return "Por que eu responderia meu inimigo???";
    }
    public String getNome(){
        return this.nome;
    }

}
