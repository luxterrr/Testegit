package EX03EVERTON;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class Menus {

    static public void abrirMenu (){

        Scanner sc = new Scanner(System.in);
        System.out.println("---MENU---");
        System.out.println("[1]ABRIR        [2]FECHAR       [3]TRANSFERENCIA");
        System.out.println("[4]SACAR        [5]DEPOSITAR    [0]SAIR");
        Scanner opc = new Scanner(System.in);
        System.out.println("DIGITE A ACAO DESEJADA: ");
        int opcao = opc.nextInt();

        switch (opcao){
            case 0: System.exit(0);
            case 1: abrirConta();
            case 2: fecharConta();
            case 3:



        }
    }

    static public void abrirConta (){
        System.out.println("--ABERTURA DE CONTA--");
        Scanner sc = new Scanner(System.in);
        System.out.print("No AGENCIA: "); String agencia = sc.next();
        System.out.print("No Conta  : "); String numeroConta = sc.next();
        System.out.print("SALDO     : " ); BigDecimal saldo = sc.nextBigDecimal();
        System.out.print("Nome      : "); String nome = sc.next();
        sc.close();

        ContaBancaria.listaContas.add(new ContaBancaria(nome,agencia, numeroConta, saldo ));


        System.out.println("CONTA ABERTA");
    }

    static public void fecharConta(){
        ContaBancaria.listaContas.remove(getInfo());

        System.out.println("CONTA FECHADA");
    }

    public void sacar(){

    }

    public void depositar(){
    }


    static public ContaBancaria getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMERO DA CONTA:");
        String getConta = sc.next();
        System.out.print("NUMERO DA AGENCIA");
        String getAgencia = sc.next();
        sc.close();      //
        ContaBancaria conta = ContaBancaria.listaContas.stream()
                .filter(contaBancaria -> Objects.equals(contaBancaria.getAgencia(), getAgencia) && Objects.equals(contaBancaria.getNumeroConta(), getConta))
                .findFirst().orElse(null);
        if (conta != null){
            System.out.println("CONTA ENCONTRADA");
        }else {
            System.out.println("CONTA INEXISTENTE");

        }


        return conta;
    }
}
