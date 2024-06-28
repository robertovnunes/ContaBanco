import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Digite o número da conta:");
        conta.numero = scanner.nextInt();
        System.out.println("Digite o numero da agencia:");
        conta.agencia = scanner.next();
        System.out.println("Digite o nome do cliente:");
        conta.cliente = scanner.next();
        System.out.println("Digite o saldo da conta:");
        conta.saldo = scanner.nextFloat();

        System.out.println("Olá "+ conta.cliente +", obrigado por criar uma conta em nosso banco, sua agência é "+conta.agencia+", conta "+ conta.numero+" e seu saldo "+conta.saldo+" já está disponível para saque");

        scanner.close();
    }
}
