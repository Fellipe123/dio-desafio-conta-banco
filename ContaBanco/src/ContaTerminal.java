package ContaBanco.src;
import java.util.Scanner;

public class ContaTerminal{

    public static void main(String [] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Por favor, digite o número!");
        int numero = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite saldo!");
        Double saldo = Double.parseDouble(scanner.nextLine());

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);

        scanner.close();

    }

} 