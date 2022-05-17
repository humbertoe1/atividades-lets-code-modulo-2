package com.company;

public class Heroi extends Generico {


    protected String tipoDeAtaque;
    protected boolean envenenado;
    protected boolean sangrando;


    public Heroi(String nome){
        this.nome = nome;
        this.pontosDeVida = 100;
        this.envenenado = false;
        this.sangrando = false;
    }
    public void checaStatus(){
        if(this.envenenado) {
            System.out.println("Heroi envenado... -5 pontos de vida.");
            this.pontosDeVida -= 5;
        }
        if(this.sangrando){
            System.out.println("Heroi sangrando... -6 pontos de vida.");
            this.pontosDeVida -= 6;
        }
    }
    public String getTipoDeAtaque(){
        return this.tipoDeAtaque;
    }
    public int atacar(int dados){
        return dados*3;
    }
    public void tomarPocao(){
        this.pontosDeVida += 30;
    }
    public void beberDaFonte(){
        this.envenenado = false;
    }
    public void usarCurativo(){
        this.sangrando = false;
    }
    public String apanhar(int dano){
        this.pontosDeVida = this.pontosDeVida - dano;
        if(this.pontosDeVida <=0){
            return "--✝-MORREU-✝--";
        }else{
            return "recebeu " + dano + " de dano";
        }
    }
    public String apanhar(int dano, String tipoDeInimigo){
        this.pontosDeVida = this.pontosDeVida - dano;
        if(pontosDeVida <= 0){
            return "--✝-MORREU-✝--";
        }else{
            if(dano >= 20 && tipoDeInimigo.equals("Vampiro"))
                this.sangrando = true;

            if(dano >= 18 && tipoDeInimigo.equals("Cobra"))
                this.envenenado = true;

            return "recebeu " + dano + " de dano";
        }
    }
    public String interagir(){
        return "Por justiça!";
    }
}
