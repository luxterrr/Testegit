import java.math.BigDecimal;
import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {
        System.out.println("--ABERTURA DE CONTA--");
        Scanner sc = new Scanner(System.in);
        System.out.print("No AGENCIA: "); int agencia = sc.nextInt();
        System.out.print("No Conta  : "); int conta = sc.nextInt();
        System.out.print("SALDO     : " ); BigDecimal saldo = sc.nextBigDecimal();
        System.out.print("Nome      : "); String nome = sc.next();
        sc.close();


    }
}
