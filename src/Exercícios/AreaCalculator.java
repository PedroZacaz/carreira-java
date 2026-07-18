package Exercícios;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int menu = 0;
        double lado = 0;
        double pi = 3.14;
        double raio = 0;
        double area = 0;


        System.out.println("""
                    ---- Calculadora de Área ----
                
                Escolha uma das opções para calcular a área:
                1) Calcular área do QUADRADO.
                2) Calcular área do CÍRCULO.
                """);
        menu = leitor.nextInt();

        if (menu == 1) {
            System.out.println("""
                        ---- QUADRADO ----
                    
                    Digite o valor do LADO do quadrado:
                    """);
            lado = leitor.nextDouble();
            area = lado*lado;

            System.out.println("A área do QUADRADO é: " + area);

        } else if (menu == 2){
            System.out.println("""
                        ---- CÍRCULO ----
                    
                    Digite o valor do Raio do CÍRCULO:
                    """);
            raio = leitor.nextDouble();
            area = raio*raio*pi;

            System.out.println("A área do CÍRCULO é: " + area);
        } else {
            System.out.println("-- ERRO -- Digite um valor válido");
        }

    }
}
