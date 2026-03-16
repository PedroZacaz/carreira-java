public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        //      TIPOS PRIMITIVOS
        // convenção ↓ camelCase para variavel
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean inclidoNoPlano = true;
        double notaFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println("Média do Filme: " + media);
        String sinopse;
        // String em única linha
        // sinopse = "Filme de aventura com o galã dos anos 80";

        // String onde pode escrever com múltiplas linhas, permitindo inserir o texto exatamente como ele é. Isso se chama Text Blocks
        sinopse = """
                Filme Top Gun
                Filme de aventura com o galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2 );
        System.out.println("Estrla de: " + classificacao);
    }
}

