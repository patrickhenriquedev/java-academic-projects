//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Insira um numero inteiro qualquer: ");
        Scanner input = new Scanner (System.in);
        int numero = input.nextInt();
        int resultado;

    System.out.println("TABUADA RELACIONADA: ");
        for (int i = 1; i <= 10; i++){

            resultado = numero * i;
            System.out.println ( resultado);

        }

}
