package desafios.desafio_02;

import java.util.Scanner;

/*
Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
Utilize variáveis para representar os valores das temperaturas e imprima no console
o valor convertido de Celsius para Fahrenheit.

Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é:
      (temperatura * 1.8) + 32.

Depois de finalizar, testar e conferir que seu programa foi executado com sucesso,
crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais.
Lembre-se que provavelmente você precisará fazer um casting de valores.
*/


public class ConversaoTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é de: " + temperaturaFahrenheit);

        // Exibindo apenas a parte inteira utilizando casting
        int fahrenheitTemperatura = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit exibindo sem as casas decimais é de: " + fahrenheitTemperatura);

    }
}
