package EX03EWERTON;

import java.math.BigDecimal;
import java.util.Scanner;

public class ScannerAcoes {

    public static BigDecimal getDeposito() {
        Scanner sc = new Scanner(System.in);
        BigDecimal deposito = sc.nextBigDecimal();
        return deposito;
    }

    public static BigDecimal getSaque() {
        Scanner sc = new Scanner(System.in);
        BigDecimal saque = sc.nextBigDecimal();
        return saque;
    }

    public static BigDecimal getTransferencia() {
        Scanner sc = new Scanner(System.in);
        BigDecimal transferencia = sc.nextBigDecimal();
        return transferencia;
    }

    public static ContaBancaria getAbertura() {
        System.out.println("--ABERTURA DE CONTA--");
        Scanner sc = new Scanner(System.in);
        System.out.print("No AGENCIA: ");
        String agencia = sc.next();
        System.out.print("No Conta  : ");
        String numeroConta = sc.next();
        System.out.print("SALDO     : ");
        BigDecimal saldo = sc.nextBigDecimal();
        System.out.print("Nome      : ");
        String nome = sc.next();

        ContaBancaria novaConta = new ContaBancaria(nome, agencia, numeroConta, saldo);
        return novaConta;
    }
}
