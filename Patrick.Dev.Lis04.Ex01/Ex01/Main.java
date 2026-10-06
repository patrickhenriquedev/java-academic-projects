import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor insira um número: ");
        int numero = input.nextInt();

        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + resultado);

        input.close();

    }
}