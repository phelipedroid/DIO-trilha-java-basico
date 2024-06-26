import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
        //Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta bancária: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso DIO BANK, sua agência é %s, seu número de conta é %d e seu saldo é de %.2f e já está disponível para saque.",
                nomeCliente, agencia, numeroConta, saldo);
        //Exibir as mensagens para o usuário
        System.out.println(mensagem);
        scanner.close();
    }
}
