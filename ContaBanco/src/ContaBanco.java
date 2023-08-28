import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


    System.out.println("Digite o seu nome completo");
    String nomeCompleto = scanner.next();

    System.out.println("digite sua agência");
    String numeroAgencia = scanner.next();

    System.out.println("Digite o numero da sua conta");
    String numeroConta = scanner.next();

    float saldo = 237.48;

    System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " " + "e seu saldo" + saldo + " " + "já esta disponivel para saque." );



    }
}
