import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o seu nome");
        String nome = scanner.nextLine();
        System.out.println("Por favor digite o numero da agencia");
        int agencia = scanner.nextInt();
        System.out.println("Por favor digite o numero da conta");
        int conta = scanner.nextInt();
        System.out.println("Por favor digite o valor do deposito");
        double deposito = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, na agencia %s, conta %s e saldo %s",
                nome, agencia, conta, deposito);

    }
}
