package com.company;

public class Cobra extends Generico{

    public Cobra(){
        this.nome = "Cobra";

    }
    public int atacar(int dados) {
        System.out.println("causou " + (dados*3) + " de dano");
        if((dados*3) == 18){
            System.out.println("Voce esta envenenado!!");
        }
        return dados*3;
    }
    public String apanhar(int dano, String tipo){
        if (tipo.toUpperCase().equals("PANCADA")) {
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
        return "Se você acender a chama a maldição acaba";
    }
}
