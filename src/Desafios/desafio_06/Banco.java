package desafios.desafio_06;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("|         CADASTRO        |");
        System.out.println("===========================");
        System.out.println("Qual o seu nome? ");

        String nomeCliente = leitura.nextLine();

        String tipoConta = "";
        int opcaoConta;

        do {
            System.out.println("===========================");
            System.out.println("Qual tipo de conta deseja abrir? ");
            System.out.println(" 1 - Poupança                  ");
            System.out.println(" 2 - Corrente                  ");
            System.out.println(" 3 - Fundo                     ");
            opcaoConta = leitura.nextInt();
            System.out.print("  ");
            System.out.println("===========================");


            switch (opcaoConta) {
                case 1:
                    tipoConta = "Poupança";
                    break;
                case 2:
                    tipoConta = "Corrente";
                    break;
                case 3:
                    tipoConta = "Fundo";
                    break;
                default:
                    System.out.println("Opção de conta inválida! Tente novamente.");
            }
        } while (opcaoConta < 1 || opcaoConta > 3);

        double saldoConta;
        do {
            System.out.print("Qual valor deseja depositar para abrir sua conta? ");
            saldoConta = leitura.nextDouble();
            if (saldoConta <= 0) {
                System.out.println("Valor de depósito deve ser maior que zero! Tente novamente.");
            }
        } while (saldoConta <= 0);

        System.out.println("=============================");
        System.out.println("\nDados do Cliente:          ");
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.printf("Saldo: R$ %.2f%n\n", saldoConta);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=============================");
            System.out.println("|         OPERAÇÕES        |");
            System.out.println("=============================");
            System.out.println("| 1 - Consultar saldo      |");
            System.out.println("| 2 - Receber valor        |");
            System.out.println("| 3 - Transferir valor     |");
            System.out.println("| 4 - Sair                 |");
            System.out.println("=============================");
            System.out.print("Escolha uma opção (1-4): ");
            int opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("O saldo atual é de: R$ %.2f%n", saldoConta);
                    break;
                case 2:
                    System.out.println("Qual o valor a receber? ");
                    double valorRecebido = leitura.nextDouble();

                    if (valorRecebido <= 0) {
                        System.out.println("Não é possível receber este valor!");
                    } else {
                        saldoConta += valorRecebido;
                        System.out.printf("Saldo atualizado: R$ %.2f%n", saldoConta);
                    }
                    break;
                case 3:
                    if (saldoConta <= 0) {
                        System.out.println("Saldo insuficiente para realizar transferências!");
                        break;
                    }
                    System.out.print("Qual valor você deseja transferir? ");
                    double valorTransferencia = leitura.nextDouble();
                    if (valorTransferencia > 0 && saldoConta >= valorTransferencia) {
                        saldoConta -= valorTransferencia;
                        System.out.printf("Valor transferido: R$ %.2f%n", valorTransferencia);
                        System.out.printf("Saldo atualizado: R$ %.2f%n", saldoConta);
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        leitura.close();
    }
}
