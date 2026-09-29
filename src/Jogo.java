import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativasRestantes = 10;

        try (Scanner scanner = new Scanner(System.in)) {
            while (tentativasRestantes > 0) {
                System.out.printf("Tente adivinhar o número entre 1 e 100. Tentativas restantes: %d%n",
                        tentativasRestantes);

                if (!scanner.hasNextInt()) {
                    System.out.println("Digite um número inteiro.");
                    scanner.next();
                    continue;
                }

                int palpite = scanner.nextInt();
                tentativasRestantes--;

                if (palpite == numeroSecreto) {
                    System.out.printf("Parabéns! Você acertou: %d.%n", numeroSecreto);
                    return;
                }

                if (palpite > numeroSecreto) {
                    System.out.println("O número secreto é menor.");
                } else {
                    System.out.println("O número secreto é maior.");
                }
            }

            System.out.printf("Suas tentativas acabaram. O número era %d.%n", numeroSecreto);
        }
    }
}
