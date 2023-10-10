import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Agencia");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite sua Agencia");
        int agencia = scanner.nextInt();
        
        System.out.println("Digite seu Saldo");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Nome do Cliente: " + nome + " " + sobrenome);
        System.out.println("Número da sua Conta: " + numeroConta);
        System.out.println("Sua Agencia" + agencia);
        System.out.println("Seu Saldo: " + saldo);
        
        
    }
}