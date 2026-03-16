package Exercícios;

public class Produto {
    public static void main(String[] args) {
        //Exercício 4
        double precoProduto = 12.89;
        int quantidadeProduto = 13;
        double total = precoProduto * quantidadeProduto;

        String mensagem = "O preço do produto é de R$%.2f e existem no estoque %d produtos%nque no total resulta: R$%.2f.";
        System.out.println(String.format(mensagem,precoProduto,quantidadeProduto, total));
        System.out.println("   0 O  ");
    }
}
