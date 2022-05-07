package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	LocalDateTime data = LocalDateTime.now();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome do Time: ");
    String nomeDoTime = scanner.nextLine();
    int id, numero, qualidade, cartoesAmarelos, cartaoVermelho;
    String nome, apelido, posicao;
    boolean suspenso = false;


    Jogador[] time = new Jogador[11];

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
    

    time[0] = new Jogador(id = 0, nome, apelido, data, numero, posicao = "goleiro", qualidade, cartoesAmarelos, cartaoVermelho, suspenso);

    System.out.println(time[0].id + time[0].nome + time[0].apelido + time[0].data + time[0].numero + time[0].posicao + time[0].qualidade + time[0].cartoesAmarelos + time[0].cartaoVermelho + time[0].suspenso);
    }
}
