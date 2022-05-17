package com.company;

public class Gigante extends Generico {

    public Gigante(){
        this.nome = "Gigante";

    }
    public int atacar(int dados) {
        System.out.println("causou " + (dados*6) + " de dano");

        return dados*6;
    }
    public String apanhar(int dano, String tipo){
        if (tipo.toUpperCase().equals("FOGO")) {
            this.pontosDeVida = this.pontosDeVida - (dano*2);
            if(this.pontosDeVida <= 0) {
                return "INIMIGO ABATIDO";
            }else{
                return "recebeu " + dano + " de dano";
            }
        } else {
            this.pontosDeVida = this.pontosDeVida - (dano*2);
            if(this.pontosDeVida <= 0){
                return "INIMIGO ABATIDO";
            }else {
                return "recebeu " + dano + " de dano";
            }
        }
    }
    public String interagir(){
        return "Me desculpe";
    }
}
