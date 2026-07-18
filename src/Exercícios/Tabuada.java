package Exercícios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        int tabuada = 0;

        System.out.println("""
                                --- TABUADA ---
                Digite um número inteiro para saber a tabuada de 1 a 10.
                """);
        numero = leitor.nextInt();

        for (tabuada = 1; tabuada < 11; tabuada++) {
            int resultado = numero * tabuada;
            System.out.println(numero + " X " + tabuada +" = " + resultado);
        }

    }
}
