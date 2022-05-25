package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculo adicao = new Adicao();
        Calculo subtracao = new Subtracao();
        Calculo multiplicacao = new Multiplicacao();
        Calculo divisao = new Divisao();
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2;
        int opcao = 0;
        while(opcao != -1) {
            System.out.println("--Calculadora--");
            System.out.println("Qual operacao voce quer fazer?");

            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("-1 - Exit");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Entre o primeiro valor: ");
                    valor1  = scanner.nextDouble();

                    System.out.println("Entre o segundo valor: ");
                    valor2 = scanner.nextDouble();

                    System.out.println("Soma dos valores = " + adicao.operacao(valor1, valor2));

                    pressioneEnterParacontinuar();
                    break;
                case 2:
                    System.out.println("Entre o primeiro valor: ");
                    valor1  = scanner.nextDouble();

                    System.out.println("Entre o segundo valor: ");
                    valor2 = scanner.nextDouble();

                    System.out.println("Subtracao dos valores = " + subtracao.operacao(valor1, valor2));

                    pressioneEnterParacontinuar();
                    break;
                case 3:
                    System.out.println("Entre o primeiro valor: ");
                    valor1  = scanner.nextDouble();

                    System.out.println("Entre o segundo valor: ");
                    valor2 = scanner.nextDouble();

                    System.out.println("Multiplicacao dos valores = " + multiplicacao.operacao(valor1, valor2));

                    pressioneEnterParacontinuar();
                    break;
                case 4:
                    System.out.println("Entre o primeiro valor: ");
                    valor1  = scanner.nextDouble();

                    System.out.println("Entre o segundo valor: ");
                    valor2 = scanner.nextDouble();

                    System.out.println("Divisao dos valores = " + divisao.operacao(valor1, valor2));

                    pressioneEnterParacontinuar();
                    break;
                case -1:
                    System.out.println("Certeza que quer sair?");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NÃO");

                    opcao = scanner.nextInt();

                    pressioneEnterParacontinuar();
                    if(opcao == 1){
                        opcao = -1;
                    }

                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente!");
                    pressioneEnterParacontinuar();
                    break;
            }
        }
        System.out.println("Sistema finalizado");

    }

    public static void pressioneEnterParacontinuar(){
        System.out.println("PRESSIONE ENTER PARA CONTINUAR");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }


}
