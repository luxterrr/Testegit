package EX03EVERTON;

import java.math.BigDecimal;
import java.util.Scanner;

import static EX03EVERTON.ContaBancaria.getInfo;
import static EX03EVERTON.ContaBancaria.listaContas;


public class Acoes  {


    public static void abrirConta(){
        System.out.println("--ABERTURA DE CONTA--");
        Scanner sc = new Scanner(System.in);
        System.out.print("No AGENCIA: "); String agencia = sc.next();
        System.out.print("No Conta  : "); String numeroConta = sc.next();
        System.out.print("SALDO     : " ); BigDecimal saldo = sc.nextBigDecimal();
        System.out.print("Nome      : "); String nome = sc.next();

        ContaBancaria.listaContas.add(new ContaBancaria(nome,agencia, numeroConta, saldo ));
        System.out.println("CONTA ABERTA");
        Menu.abrirMenu();
    }

    //@Override
    public static void fecharConta(){
        int i = getInfo();
        ContaBancaria conta = listaContas.get(i);
        if (conta.getSaldo().compareTo(BigDecimal.valueOf(0)) == 0 ){
            listaContas.remove(i);
            System.out.println("CONTA FECHADA");
        }else{
            System.out.println("A CONTA TEM SALDO, PARA REMOVER NECESSARIO ZERAR");
        }

        Menu.abrirMenu();
    }

    public static void sacar(){

        int i = getInfo();
        ContaBancaria conta = listaContas.get(i);

        Scanner sc = new Scanner(System.in);
        System.out.println("QUANTO DESEJA SACAR: ");
        BigDecimal saque = sc.nextBigDecimal();

        if (saque.compareTo(conta.getSaldo()) > 0){
            System.out.println("VALOR DO SAQUE MAIOR QUE O DISPONIVEL NA CONTA");
        }else {
            BigDecimal novoSaldo = conta.getSaldo().subtract(saque);
            conta.setSaldo(novoSaldo);
            System.out.println("SAQUE REALIZADO");
        }
        Menu.abrirMenu();
    }

   // @Override
    public static void depositar(){
        int i = getInfo();
        ContaBancaria conta = listaContas.get(i);

        Scanner sc = new Scanner(System.in);
        System.out.println("QUANTO DESEJA DEPOSITAR: ");
        BigDecimal deposito = sc.nextBigDecimal();

        BigDecimal novoSaldo = deposito.add(conta.getSaldo());
        conta.setSaldo(novoSaldo);
        System.out.println("DEPOSITO REALIZADO");
        Menu.abrirMenu();

    }

    //@Override
    public static void transferir() {
        int i = getInfo();
        int i2 = getInfo();

        ContaBancaria conta = listaContas.get(i);
        ContaBancaria conta2 = listaContas.get(i2);

        Scanner sc = new Scanner(System.in);
        System.out.println("QUANTO DESEJA TRANSFERIR DA 1 CONTA PARA A 2: ");
        BigDecimal transferencia = sc.nextBigDecimal();

        if (transferencia.compareTo(conta.getSaldo()) > 0){
            System.out.println("VALOR DA TRANSFERENCIA MAIOR QUE O DISPONIVEL NA CONTA");
        }else {
            BigDecimal novoSaldo = conta.getSaldo().subtract(transferencia);
            conta.setSaldo(novoSaldo);
            BigDecimal novoSaldo2 = conta2.getSaldo().add(transferencia);
            conta2.setSaldo(novoSaldo2);
            System.out.println("TRANSFERENCIA REALIZADA");
        }
    }
    public static void listar(){
        if (listaContas.size()==0) {
            System.out.println("SEM CONTAS CADASTRADAS");
        }else {
            for (int c = 0; c < listaContas.size(); c++ ) {
                ContaBancaria conta = listaContas.get(c);

                System.out.println("-------------------");
                System.out.println("AGENCIA: " + conta.getAgencia());
                System.out.println("CONTA: " + conta.getNumeroConta());
                System.out.println("NOME: " + conta.getNome());
                System.out.println("SALDO: " + conta.getSaldo());
                System.out.println("-------------------");
            }
        }
        Menu.abrirMenu();
    }




}
