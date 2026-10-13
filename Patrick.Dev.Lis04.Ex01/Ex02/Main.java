import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// Record para modelar os dados do habitante de forma imutável
record Habitante(double salario, int filhos) {}

public class Main {

    public static void main(String[] args) {
        // Configura o scanner para aceitar pontos em números decimais (ex: 1412.00)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        List<Habitante> populacao = new ArrayList<>();
        final double SALARIO_MINIMO = 1412.00;

        // 1. Coleta de dados
        while (true) {
            System.out.print("Digite o salário do habitante: R$ ");
            double salario = scanner.nextDouble();

            System.out.print("Digite o número de filhos: ");
            int filhos = scanner.nextInt();

            populacao.add(new Habitante(salario, filhos));

            System.out.print("Deseja continuar? (S/N): ");
            if (scanner.next().trim().equalsIgnoreCase("N")) {
                break;
            }
        }

        // 2. Processamento dos dados com Streams API
        if (!populacao.isEmpty()) {
            double mediaSalario = populacao.stream()
                    .mapToDouble(Habitante::salario)
                    .average()
                    .orElse(0.0);

            double mediaFilhos = populacao.stream()
                    .mapToInt(Habitante::filhos)
                    .average()
                    .orElse(0.0);

            double maiorSalario = populacao.stream()
                    .mapToDouble(Habitante::salario)
                    .max()
                    .orElse(0.0);

            long totalAte1SM = populacao.stream()
                    .filter(h -> h.salario() <= SALARIO_MINIMO)
                    .count();

            double percAte1SM = ((double) totalAte1SM / populacao.size()) * 100;

            // 3. Exibição dos resultados
            System.out.println("\n--- Resultados da Pesquisa ---");
            System.out.printf("a) Média do salário da população: R$ %.2f%n", mediaSalario);
            System.out.printf("b) Média do número de filhos: %.2f%n", mediaFilhos);
            System.out.printf("c) Maior salário encontrado: R$ %.2f%n", maiorSalario);
            System.out.printf("d) Percentual com salário de até 1 salário mínimo: %.2f%%%n", percAte1SM);
        } else {
            System.out.println("Nenhum dado foi registrado.");
        }

        scanner.close();
    }
}


