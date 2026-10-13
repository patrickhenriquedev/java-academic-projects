import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] pesos = new double[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o peso da caixa " + (i + 1) + " (kg): ");
            pesos[i] = scanner.nextDouble();
        }

        System.out.print("\nDigite o peso de referência para pesquisa (kg): ");
        double referencia = scanner.nextDouble();

        int contador = 0;
        for (int i = 0; i < 6; i++) {
            if (pesos[i] == referencia) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.printf("\nO peso %.2f kg foi encontrado %d vez(es).\n", referencia, contador);
        } else {
            System.out.println("\nValor não localizado na amostragem");
        }

        scanner.close();
    }
}
