package com.company;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //Front end:
        int quantidade;
        Class clazz;
        Livraria livraria = new Livraria();
        Produto produto;
        AlbumDeMusica albumDeMusica;
        Brinquedo brinquedo;
        Filme filme;
        Jogo jogo;
        Livro livro;
        //Dados Produto:
        String nomeProduto;
        int idProduto;
        BigDecimal precoProduto;
        boolean produtoAdulto;
        //Dados p/ Album de Musica
        String musicoOuBanda, generoMusica, seloMusica;
        //Dados p/ Brinquedo
        String tipoDeBrinquedo;
        //Dadoas p/ Filme
        String estudioFilme, diretorFilme, generoFilme, produtorFilme;
        //Dados p/ Jogo
        String distribuidoraJogo, generoJogo, estudioJogo;
        //Dados p/ Livro
        String generoLivro, escritorLivro, editoraLivro;
	    System.out.println("SISTEMA DE LIVRARIA");

        int opcao= 100;
        Scanner scanner = new Scanner(System.in);

        while(opcao != 0) {

            System.out.println("MENU PRINCIPAL - ESCOLHA UMA OPÇÃO:");
            System.out.println("SALDO EM CAIXA: " + livraria.getCaixa().getSaldo());
            System.out.println("1 - REALIZAR VENDA");
            System.out.println("2 - ADICIONAR/CADASTRAR PRODUTO");
            System.out.println("3 - LISTAR ESTOQUE");
            System.out.println("4 - ALTERAR DADOS DE PRODUTO");
            System.out.println("5 - REMOVER PRODUTO");
            System.out.println("0 - SAIR");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Entre o id do Produto: ");
                    produto = livraria.getEstoque().verProduto(scanner.nextInt());
                    if(produto.isProdutoAdulto()){
                        System.out.println("Entre idade do comprador: ");
                        if(!livraria.analisarIdentidade(scanner.nextInt())){
                            scanner.nextLine();
                            System.out.println("ESSE PRODUTO É PROIBIDO PARA MENORES DE 18 ANOS");
                            break;
                        }
                    }
                    scanner.nextLine();
                    System.out.println("Entre a quantidade que vai ser vendida: ");
                    livraria.venda(produto, scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("VENDA FINALIZADA");
                    break;
                case 2:
                    System.out.println("DESEJA CADASTRAR OU AUMENTAR ESTOQUE DE PRODUTO EXISTENTE?");
                    System.out.println("1 - CADASTRAR NOVO");
                    System.out.println("2 - ADICIONAR QUANTIDADE DE PRODUTO EXISTENTE");
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    if(opcao == 1){
                        System.out.println("QUAL É O TIPO DE PRODUTO?");
                        System.out.println("1 - ALBUM DE MUSICA");
                        System.out.println("2 - BRINQUEDO");
                        System.out.println("3 - FILME");
                        System.out.println("4 - JOGO");
                        System.out.println("5 - LIVRO");
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        switch (opcao){
                            case 1:
                                System.out.println("Entre o nome do produto: ");
                                nomeProduto = scanner.nextLine();
                                idProduto = livraria.getGeradorDeID().gerarId();
                                System.out.println("Entre o preço do produto: ");
                                precoProduto = new BigDecimal(scanner.nextLine());
                                System.out.println("Esse Produto pode ser vendido para menores de 18 anos?");
                                System.out.println("[1] SIM\n [2] NÃO");
                                opcao = scanner.nextInt();
                                scanner.nextLine();
                                produtoAdulto = !(opcao == 1);
                                System.out.println("Entre o nome do musico ou da banda: ");
                                musicoOuBanda = scanner.nextLine();
                                System.out.println("Entre o genero musical: ");
                                generoMusica = scanner.nextLine();
                                System.out.println("Entre o selo: ");
                                seloMusica = scanner.nextLine();



                                albumDeMusica = new AlbumDeMusica(nomeProduto, idProduto, precoProduto, produtoAdulto, musicoOuBanda, generoMusica, seloMusica);
                                System.out.println("Qual a quantidade desse produto que voce quer adicionar ao estoque: ");

                                livraria.getEstoque().alterarQuantidadeProdutoOuCadastrar(albumDeMusica, scanner.nextInt());
                                scanner.nextLine();
                                break;
                            case 2:
                                System.out.println("Entre o nome do produto: ");
                                nomeProduto = scanner.nextLine();
                                idProduto =  livraria.getGeradorDeID().gerarId();
                                System.out.println("Entre o preço do produto: ");
                                precoProduto = new BigDecimal(scanner.nextLine());
                                System.out.println("Esse Produto pode ser vendido para menores de 18 anos?");
                                System.out.println("[1] SIM\n [2] NÃO");
                                opcao = scanner.nextInt();
                                scanner.nextLine();
                                produtoAdulto = !(opcao == 1);
                                System.out.println("Qual o tipo desse brinquedo?");
                                tipoDeBrinquedo = scanner.nextLine();

                                brinquedo = new Brinquedo(nomeProduto, idProduto, precoProduto, produtoAdulto, tipoDeBrinquedo);
                                System.out.println("Qual a quantidade desse produto que voce quer adicionar ao estoque: ");
                                livraria.getEstoque().alterarQuantidadeProdutoOuCadastrar(brinquedo, scanner.nextInt());
                                scanner.nextLine();
                                break;
                            case 3:
                                System.out.println("Entre o nome do produto: ");
                                nomeProduto = scanner.nextLine();
                                idProduto =  livraria.getGeradorDeID().gerarId();
                                System.out.println("Entre o preço do produto: ");
                                precoProduto = new BigDecimal(scanner.nextLine());
                                System.out.println("Esse Produto pode ser vendido para menores de 18 anos?");
                                System.out.println("[1] SIM\n [2] NÃO");
                                opcao = scanner.nextInt();
                                scanner.nextLine();
                                produtoAdulto = !(opcao == 1);
                                System.out.println("Entre o estudio do filme: ");
                                estudioFilme = scanner.nextLine();
                                System.out.println("Entre o diretor do filme: ");
                                diretorFilme = scanner.nextLine();
                                System.out.println("Entre o genero do filme: ");
                                generoFilme = scanner.nextLine();
                                System.out.println("Entre o produtor do filme: ");
                                produtorFilme = scanner.nextLine();

                                filme = new Filme(nomeProduto, idProduto, precoProduto, produtoAdulto, estudioFilme, diretorFilme, generoFilme, produtorFilme);
                                System.out.println("Qual a quantidade desse produto que voce quer adicionar ao estoque: ");
                                livraria.getEstoque().alterarQuantidadeProdutoOuCadastrar(filme, scanner.nextInt());
                                scanner.nextLine();
                                break;
                            case 4:
                                System.out.println("Entre o nome do produto: ");
                                nomeProduto = scanner.nextLine();
                                idProduto =  livraria.getGeradorDeID().gerarId();
                                System.out.println("Entre o preço do produto: ");
                                precoProduto = new BigDecimal(scanner.nextLine());
                                System.out.println("Esse Produto pode ser vendido para menores de 18 anos?");
                                System.out.println("[1] SIM\n [2] NÃO");
                                opcao = scanner.nextInt();
                                scanner.nextLine();
                                produtoAdulto = !(opcao == 1);
                                System.out.println("Entre o nome da distribuidora: ");
                                distribuidoraJogo = scanner.nextLine();
                                System.out.println("Entre o genero do jogo: ");
                                generoJogo = scanner.nextLine();
                                System.out.println("Entre o nome do estudio: ");
                                estudioJogo = scanner.nextLine();

                                jogo = new Jogo(nomeProduto, idProduto, precoProduto, produtoAdulto, distribuidoraJogo, generoJogo, estudioJogo);
                                System.out.println("Qual a quantidade desse produto que voce quer adicionar ao estoque: ");
                                livraria.getEstoque().alterarQuantidadeProdutoOuCadastrar(jogo, scanner.nextInt());
                                scanner.nextLine();
                                break;
                            case 5:
                                System.out.println("Entre o nome do produto: ");
                                nomeProduto = scanner.nextLine();
                                idProduto =  livraria.getGeradorDeID().gerarId();
                                System.out.println("Entre o preço do produto: ");
                                precoProduto = new BigDecimal(scanner.nextLine());
                                System.out.println("Esse Produto pode ser vendido para menores de 18 anos?");
                                System.out.println("[1] SIM\n [2] NÃO");
                                opcao = scanner.nextInt();
                                scanner.nextLine();
                                produtoAdulto = !(opcao == 1);
                                System.out.println("Entre o genero do livro: ");
                                generoLivro = scanner.nextLine();
                                System.out.println("Entre o escritor do livro: ");
                                escritorLivro = scanner.nextLine();
                                System.out.println("Entre a editora do livro: ");
                                editoraLivro = scanner.nextLine();

                                livro = new Livro(nomeProduto, idProduto, precoProduto, produtoAdulto, generoLivro, escritorLivro, editoraLivro);
                                System.out.println("Qual a quantidade desse produto que voce quer adicionar ao estoque: ");
                                livraria.getEstoque().alterarQuantidadeProdutoOuCadastrar(livro, scanner.nextInt());
                                scanner.nextLine();
                                break;
                            default:
                                System.out.println("OPÇCAO INVALIDA");
                                break;
                        }
                    }else if(opcao == 2){
                        System.out.println("Consulte a lista e escolha o ID do produto que deseja cadastrar ao estoque: ");
                        livraria.getEstoque().imprimirEstoque();
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Com o produto já escolhido, defina a quantidade que vai adicionar: ");
                        livraria.getEstoque().alterarQuantidadeProdutoOuCadastrar(livraria.getEstoque().verProduto(opcao), scanner.nextInt());
                        scanner.nextLine();
                    }else{
                        System.out.println("Opcao Invalida.");
                    }
                    break;
                case 3:
                    System.out.println("SELECIONE COMO QUER LISTAR:");
                    System.out.println("1 - LISTAR TODOS:");
                    System.out.println("2 - LISTAR POR CATEGORIA: ");
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    if (opcao == 1){
                        livraria.getEstoque().imprimirEstoque();
                    }else if (opcao == 2){
                        System.out.println("QUAL CATEGORIA VOCE QUER CONSULTAR:");
                        System.out.println("1 - ALBUM DE MUSICA");
                        System.out.println("2 - BRINQUEDO");
                        System.out.println("3 - FILME");
                        System.out.println("4 - JOGO");
                        System.out.println("5 - LIVRO");
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        if(opcao == 1){
                            clazz = AlbumDeMusica.class;
                        }else if(opcao == 2){
                            clazz = Brinquedo.class;
                        } else if (opcao == 3) {
                            clazz = Filme.class;
                        }else if (opcao == 4){
                            clazz = Jogo.class;
                        }else if(opcao == 5){
                            clazz = Livro.class;
                        }else{
                            clazz = Produto.class;
                        }
                        livraria.getEstoque().imprimirEstoquePorCategoria(clazz);
                    }
                    break;
                case 4:
                    System.out.println("Escolha o produto que voce deseja atualizar os dados: ");
                    livraria.getEstoque().imprimirEstoque();
                    System.out.println("Digite o id do produto que voce quer alterar: ");
                    idProduto = scanner.nextInt();
                    scanner.nextLine();
                    clazz = livraria.getEstoque().verProduto(idProduto).getClass();
                    if(clazz == AlbumDeMusica.class){
                        System.out.println("Entre o novo nome do produto: ");
                        nomeProduto = scanner.nextLine();
                        /*System.out.println("Entre o id do produto: ");
                        idProduto = scanner.nextInt();
                        scanner.nextLine();*/
                        System.out.println("Entre o novo preço do produto: ");
                        precoProduto = new BigDecimal(scanner.nextLine());
                        System.out.println("Esse Produto pode ser vendido para menores de 18 anos?");
                        System.out.println("[1] SIM\n [2] NÃO");
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        produtoAdulto = !(opcao == 1);
                        System.out.println("Entre o novo nome do musico ou da banda: ");
                        musicoOuBanda = scanner.nextLine();
                        System.out.println("Entre o novo genero musical: ");
                        generoMusica = scanner.nextLine();
                        System.out.println("Entre o novo selo musical: ");
                        seloMusica = scanner.nextLine();
                        System.out.println("Esse Produto pode ser vendido para menores de 18 anos?");


                        albumDeMusica = new AlbumDeMusica(nomeProduto, idProduto, precoProduto, produtoAdulto, musicoOuBanda, generoMusica, seloMusica);
                        System.out.println("Se quiser adicionar ou remover alguma quantidade desse produto, entre o valor positivo, negativo, ou zero para manter ");

                        livraria.getEstoque().alterarQuantidadeProdutoOuCadastrar(albumDeMusica, scanner.nextInt());
                        scanner.nextLine();
                    }
                    if(clazz == Brinquedo.class){
                        System.out.println("Entre o novo nome do produto: ");
                        nomeProduto = scanner.nextLine();
                        /*System.out.println("Entre o id do produto: ");
                        idProduto = scanner.nextInt();
                        scanner.nextLine();*/
                        System.out.println("Entre o novo preço do produto: ");
                        precoProduto = new BigDecimal(scanner.nextLine());
                        System.out.println("Esse Produto pode ser vendido para menores de 18 anos?");
                        System.out.println("[1] SIM\n [2] NÃO");
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        produtoAdulto = !(opcao == 1);
                        System.out.println("Qual o novo tipo desse brinquedo?");
                        tipoDeBrinquedo = scanner.nextLine();

                        brinquedo = new Brinquedo(nomeProduto, idProduto, precoProduto, produtoAdulto, tipoDeBrinquedo);
                        System.out.println("Se quiser adicionar ou remover alguma quantidade desse produto, entre o valor positivo, negativo, ou zero para manter ");
                        livraria.getEstoque().alterarQuantidadeProdutoOuCadastrar(brinquedo, scanner.nextInt());
                        scanner.nextLine();
                    }
                    if(clazz == Filme.class){
                        System.out.println("Entre o novo nome do produto: ");
                        nomeProduto = scanner.nextLine();
                        /*System.out.println("Entre o id do produto: ");
                        idProduto = scanner.nextInt();
                        scanner.nextLine();*/
                        System.out.println("Entre o novo preço do produto: ");
                        precoProduto = new BigDecimal(scanner.nextLine());
                        System.out.println("Esse Produto pode ser vendido para menores de 18 anos?");
                        System.out.println("[1] SIM\n [2] NÃO");
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        produtoAdulto = !(opcao == 1);
                        System.out.println("Entre o novo estudio do filme: ");
                        estudioFilme = scanner.nextLine();
                        System.out.println("Entre o novo diretor do filme: ");
                        diretorFilme = scanner.nextLine();
                        System.out.println("Entre o novo genero do filme: ");
                        generoFilme = scanner.nextLine();
                        System.out.println("Entre o novo produtor do filme: ");
                        produtorFilme = scanner.nextLine();

                        filme = new Filme(nomeProduto, idProduto, precoProduto, produtoAdulto, estudioFilme, diretorFilme, generoFilme, produtorFilme);
                        System.out.println("Se quiser adicionar ou remover alguma quantidade desse produto, entre o valor positivo, negativo, ou zero para manter  ");
                        livraria.getEstoque().alterarQuantidadeProdutoOuCadastrar(filme, scanner.nextInt());
                        scanner.nextLine();
                    }
                    if(clazz == Jogo.class){
                        System.out.println("Entre o novo nome do produto: ");
                        nomeProduto = scanner.nextLine();
                        /*System.out.println("Entre o id do produto: ");
                        idProduto = scanner.nextInt();
                        scanner.nextLine();*/
                        System.out.println("Entre o novo preço do produto: ");
                        precoProduto = new BigDecimal(scanner.nextLine());
                        System.out.println("Esse Produto pode ser vendido para menores de 18 anos?");
                        System.out.println("[1] SIM\n [2] NÃO");
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        produtoAdulto = !(opcao == 1);
                        System.out.println("Entre o novo nome da distribuidora: ");
                        distribuidoraJogo = scanner.nextLine();
                        System.out.println("Entre o novo genero do jogo: ");
                        generoJogo = scanner.nextLine();
                        System.out.println("Entre o novo nome do estudio: ");
                        estudioJogo = scanner.nextLine();

                        jogo = new Jogo(nomeProduto, idProduto, precoProduto, produtoAdulto, distribuidoraJogo, generoJogo, estudioJogo);
                        System.out.println("Se quiser adicionar ou remover alguma quantidade desse produto, entre o valor positivo, negativo, ou zero para manter ");
                        livraria.getEstoque().alterarQuantidadeProdutoOuCadastrar(jogo, scanner.nextInt());
                        scanner.nextLine();
                    }
                    if(clazz == Livro.class){
                        System.out.println("Entre o novo nome do produto: ");
                        nomeProduto = scanner.nextLine();
                        /*System.out.println("Entre o id do produto: ");
                        idProduto = scanner.nextInt();
                        scanner.nextLine();
                        */

                        System.out.println("Entre o novo preço do produto: ");
                        precoProduto = new BigDecimal(scanner.nextLine());
                        System.out.println("Esse Produto pode ser vendido para menores de 18 anos?");
                        System.out.println("[1] SIM\n [2] NÃO");
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        produtoAdulto = !(opcao == 1);
                        System.out.println("Entre o novo genero do livro: ");
                        generoLivro = scanner.nextLine();
                        System.out.println("Entre o novo escritor do livro: ");
                        escritorLivro = scanner.nextLine();
                        System.out.println("Entre a novo editora do livro: ");
                        editoraLivro = scanner.nextLine();

                        livro = new Livro(nomeProduto, idProduto, precoProduto, produtoAdulto, generoLivro, escritorLivro, editoraLivro);
                        System.out.println("Se quiser adicionar ou remover alguma quantidade desse produto, entre o valor positivo, negativo, ou zero para manter  ");
                        livraria.getEstoque().alterarQuantidadeProdutoOuCadastrar(livro, scanner.nextInt());
                        scanner.nextLine();
                    }
                    break;
                case 5:
                    System.out.println("Qual produto você quer remover?");
                    livraria.getEstoque().imprimirEstoque();
                    System.out.println("Entre o id do produto a ser removido: ");
                    livraria.getEstoque().removerProduto(livraria.getEstoque().verProduto(scanner.nextInt()));
                    System.out.println("PRODUTO REMOVIDO");
                    break;
                case 0:
                    System.out.println("Certeza que deseja sair?");
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("[1] SIM\n[2] NÃO");
                    if (opcao == 1){
                        opcao = 0;
                    }else{
                        opcao = 1;
                    }
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente.");
                    break;
            }
        }
    }

}
