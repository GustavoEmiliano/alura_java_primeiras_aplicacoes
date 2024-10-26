package desafios.desafio_05;

import java.util.Scanner;

public class ExercicosJava {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        /*
        Exercício 1:
        Crie um programa que solicite ao usuário digitar um número.
        Se o número for positivo, exiba "Número positivo",
        caso contrário, exiba "Número negativo".
        */

        System.out.print("Digite um número: ");
        int numero = leitura.nextInt();
        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        /*
        Exercício 2:
        Peça ao usuário para inserir dois números inteiros.
        Compare os números e imprima uma mensagem indicando se são iguais, diferentes,
        o primeiro é maior ou o segundo é maior.
        */

        System.out.print("Digite o primeiro número: ");
        int numero1 = leitura.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = leitura.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais!");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }

        /*
        Exercício 3:
        Crie um menu que oferece duas opções ao usuário:
        "1. Calcular área do quadrado" e "2. Calcular área do círculo".
        Solicite a escolha do usuário e realize o cálculo da área
        com base na opção selecionada.
        */

        System.out.println("==============================");
        System.out.println("|             MENU            |");
        System.out.println("==============================");
        System.out.println("| 1. Calcular área do quadrado|");
        System.out.println("| 2. Calcular área do círculo |");
        System.out.println("==============================");
        System.out.print("Digite o número da sua escolha: ");

        int opcao = leitura.nextInt();
        final double PI = 3.14;

        switch (opcao) {
            case 1:
                System.out.println("==============================");
                System.out.print("Entre com o valor do lado do quadrado: ");
                double valorLado = leitura.nextDouble();
                double areaDoQuadrado = valorLado * valorLado;
                System.out.println("A área do quadrado é: " + areaDoQuadrado);
                break;
            case 2:
                System.out.println("==============================");
                System.out.print("Entre com o valor do raio do círculo: ");
                double valorRaio = leitura.nextDouble();
                double areaDoCirculo = PI * Math.pow(valorRaio, 2);
                System.out.println("A área do círculo é: " + areaDoCirculo);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        /*
        Exercício 4:
        Crie um programa que solicite ao usuário um número e
        exiba a tabuada desse número de 1 a 10.
        */

        System.out.print("Digite um número para exibir a tabuada: ");
        int numeroTabuada = leitura.nextInt();

        System.out.println("Tabuada de " + numeroTabuada + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }

        /*
        Exercício 5:
        Crie um programa que solicite ao usuário a entrada de um número inteiro.
        Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        */
        System.out.print("Digite um número para verificar se é par ou ímpar: ");
        int numeroParImpar = leitura.nextInt();

        if (numeroParImpar % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }

        /*
        Exercício 6:
        Crie um programa que solicite ao usuário um número
        e calcule o fatorial desse número.
        */

        System.out.print("Digite um número para calcular o fatorial: ");
        int numeroFatorial = leitura.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= numeroFatorial; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numeroFatorial + " é: " + fatorial);
    }
}
