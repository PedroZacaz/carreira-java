import java.util.Scanner;

public class Leitura {
    // Atalho para criar o main → psvm
    public static void main(String[] args) {
        // o System.in (especificamente o .in) é um input que vai está sempre rastreando se foi feita alguma entrada pelo teclado
        Scanner leitura = new Scanner(System.in);

    System.out.println("Digite seu filme favorito:");
    String filme = leitura.nextLine();
    System.out.println("Qual o ano de lançamento? ");
    int anoDeLancamento = leitura.nextInt();
    System.out.println("Diga sua avaliação para o filme: ");
    double avaliacao = leitura.nextDouble();

    System.out.println(filme);
    System.out.println(anoDeLancamento);
    System.out.println(avaliacao);
    }
}
