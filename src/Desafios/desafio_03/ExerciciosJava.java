package desafios.desafio_03;

public class ExerciciosJava {
    public static void main(String[] args) {
        /*
        Exercício 1:
        Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        */
        double nota1 = 6.5, nota2 = 8.2;
        double mediaNota = (nota1 + nota2) / 2;
        System.out.println("A média das notas é: " + mediaNota);

        /*
        Exercício 2:
        Declare uma variável do tipo double e uma variável do tipo int.
        Faça o casting da variável double para int e imprima o resultado.
        */
        double valorDecimal = 2.2;
        int valorInteiro = (int) valorDecimal;
        System.out.println("O valor após o casting é: " + valorInteiro);

        /*
        Exercício 3:
        Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        Atribua valores a essas variáveis e concatene-as em uma mensagem.
        */
        char letra = 'a';
        String mensagem = "A letra inserida é: ";
        System.out.println(mensagem + letra);

        /*
        Exercício 4:
        Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o
        resultado em uma mensagem.
        */
        double precoProduto = 10.0;
        int quantidadeProduto = 10;
        double valorTotalCompra = precoProduto * quantidadeProduto;
        System.out.println("O valor total é: " + valorTotalCompra);

        /*
        Exercício 5:
        Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em
        dólares para reais e imprima o resultado formatado.
        */
        double valorEmDolares = 100.00;
        double valorConvertidoParaReais = valorEmDolares * 4.94;
        System.out.printf("O valor em reais é: %.2f%n", valorConvertidoParaReais);

        /*
        Exercício 6:
        Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
        representando o preço original de um produto. Em seguida, declare uma variável do tipo double
        percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        */
        double precoOriginalProduto = 500.00;
        double percentualDesconto = 10.0;
        double valorDesconto = (precoOriginalProduto * percentualDesconto) / 100;
        double precoProdutoComDesconto = precoOriginalProduto - valorDesconto;
        System.out.println("O preço do produto com desconto é de: " + precoProdutoComDesconto);
    }
}
