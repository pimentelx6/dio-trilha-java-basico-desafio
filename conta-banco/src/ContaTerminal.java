import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String primeiroNomeCliente = scanner.nextLine();

        System.out.print("Digite seu segundo nome: ");
        String segundoNomeCliente = scanner.nextLine();

        String nomeCompleto = primeiroNomeCliente.concat(" ").concat(segundoNomeCliente);

        System.out.println("Seu nome completo é ".concat(nomeCompleto));
        
        System.out.print("Digite o Código da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o valor do saldo: ");
        double saldo = scanner.nextDouble();
        //scanner.nextLine();
        
        //scanner.close();

        System.out.println("Olá ".concat(nomeCompleto).concat(", obrigado por criar uma conta em nosso banco. Sua agência é ") + agencia + ", conta "+ conta + " e seu saldo é "+ saldo + (", já está disponível para saque"));        
    }
}