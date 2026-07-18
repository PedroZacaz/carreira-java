package Exercícios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        int fatorial = 1;

        System.out.println("""
                    ---- FATORIAL ----
                Digite um número inteiro para descobrir o FATORIAL:
                """);
        for (numero = leitor.nextInt(); numero > 1; numero--) {
            fatorial = numero * fatorial;
           // System.out.println(numero + " X " +  (i++) + " = " + fatorial);
        }

        System.out.println("O Fatorial de " + numero + " é: " + fatorial);

        //Consertar depois a linha 20 para mostrar o valor certo
    }
}
