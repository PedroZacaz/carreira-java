import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroDaMaquina = new Random().nextInt(100);
        int numeroDoJogador = 0;

        System.out.println("---JOGO DA ADIVINHAÇÃO---");
        System.out.println("Tente adivinhar um número entre 0 e 100.");
        System.out.println("Limite maximo de de Tentavivas é 5°, boa sorte!");

        //System.out.println("Número da maquina: " + numeroDaMaquina);

        for (int i = 1; i < 6; i++) {

            numeroDoJogador = leitura.nextInt();
            System.out.println("----- Tentativa número " + i + "° -----");

            if (numeroDoJogador == numeroDaMaquina){
                System.out.println("Parabéns! Você acertou o valor: " + numeroDaMaquina + " . Acertou na tentava " + i + "°");

                break; //Não tinha me atentado a isso, o break vai interromper o loop, sem a necessidade de rodar as 5 tentativas
            }
            else if (numeroDoJogador < numeroDaMaquina) {
                System.out.println("Tente um número MAIOR, pois o valor digitado é menor.");
            }
            else {
                System.out.println("Tente um número MENOR, pois o valor digitado é maior.");
            }
        }

        if (numeroDoJogador != numeroDaMaquina){
            System.out.println("Que pena, acabou as suas tentativas. O numero certo era: " + numeroDaMaquina);
        }
    }
}
