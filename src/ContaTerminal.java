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

        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia).concat(", conta ".concat(String.valueOf(numero)).concat(" e seu saldo ".concat(String.valueOf(saldo)).concat(" já está disponível para saque")))));
        
        scanner.close();

    }

} 