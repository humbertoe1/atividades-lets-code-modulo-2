package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        int opcao;
        int tipoDeInimigo;
        int tamanhoDaDungeon;
        int dados;
        int variavelDesafio01, variavelDesafio02, variavelDesafio03, repostaDesafio;
        Generico inimigo;
        Heroi heroi = null;
	    System.out.println("Bem vindo a dungeon, vamos criar o seu Herói!");
	    System.out.println("Qual o tipo de heroi?");
	    System.out.println("1 - Guerreiro");
	    System.out.println("2 - Arqueiro");
	    System.out.println("3 - Mago");
	    opcao = scanner.nextInt();
	    scanner.nextLine();
	    while( heroi == null)
	    switch (opcao){
            case 1:
                System.out.println("Escolha um nome: ");
                heroi = new Guerreiro(scanner.nextLine());
                break;
            case 2:
                System.out.println("Escolha um nome: ");
                heroi = new Arqueiro(scanner.nextLine());
                break;
            case 3:
                System.out.println("Escolha um nome: ");
                heroi = new Mago(scanner.nextLine());
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
        System.out.println("Sua missao eh entrar na dungeon e sair vivo!!");
	    //vamos sortear a quantidade de inimigos nessa dungeon.
        opcao = aleatorio.nextInt(5) + 1;
        Generico[] inimigos = new Generico[opcao];
        int iterator = 0;
        while( iterator < opcao){
            tipoDeInimigo = aleatorio.nextInt(4);
            switch (tipoDeInimigo){
                case 0:
                    inimigos[iterator] = new Vampiro();
                    break;
                case 1:
                    inimigos[iterator] = new Cobra();
                    break;
                case 2:
                    inimigos[iterator] = new Gigante();
                    break;
                case 3:
                    inimigos[iterator] = new Generico();
                    break;
            }
            iterator++;
        }
        iterator = 0;
        System.out.println("Voce entra na dungeon...");
        tamanhoDaDungeon = aleatorio.nextInt(opcao + 6)+6;
        int iteratorInimigos= 0;
        while(iterator < tamanhoDaDungeon){
            if(heroi.getPontosDeVida() <= 0){
                System.out.println("Voce foi abatido!!!");
                break;
            }
            heroi.checaStatus();
            System.out.println("Pressione ENTER para continuar na dungeon");
            scanner.nextLine();


            switch (rolarDados()){
                case 1: case 3:
                    if(iteratorInimigos == inimigos.length){
                        System.out.println("Parece ser um covil de um inimigo, mas voce nao encontra ninguem e segue seu caminho...");
                        break;
                    }
                    System.out.println("Voce da de cara com um " + inimigos[iteratorInimigos].getNome() + "!!");
                    System.out.println(inimigos[iteratorInimigos].getNome().toUpperCase() + ": " + inimigos[iteratorInimigos].interagir());
                    System.out.println(heroi.getNome()+": " + heroi.interagir());
                    System.out.println("Pontos de Vida do Inimigo: " + inimigos[iteratorInimigos].getPontosDeVida());
                    while(heroi.getPontosDeVida() > 0 && inimigos[iteratorInimigos].getPontosDeVida() >0) {
                        System.out.println("Pressione ENTER para jogar os dados e atacar: ");
                        scanner.nextLine();

                        inimigos[iteratorInimigos].apanhar(heroi.atacar(rolarDados()), heroi.getTipoDeAtaque());
                        System.out.println("Pontos de Vida do Inimigo: " + inimigos[iteratorInimigos].getPontosDeVida());
                        if (inimigos[iteratorInimigos].getPontosDeVida() > 0) {
                            System.out.println("O " + inimigos[iteratorInimigos].getNome() + " ataca de volta!!");
                            heroi.apanhar(inimigos[iteratorInimigos].atacar(rolarDados()), inimigos[iteratorInimigos].getNome());
                            System.out.println("[" + heroi.getNome() + "]" + "Pontos de Vida: " + heroi.getPontosDeVida());
                            heroi.checaStatus();
                            if(heroi.getPontosDeVida() <= 0){
                                System.out.println("Voce foi abatido!!!");
                                break;
                            }
                        }else{
                            System.out.println("INIMIGO ABATIDO!");
                            System.out.println(heroi.getNome()+": " + heroi.interagir());
                        }
                    }
                    iteratorInimigos++;
                    break;
                case 2:
                    System.out.println("Voce cai numa armadilha!!");
                    heroi.apanhar((rolarDados()*2));
                    System.out.println("[" + heroi.getNome() + "]" + "Pontos de Vida: " + heroi.getPontosDeVida());
                    break;
                case 4:
                    if(rolarDados() >= 3) {
                        System.out.println("Voce encontra uma fonte de cura, e se sente aliviado!");
                        System.out.println("Voce bebe da fonta, e se estiver envenado agora esta curado.");
                        heroi.beberDaFonte();
                    }else{
                        System.out.println("Voce encontra um corpo de um aventureiro");
                        System.out.println("Pressione [1] para procurar itens no corpo ou qualquer numero para ignorar");
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        if(opcao == 1){
                            if(rolarDados() >= 3) {
                                System.out.println("Voce achou um kit de curativos, e usou para cobrir seus cortes e arranhoes.");
                                heroi.usarCurativo();
                            }else{
                                System.out.println("Voce se machuca procurando no corpo do morto");
                                heroi.apanhar(rolarDados());
                                System.out.println("[" + heroi.getNome() + "]" + "Pontos de Vida: " + heroi.getPontosDeVida());
                            }
                        }else {
                            System.out.println("Voce ignora e segue seu caminho");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Voce ve uma porta que só abre caso um desafio seja resolvido...");
                    variavelDesafio01 = rolarDados()*(rolarDados()*3);
                    variavelDesafio02 = rolarDados()*(rolarDados()*2);
                    variavelDesafio03 = rolarDados()*(rolarDados()*4);
                    System.out.println("Uma voz fala: quanto é: (" + variavelDesafio01 + " * " + variavelDesafio02 + ")" + "+"+ variavelDesafio03 +"?");
                    repostaDesafio = scanner.nextInt();
                    scanner.nextLine();

                    while(repostaDesafio != ((variavelDesafio01*variavelDesafio02)+variavelDesafio03)){
                        System.out.println("RESPOSTA ERRADA SEU TOLO!");
                        System.out.println("*Voce eh atingido por uma flecha do nada!!!*");
                        heroi.apanhar(rolarDados());
                        System.out.println("[" + heroi.getNome() + "]" + "Pontos de Vida: " + heroi.getPontosDeVida());
                        if(heroi.getPontosDeVida() <= 0){
                            System.out.println("Voce foi abatido!!!");
                            break;
                        }
                        System.out.println("Tente novamente: ");
                        repostaDesafio = scanner.nextInt();
                        scanner.nextLine();
                    }
                    System.out.println("Parabéns! Você passou pelo desafio, continue sua aventura!");
                    break;
                case 6:
                    System.out.println("Voce encontrou uma poção de restauração e tomou!");
                    heroi.tomarPocao();
                    System.out.println("[" + heroi.getNome() + "]" + "Pontos de Vida: " + heroi.getPontosDeVida());
                    break;
                default:
                    System.out.println("ERRO");
                    break;
            }
            iterator++;
        }
        if(heroi.getPontosDeVida() <= 0){
            System.out.println("Voce foi abatido!!!");
            System.out.println("!!GAME OVER!!");
        }else {
            System.out.println("VOCE VENCEU!!! CHEGOU AO FIM DA DUNGEON VIVO!!");
        }



    }
    public static int rolarDados(){
        Random rand = new Random();

        return rand.nextInt(6)+1;
    }
}
