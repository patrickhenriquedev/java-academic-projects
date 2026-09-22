//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Scanner input = new Scanner (System.in);
        String senha_digitada = "0";
       int tentativas = 0;
       String senha_correta = "1106";

    System.out.println("Insira uma senha de quatro dígitos: ");
    senha_digitada = input.nextLine();
    tentativas++;

    while (!senha_digitada.equals(senha_correta)){
        System.out.println("Senha Incorreta! Tente Novamente. ");
        System.out.println("Digite a senha correta: ");
        senha_digitada = input.nextLine();
        tentativas++;
    }
    System.out.println("ACESSO AUTORIZADO!!!");
    System.out.println("Total de tentativas: " + tentativas);

}
