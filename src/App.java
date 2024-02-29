import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nomeCliente = "Murilo Fischer";
        String tipoConta = "Corrente";
        double saldo = 1000.00;

        System.out.println("Dados Iniciais do Cliente:");
        System.out.println("Bem vindo: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo Inicial: R$" + saldo);

        System.out.println("Operações:");

        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");

        double valorReceber = 0;
        double valorTransferir = 0;

        int tipoOperacao = 0;

        while (tipoOperacao != 4) {

            tipoOperacao = sc.nextInt();

            switch (tipoOperacao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$" + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor que vai receber");
                    valorReceber = sc.nextDouble();

                    if (valorReceber < 0) {
                        System.out.println("Digite um valor válido!");
                    } else {
                        saldo += valorReceber;
                        System.out.println("Novo saldo: R$" + saldo);
                    }

                    break;

                case 3:
                    System.out.println("Digite o valor que vai transferir");
                    valorTransferir = sc.nextDouble();

                    if (valorTransferir > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else if (valorTransferir < 0) {
                        System.out.println("Digite um valor válido");
                    } else {
                        saldo -= valorTransferir;
                        System.out.println("Novo saldo: R$" + saldo);
                    }

                default:
                    break;
            }
        }

        sc.close();

    }
}
