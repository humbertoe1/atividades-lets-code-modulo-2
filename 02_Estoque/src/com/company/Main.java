package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner  =  new Scanner(System.in);
        int opcao = 0;
        String nomeDoEstoque;
        String nomeDoProduto, marca, sessao, tipo;
        int quantidade;
        int escolha;
        int cadastrarProdutos = 0;
        Set<Produto> cadastroDeProdutos = new HashSet<>();
        List<Estoque> cadastroDeEstoques = new ArrayList<>();

        System.out.println("Bem vindo ao adminstrador de estoques!");
        while(opcao != -1){

            System.out.println("Selecione uma opcao: ");
            System.out.println("1 - Cadastrar novo estoque");
            System.out.println("2 - Consultar estoque existente");
            System.out.println("3 - Cadastrar um novo produto");
            System.out.println("4 - Adicionar Produto existente a um estoque");
            System.out.println("-1 - SAIR/EXIT");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Escolha um nome para o estoque: ");
                    nomeDoEstoque = scanner.nextLine();
                    cadastroDeEstoques.add(new Estoque(nomeDoEstoque));
                    break;
                case 2:
                    System.out.println("Escolha um estoque para consultar: ");
                    if(cadastroDeEstoques.size() == 0){
                        System.out.println("Nao tem estoques cadastrados!");
                    }else {
                        for (Estoque estoque : cadastroDeEstoques) {
                            System.out.println("Id - " + estoque.getId() + " || Nome: " + estoque.getNome());
                        }
                        System.out.println("Escolha pelo id: ");
                        escolha = scanner.nextInt();
                        for(Estoque estoque : cadastroDeEstoques){
                            if(estoque.getId() == escolha){
                                estoque.listarProdutosDoEstoque();
                            }
                        }
                        System.out.println("EXECUTE ALGUMA AÇÃO:");
                        System.out.println("1 - Remover Produto");
                        System.out.println("2 - Remover quantidade de algum produto");

                    }
                    break;
                case 3:
                    System.out.println("Vamos cadastrar um novo produto!");
                    boolean jaExiste = false;
                    System.out.println("Digite um nome para o produto: ");
                    nomeDoProduto = scanner.nextLine();
                    System.out.println("Digite a marca do produto: ");
                    marca = scanner.nextLine();
                    for(Produto produto : cadastroDeProdutos){
                        if(produto.equals(new Produto(nomeDoProduto, marca))){
                            System.out.println("Produto já cadastrado, quer adicionar quantas unidades ao estoque?");
                            jaExiste = true;
                            quantidade = scanner.nextInt();
                            scanner.nextLine();
                            produto.adicionarQuantidade(quantidade);
                        }
                    }
                    if(!jaExiste) {
                        System.out.println("Digite a sessao do produto: ");
                        sessao = scanner.nextLine();
                        System.out.println("Digite o tipo do produto: ");
                        tipo = scanner.nextLine();
                        System.out.println("Digite a quantidade desse produto: ");
                        quantidade = scanner.nextInt();
                        scanner.nextLine();
                        cadastroDeProdutos.add(new Produto(nomeDoProduto, sessao, marca, tipo, quantidade));
                    }
                    break;
                case 4:
                    System.out.println("Vamos adicionar produtos a algum estoque: ");
                    int idTemporarioEstoque, idTemporarioProduto, quantidadeParaAdicionar;
                    System.out.println("Escolha da lista abaixo em qual estoque você quer colocar os produtos: ");
                    for (Estoque estoque: cadastroDeEstoques) {
                        System.out.println("ID: " + estoque.getId() + " || Nome: " + estoque.getNome());
                    }
                    System.out.println("Digite o ID do estoque: ");
                    idTemporarioEstoque = scanner.nextInt();
                    System.out.println("Segue os produtos disponiveis para serem adicionados: ");
                    for(Produto produto: cadastroDeProdutos){
                        produto.imprimirProdutos();
                    }
                    System.out.println("Veja a lista e escolha o id do produto que quer adicionar ao estoque");
                    idTemporarioProduto = scanner.nextInt();
                    System.out.println("Quantos produtos voce deseja adicionar?");
                    quantidadeParaAdicionar = scanner.nextInt();
                    for(Estoque estoque: cadastroDeEstoques){
                        if(estoque.getId() == idTemporarioEstoque){
                            for (Produto produto: cadastroDeProdutos) {
                                if(produto.getId() == idTemporarioProduto) {
                                    if(produto.getQuantidadeEmEstoque() < quantidadeParaAdicionar){
                                        System.out.println("ERRO - A QUANTIDADE SOLICITADA É MAIOR QUE A DISPONIVEL");
                                        break;
                                    }else {
                                        int novoValor = produto.getQuantidadeEmEstoque() - quantidadeParaAdicionar;
                                        produto.setQuantidadeEmEstoque(novoValor);
                                        estoque.adicionarProduto(produto, quantidadeParaAdicionar);
                                    }
                                }
                            }
                        }
                    }
                    break;
                case -1:
                    opcao = -1;
                    break;
                default:
                    System.out.println("Opcao Invalida!!! Tente novamente!");
                    break;
            }
        }



    }
}
