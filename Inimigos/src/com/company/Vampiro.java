package com.company;

public class Vampiro extends Generico {

    public Vampiro(){
        this.nome = "Vampiro";
    }
    public int atacar(int dados) {
        System.out.println("causou " + (dados*5) + " de dano");
        if((dados*5) >= 20){
            System.out.println("Voce esta sangrando!!");
        }
        return dados*5;
    }

    public String apanhar(int dano, String tipo) {
        if (tipo.toUpperCase().equals("PERFURANTE")) {
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

    public String interagir() {
        return "O que é um homem?";
    }
}