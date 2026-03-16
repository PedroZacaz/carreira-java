package Exercícios;

public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 200.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println(String.format("""
                Preço original: R$%.2f
                Desconto: R$%.2f
                Novo preço com desconto: R$%.2f
                """,precoOriginal,valorDesconto,novoPreco));
    }
}
