import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dias = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};
        double[] temperaturas = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a temperatura de " + dias[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / 5;
        System.out.printf("\nMédia: %.2f°C\n\nAcima da média:\n", media);

        for (int i = 0; i < 5; i++) {
            if (temperaturas[i] > media) {
                System.out.printf("- %s (%.1f°C)\n", dias[i], temperaturas[i]);
            }
        }

        scanner.close();
    }
}
