package Exercícios;

public class Casting {
    public static void main(String[] args) {
        //Exercício 2
        double valor1 = 5.86;
        int valor2 = (int) valor1;

        System.out.println(String.format("""
                Valor double %.2f
                Valor inteiro %d
                """, valor1, valor2));
    }
}
