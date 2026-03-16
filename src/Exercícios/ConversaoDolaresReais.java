package Exercícios;

public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 85.60;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println(String.format("A conversão de $%.2f para reais → R$%.2f", valorEmDolares, valorEmReais));
    }
}
