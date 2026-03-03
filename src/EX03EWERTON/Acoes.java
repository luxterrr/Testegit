package EX03EWERTON;

import java.math.BigDecimal;
import java.util.Scanner;

import static EX03EWERTON.ContaBancaria.getInfo;
import static EX03EWERTON.ContaBancaria.listaContas;


public class Acoes {


    public static void abrirConta() {
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

            ContaBancaria.listaContas.add(new ContaBancaria(nome, agencia, numeroConta, saldo, Status.ABERTA));
            System.out.println("CONTA ABERTA");
        }

    public static void fecharConta() {
        if (listaContas.isEmpty()) {
            System.out.println("SEM CONTAS CADASTRADAS");
        }else {
            int i = getInfo();
            ContaBancaria conta = listaContas.get(i);
            if (conta.getSaldo().compareTo(BigDecimal.valueOf(0)) == 0 && conta.getStatus() == Status.ABERTA) {
                Status teste = Status.FECHADA;
                conta.setStatus(teste);
                System.out.println("CONTA FECHADA");
            } else if (conta.getStatus() == Status.FECHADA) {
                System.out.println("CONTA JA ESTA FECHADA");
            } else if (conta.getSaldo().compareTo(BigDecimal.valueOf(0)) != 0) {
                System.out.println("CONTA PRECISA ESTAR ZERADA PARA FECHAR");
            }
        }
    }

    public static void sacar() {
        if (listaContas.isEmpty()) {
            System.out.println("SEM CONTAS CADASTRADAS");
        }else {
            int i = getInfo();
            ContaBancaria conta = listaContas.get(i);
            if (conta.getStatus() == Status.FECHADA) {
                System.out.println("CONTA FECHADA, IMPOSSIVEL REALIZAR UM SAQUE");
            } else {
                Scanner sc = new Scanner(System.in);
                System.out.println("QUANTO DESEJA SACAR: ");
                BigDecimal saque = sc.nextBigDecimal();

                if (saque.compareTo(conta.getSaldo()) > 0) {
                    System.out.println("VALOR DO SAQUE MAIOR QUE O DISPONIVEL NA CONTA");
                } else {
                    BigDecimal novoSaldo = conta.getSaldo().subtract(saque);
                    conta.setSaldo(novoSaldo);
                    System.out.println("SAQUE REALIZADO");
                }
            }
        }
    }

    public static void depositar() {
        if (listaContas.isEmpty()) {
            System.out.println("SEM CONTAS CADASTRADAS");
        }else {
            int i = getInfo();
            ContaBancaria conta = listaContas.get(i);
            if (conta.getStatus() == Status.FECHADA) {
                System.out.println("CONTA FECHADA, IMPOSSIVEL REALIZAR UM DEPOSITO");
            } else {
                Scanner sc = new Scanner(System.in);
                System.out.println("QUANTO DESEJA DEPOSITAR: ");
                BigDecimal deposito = sc.nextBigDecimal();

                BigDecimal novoSaldo = deposito.add(conta.getSaldo());
                conta.setSaldo(novoSaldo);
                System.out.println("DEPOSITO REALIZADO");
            }
        }
    }

    public static void transferir() {
        if (listaContas.isEmpty()) {
            System.out.println("SEM CONTAS CADASTRADAS");
        }else {
            int i1 = getInfo();
            int i2 = getInfo();

            ContaBancaria conta1 = listaContas.get(i1);
            ContaBancaria conta2 = listaContas.get(i2);
            if (conta1.getStatus() == Status.FECHADA || conta2.getStatus() == Status.FECHADA) {
                System.out.println("CONTA(S) FECHADA(S), IMPOSSIVEL REALIZAR UMA TRANSFERENCIA");
            } else {

                Scanner sc = new Scanner(System.in);
                System.out.println("QUANTO DESEJA TRANSFERIR DA 1 CONTA PARA A 2: ");
                BigDecimal transferencia = sc.nextBigDecimal();

                if (transferencia.compareTo(conta1.getSaldo()) > 0) {
                    System.out.println("VALOR DA TRANSFERENCIA MAIOR QUE O DISPONIVEL NA CONTA");
                } else {
                    BigDecimal novoSaldo1 = conta1.getSaldo().subtract(transferencia);
                    conta1.setSaldo(novoSaldo1);
                    BigDecimal novoSaldo2 = conta2.getSaldo().add(transferencia);
                    conta2.setSaldo(novoSaldo2);
                    System.out.println("TRANSFERENCIA REALIZADA");
                }
            }
        }
    }

    public static void listar() {
        if (listaContas.isEmpty()) {
            System.out.println("SEM CONTAS CADASTRADAS");
        } else {
            for (int c = 0; c < listaContas.size(); c++) {
                ContaBancaria conta = listaContas.get(c);

                System.out.println("-------------------");
                System.out.println("AGENCIA: " + conta.getAgencia());
                System.out.println("CONTA: " + conta.getNumeroConta());
                System.out.println("NOME: " + conta.getNome());
                System.out.println("SALDO: " + conta.getSaldo());
                System.out.println("STATUS: " + conta.getStatus());
                System.out.println("-------------------");
            }
        }
    }
}





