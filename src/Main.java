import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        int NumeroSortido = new Random().nextInt(100);
        System.out.println("Jogo de adivinhar um número de 0 a 100");

        for (int i = 1; i < 6 ; i++) {
            System.out.println("Digite um número de 0 a 100 Tentativa " + i );
            int numeroEscolhido = inputs.nextInt();


            if (numeroEscolhido < NumeroSortido) {
                System.out.println("O número é maior que esse, tente novamente.");

            } else if (numeroEscolhido > NumeroSortido) {
                System.out.println("O número é menor que esse, tente novamente.");

            } else {
                System.out.println("Número correto parabéns!!");
                break;
            }
        }
        System.out.println("O número sortido era: " + NumeroSortido);

    }




}
