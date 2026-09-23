//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int verificadordoacoes = 0;
    double valortotaldoacoes = 0;
    int verificadordoacoes3 = 1;
    double maiorvalordoado = 0;
    int doacoes = 0;
    double menorvalordoado = 0;

    do {
        System.out.print("Informe a quantidade total de doações recebidas: ");
        doacoes = input.nextInt();

        if (doacoes <= 0) {
            System.out.println("Digite uma quantidade válida.");
        }
    }
    while (doacoes <= 0);

    for (int verificadordoacoes2 = 0; verificadordoacoes != doacoes; verificadordoacoes++) {
        System.out.print("Informe o valor da doação " + verificadordoacoes3 + ":R$");
        double valordoacoes = input.nextDouble();
        while (valordoacoes <= 0) {
            System.out.println("Digite um valor de doação válido.");
            System.out.print("Informe o valor da doação " + verificadordoacoes3 + ":R$");
            valordoacoes = input.nextDouble();
        }

        valortotaldoacoes += valordoacoes;
        verificadordoacoes3++;



        if (menorvalordoado == 0) {
            menorvalordoado = valordoacoes;
        }


        if (valordoacoes > maiorvalordoado) {
            maiorvalordoado = valordoacoes;
        } else if (valordoacoes < menorvalordoado) {
            menorvalordoado = valordoacoes;


        }


    }
    System.out.println("Valor total arrecadado: R$" + valortotaldoacoes);
    System.out.println("Maior valor doado: R$" + maiorvalordoado);
    System.out.println("Menor valor doado: R$" + menorvalordoado);


}


