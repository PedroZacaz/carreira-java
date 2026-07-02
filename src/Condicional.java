public class Condicional {
    public static void main(String[] args) {
        int anoDeLançamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLançamento >= 2022){
            System.out.println("Lançamento que os clientes estão gostando!");
        } else  {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        /* Significados dos simbolos do operadores logicos
         || → ou
         && → e
        */
        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
