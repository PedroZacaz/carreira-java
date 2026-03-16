package Exercícios;

public class Temperatura {
    public static void main(String[] args) {
        System.out.println("""
                ===================================
                ||  CONVERTOR DE TEMPERATURA em  ||
                ||    Celsius para Fahrenheit    ||
                ===================================
                """);
        int celsius = 27;
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("Graus celsius atual → " + celsius + "°C");
        System.out.println("Conversão para Fahrenheit → " + fahrenheit + "°F");
        int fahrenheitInteiro = (int) fahrenheit;
        //quando utiliza o
        System.out.println("Fahrenheit Inteiro: " + fahrenheitInteiro + "°F");
    }
}
