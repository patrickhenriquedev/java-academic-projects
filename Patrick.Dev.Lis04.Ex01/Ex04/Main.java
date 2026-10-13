import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dias = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};
        double[] faturamento = new double[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o faturamento de " + dias[i] + " (R$): ");
            faturamento[i] = scanner.nextDouble();
            total += faturamento[i];
        }

        double media = total / 5;
        System.out.printf("\nFaturamento total: R$ %.2f\n", total);
        System.out.printf("Média diária: R$ %.2f\n\n", media);

        for (int i = 0; i < 5; i++) {
            if (faturamento[i] < media) {
                System.out.printf("%s ficou abaixo da média com R$ %.2f\n", dias[i], faturamento[i]);
            }
        }

        scanner.close();
    }
}
