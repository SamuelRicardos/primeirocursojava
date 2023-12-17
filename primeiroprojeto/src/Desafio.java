import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String nome;
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        int opcao;
        double valor;
        double novoValor;

        System.out.println("Digite o seu nome:");
        nome = leitura.nextLine();
        System.out.println("Olá," + nome + ",você possui uma conta " + tipoConta);

        System.out.println("Escolha uma das opções abaixo:");

        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");

        System.out.println("Digite o número da opção desejada: ");
        opcao = leitura.nextInt();
        System.out.println(opcao);

        if (opcao == 1) {
            System.out.println( "O seu saldo é: " + saldoInicial);
        } else if ( opcao == 2) {
            System.out.println("Informe o valor que você quer receber:");
            valor = leitura.nextDouble();
            novoValor = saldoInicial + valor;
            System.out.println("O valor do seu saldo aumentou para" + novoValor);
        } else if ( opcao == 3) {
            System.out.println("Informe o valor que você quer enviar");
            valor = leitura.nextDouble();
            novoValor = saldoInicial - valor;

            if (novoValor > -1) {
                System.out.println("Transferência realizada");
            } else {
                System.out.println("Não há saldo suficiente para fazer essa transferência");
            }

        }
        else if (opcao == 4) {
            System.out.println("Você encerrou a sua sessão");
        }

        if ( opcao > 4 || opcao <= 0) {
            System.out.println("Opção inválida, tente novamente");

        }

    }
}