package Exercícios;

import java.util.Scanner;

public class IdentificaSinal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        System.out.println("Descubra se o número é Positivo ou Negativo");

        numero = leitor.nextInt();

        if (numero > 0) {
            System.out.println("O número " + numero + " é POSITIVO");
        } else {
            System.out.println("O número " + numero + " é NEGATIVO");
        }
    }
}
