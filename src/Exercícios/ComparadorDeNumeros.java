package Exercícios;

import java.util.Scanner;

public class ComparadorDeNumeros {
    public static void main(String[] args) {
        Scanner leitor = new  Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Digite o 1° número: ");
        num1 = leitor.nextInt();

        System.out.println("Digire 2° número: ");
        num2 = leitor.nextInt();

        System.out.println("--- BOLETIM ---");

        if (num1 == num2){
            System.out.println("Os dois números são IGUAIS.");
        } else {
            System.out.println("Os dois números são DIFERENTES.");
        }

        System.out.println(" ");

        if (num1 > num2){
            System.out.println("O 1° ( " + num1 + " ) número é MAIOR que o 2° ( " + num2 + " ) número");
        } else {
            System.out.println("O 2° ( " + num2 + " ) número é MAIOR que o 1° ( " + num1 + " ) número");
        }

    }
}
