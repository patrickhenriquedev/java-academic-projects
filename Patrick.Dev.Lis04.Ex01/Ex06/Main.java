import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 42;
        ArrayList<Integer> palpites = new ArrayList<>();
        int palpite;

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            palpites.add(palpite);

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR que " + palpite);
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR que " + palpite);
            }
        } while (palpite != numeroSecreto);

        System.out.println("\nParabéns, você adivinhou! O número secreto é " + numeroSecreto + "!");
        System.out.println("Tentativas: " + palpites.size());
        System.out.println("\nPalpites:");

        for (int i = 0; i < palpites.size(); i++) {
            System.out.println((i + 1) + ") " + palpites.get(i));
        }

        scanner.close();
    }
}


