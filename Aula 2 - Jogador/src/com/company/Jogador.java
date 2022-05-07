package com.company;

import java.time.LocalDateTime;

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
    public boolean suspenso;

    public Jogador(){

    }

    public Jogador(int id, String nome, String apelido, LocalDateTime data, int numero, String posicao, int qualidade, int cartoesAmarelos, int cartaoVermelho, boolean suspenso){
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.data = data;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = suspenso;
    }

}

