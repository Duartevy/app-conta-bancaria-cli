import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        
        // Criação do Scanner para entrada de dados via terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação de dados para o usuário
        System.out.println("Por favor, digite o número da Conta");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do enter


        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número do saldo");
        double saldo = scanner.nextDouble();

        Locale brasil = Locale.of("pt", "BR");
        NumberFormat formatoMoeda  = NumberFormat.getCurrencyInstance(brasil);
        String saldoFormatado = formatoMoeda.format(saldo); 

        // TODO: Exibir a mensagem conta criada 
        System.out.println(" Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " + 
                            "sua agência é " + agencia + ", conta " + numero + 
                            " e seu saldo " + saldoFormatado + 
                            " já está disponível para saque.");

        scanner.close();
    }
}
