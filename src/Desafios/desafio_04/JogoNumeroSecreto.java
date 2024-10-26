/*
Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:

Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.

A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

- Para gerar um número aleatório em Java: new Random().nextInt(100);
- Utilize o Scanner para obter os dados do usuário;
- Utilize uma variável para contar as tentativas;
- Utilize um loop para controlar as tentativas;
- Utilize a instrução break; para interromper o loop.
*/

package desafios.desafio_04;

import java.util.Random;
import java.util.Scanner;

public class JogoNumeroSecreto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int tentativas;

        System.out.println("====================================");
        System.out.println("Bem-Vindo ao Jogo do Número Secreto");
        System.out.println("====================================");

        for (tentativas = 5; tentativas >= 1; tentativas--) {
            System.out.println("Entre com o seu chute: ");
            int chute = scanner.nextInt();

            if (chute == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número secreto.");
                break;
            } else if (chute > numeroAleatorio) {
                System.out.println("O número secreto é menor!");
            } else {
                System.out.println("O número secreto é maior!");
            }

            // Exibe tentativas restantes, evitando mostrar com 0 tentativas
            if (tentativas > 1) {
                String palavraTentativa = (tentativas - 1) > 1 ? "tentativas" : "tentativa";
                System.out.println("Você ainda possui " + (tentativas - 1) + " " + palavraTentativa);
            } else {
                System.out.println("Esta foi sua última tentativa!");
            }

            System.out.println("====================================");
        }

        // Exibe mensagem final caso o número não seja adivinhado
        if (tentativas == 0) {
            System.out.println("Que pena! Você não conseguiu adivinhar o número secreto.");
            System.out.println("O número secreto era: " + numeroAleatorio);
        }

        System.out.println("====================================");
        System.out.println("Obrigado por jogar!");

        scanner.close();
    }
}
