import jdk.swing.interop.SwingInterOpUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()throws InterruptedException {

    System.out.println("DIGITE UMA NOTA: ");
        Scanner entrada = new Scanner (System.in);
        double notas_alunos = entrada.nextDouble();
        double soma = 0;
        int contador = 0;



    while(notas_alunos >= 0){
        contador++;
        soma += notas_alunos;
        System.out.println("PROXIMA NOTA: " );
        notas_alunos = entrada.nextDouble();

    }

    if (contador > 0){
        System.out.print("ATUALIZANDO. " );
        Thread.sleep(500);
        System.out.print(". "  );
        Thread.sleep(500);
        System.out.println(". " );
        Thread.sleep(500);
        double media = soma / contador;
        System.out.println("RESULTADO: " + media);
    }
    else {

        System.out.print("ERRO.");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);




    }
}





