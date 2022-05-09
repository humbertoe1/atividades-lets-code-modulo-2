package com.company;

import java.time.LocalDateTime;
import java.util.Random;

public class Jogador {
    public int id;
    public String nome;
    public String apelido;
    public LocalDateTime data;
    public int numero;
    public String posicao;
    public int qualidade;
    public int cartoesAmarelos;
    public int cartaoVermelho ;
    public boolean suspenso = false;
    public boolean treinou = false;

    public Jogador(){

    }

    public Jogador(int id, String nome, String apelido, LocalDateTime data, int numero, String posicao, int qualidade, int cartoesAmarelos, int cartaoVermelho){
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.data = data;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;

    }

    public void aplicarCartaoAmarelo(){
        this.cartoesAmarelos++;
        if(this.cartoesAmarelos >= 3){
            this.suspenso = true;
        }
    }
    public void aplicarCartaoVermelho(){
        this.cartaoVermelho++;
        this.suspenso = true;
    }
    public void cumprirSuspencao(){
        this.cartoesAmarelos = 0;
        this.cartaoVermelho = 0;
    }
    public void sofrerLesao(){
        Random rand = new Random();
        float qualidadeTemporaria;
        float nivelDaLesao = rand.nextFloat();
        System.out.println("Nivel da lesao:"+nivelDaLesao);
        if(nivelDaLesao <= 0.4){
            this.qualidade++;
        }else if(nivelDaLesao <= 0.7){
            this.qualidade+=2;
        }else if(nivelDaLesao <= 0.85){
            qualidadeTemporaria = this.qualidade;
            qualidadeTemporaria = qualidadeTemporaria - (qualidadeTemporaria*0.95f);
            this.qualidade = Math.round(qualidadeTemporaria);
        }else if(nivelDaLesao <= 0.95){
            qualidadeTemporaria = this.qualidade;
            qualidadeTemporaria = qualidadeTemporaria - (qualidadeTemporaria*0.90f);
            this.qualidade = Math.round(qualidadeTemporaria);
        }else{
            qualidadeTemporaria = this.qualidade;
            qualidadeTemporaria = qualidadeTemporaria - (qualidadeTemporaria*0.85f);
            this.qualidade = Math.round(qualidadeTemporaria);
        }
    }

    public void executarTreinamento(){
        if (!this.treinou){
            Random rand = new Random();
            this.qualidade = this.qualidade + rand.nextInt(2) + 1;
            this.treinou = true;
        }else{
            this.qualidade = this.qualidade;
        }
    }

    public void gerarRelatorioSobreJogador(){
        System.out.println("----------------------------------------");
        System.out.println("Nome do jogador: " + this.nome);
        System.out.println("Apelido: " + this.apelido);
        System.out.println("Numero do jogador: " + this.numero);
        System.out.println("Posição: " + this.posicao);
        System.out.println("Pontos de qualidade: " + this.qualidade);
        System.out.println("Numero de cartões amarelos: " + this.cartoesAmarelos);
        System.out.println("Numero de cartões vermelhos: " + this.cartaoVermelho);
        System.out.println("Data de cadastro" + this.data.toString());
        System.out.println("----------------------------------------");
    }

}

