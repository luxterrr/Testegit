package EX03EWERTON;

import java.math.BigDecimal;
import static EX03EWERTON.ContaBancaria.listaContas;
import static EX03EWERTON.GetDados.getInfo;
import static EX03EWERTON.ScannerAcoes.*;

public class Acoes {

    public static void abrirConta() {
        ContaBancaria novaConta = getAbertura();
        boolean existe = ContaBancaria.listaContas.stream() //verificacao para ver se ha conta existente com mesmos dados
                .anyMatch(contaBancaria -> contaBancaria.getNumeroConta().equals(novaConta.getNumeroConta()));
        if (existe) {
            System.out.println("ERRO NO CADASTRO: CONTA JA EXISTENTE, MUDE O NUMERO DA CONTA OU AGENCIA");
        } else {
            ContaBancaria.listaContas.add(novaConta);
            System.out.println("CONTA ABERTA");
        }
    }

    public static void fecharConta() {
        if (listaContas.isEmpty()) {
            System.out.println("SEM CONTAS CADASTRADAS");
        }else {
            int i = getInfo();
            ContaBancaria conta = listaContas.get(i);
            if (conta.getSaldo().compareTo(BigDecimal.valueOf(0)) == 0 && conta.getStatus() == Status.ABERTA) {
                Status status = Status.FECHADA;
                conta.setStatus(status);
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
                System.out.println("QUANTO DESEJA SACAR: ");
                BigDecimal saque = getSaque();

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
                System.out.println("QUANTO DESEJA DEPOSITAR: ");
                BigDecimal deposito = getDeposito();
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
                System.out.println("QUANTO DESEJA TRANSFERIR DA 1 CONTA PARA A 2: ");
                BigDecimal transferencia = getTransferencia();

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
            for (ContaBancaria conta : listaContas) {
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