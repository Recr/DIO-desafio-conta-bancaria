import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("--------------Java Banking--------------");
        System.out.println("Olá novo usuário! Por favor, informe seus dados para criar uma conta.\n\n");
        System.out.print("Informe seu nome: ");
        nomeCliente = input.nextLine();
        System.out.print("\nInforme o número da agência: ");
        agencia = input.nextLine();
        System.out.print("\nInforme o número da conta: ");
        numero = input.nextInt();
        System.out.print("\nInforme o saldo atual: ");
        saldo = input.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}