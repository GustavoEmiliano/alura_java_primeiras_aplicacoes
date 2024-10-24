package Desafios.desafio_01;


import java.util.Scanner;
/*
Exercícios:
1- Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o método main, que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, "Olá, [Seu Nome]!".
2- Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada. Por exemplo, "Tudo bem?".
 */


public class Perfil {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Olá," + nome);
        System.out.printf("Tudo bem %s?", nome);
    }
}
