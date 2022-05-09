package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	LocalDateTime data = LocalDateTime.now();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome do Time: ");
    String nomeDoTime = scanner.nextLine();
    int id = 0, numero, qualidade, cartoesAmarelos, cartaoVermelho;
    String nome, apelido, posicao;

    System.out.println("Bem vindo " + "! Quantos jogadores tem seu time?");

    int quantidadeDeJogadores = scanner.nextInt();



    Jogador[] time = new Jogador[quantidadeDeJogadores];

    System.out.println("Vamos cadastrar os 11 jogadores titulares: ");

    System.out.println("Voce eh OBRIGADO a cadastrar um GOLEIRO, vamos começar por esse jogador: ");
    System.out.println("Digite o nome do Goleiro: ");
    nome = scanner.nextLine();
    System.out.println("Digite o apelido do Goleiro: ");
    apelido = scanner.nextLine();
    data = LocalDateTime.now();
    System.out.println("Digite o numero do Goleiro: ");
    numero = scanner.nextInt();
    System.out.println("Digite os pontos de qualidade do Goleiro: ");
    qualidade = scanner.nextInt();
    System.out.println("Digite a quantidade de cartões amarelos atuais do Goleiro: ");
    cartoesAmarelos = scanner.nextInt();
    System.out.println("Digite a quantidade de cartões vermelhos atuais do Goleiro:");
    cartaoVermelho = scanner.nextInt();
    

    time[0] = new Jogador(id, nome, apelido, data, numero, posicao = "goleiro", qualidade, cartoesAmarelos, cartaoVermelho);

    System.out.println(time[0].id + time[0].nome + time[0].apelido + time[0].data + time[0].numero + time[0].posicao + time[0].qualidade + time[0].cartoesAmarelos + time[0].cartaoVermelho + time[0].suspenso);
    System.out.println("Cartao Amarelo!");
    time[0].aplicarCartaoAmarelo();
    System.out.println("Cartao Vermelho!");
    time[0].aplicarCartaoVermelho();
        System.out.println(time[0].id + time[0].nome + time[0].apelido + time[0].data + time[0].numero + time[0].posicao + time[0].qualidade + time[0].cartoesAmarelos + time[0].cartaoVermelho + time[0].suspenso);
    System.out.println("Cumpriu Suspensao!");
    time[0].cumprirSuspencao();
    System.out.println("Sofreu uma lesao!");
    time[0].sofrerLesao();
    System.out.println("Hora de treinar!");
    time[0].executarTreinamento();

        System.out.println(time[0].id + time[0].nome + time[0].apelido + time[0].data + time[0].numero + time[0].posicao + time[0].qualidade + time[0].cartoesAmarelos + time[0].cartaoVermelho + time[0].suspenso);

    System.out.println("Agora que você cadastrou o goleiro, vamos cadastrar o resto do time!");
    for(int i = 1; i < quantidadeDeJogadores; i++){
        System.out.println("Digite o nome desse jogador: ");
        nome = scanner.nextLine();
        System.out.println("Digite o apelido desse jogador: ");
        apelido = scanner.nextLine();
        data = LocalDateTime.now();
        System.out.println("Digite o numero desse jogador: ");
        numero = scanner.nextInt();
        System.out.println("Digite qual a posicao do jogador: ");
        posicao = scanner.nextLine();
        System.out.println("Digite os pontos de qualidade do jogador: ");
        qualidade = scanner.nextInt();
        System.out.println("Digite a quantidade de cartões amarelos atuais do jogador: ");
        cartoesAmarelos = scanner.nextInt();
        System.out.println("Digite a quantidade de cartões vermelhos atuais do jogador:");
        cartaoVermelho = scanner.nextInt();
        id++;
        time[i] = new Jogador(id = id+1, nome, apelido, data, numero, posicao, qualidade, cartoesAmarelos, cartaoVermelho);
        System.out.println("Jogador Cadastrado com Sucesso!");
    }


    }

}
