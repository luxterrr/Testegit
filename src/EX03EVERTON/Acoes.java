package EX03EVERTON;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

import static EX03EVERTON.Banco.getInfo;

public class Acoes  {


    public static void abrirConta(){
        System.out.println("--ABERTURA DE CONTA--");
        Scanner sc = new Scanner(System.in);
        System.out.print("No AGENCIA: "); String agencia = sc.next();
        System.out.print("No Conta  : "); String numeroConta = sc.next();
        System.out.print("SALDO     : " ); BigDecimal saldo = sc.nextBigDecimal();
        System.out.print("Nome      : "); String nome = sc.next();

        ContaBancaria.listaContas.add(new ContaBancaria(nome,agencia, numeroConta, saldo ));
       // acharConta.put(numeroConta,agencia);

        System.out.println("CONTA ABERTA");


        Menu.abrirMenu();
    }

    //@Override
    public static void fecharConta(){
        ContaBancaria.listaContas.remove(getInfo());

        System.out.println("CONTA FECHADA");

        Menu.abrirMenu();
    }

    public static void sacar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("QUANTO DESEJA SACAR: ");
        BigDecimal saque = sc.nextBigDecimal();


    }

   // @Override
    public static void depositar(){
    }

    //@Override
    public static void transferir() {

    }




}
