import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroAgencia;
        int numeroConta;
        String nomeCliente;
        Double saldoConta;


        System.out.println("Ola bem vindo a cadastro de clientes");
        System.out.println("Primeiro digite o numero de sua agencia");
        numeroAgencia = scanner.nextLine();
        System.out.println("Digite o numero de sua conta bancaria");
        numeroConta = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite seu nome completo");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo de sua conta");
        saldoConta = scanner.nextDouble();


        System.out.println("Olá "+nomeCliente +", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo " + saldoConta+ " já está" +
                " disponível para saque.");

    }
}