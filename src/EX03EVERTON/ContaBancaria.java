package EX03EVERTON;

import java.math.BigDecimal;
import java.util.*;

public class ContaBancaria {
    private String nome;
    private String agencia;
    private String numeroConta;
    private BigDecimal saldo ;
    private boolean status;

    static ArrayList<ContaBancaria> listaContas = new ArrayList<ContaBancaria>();

    public ContaBancaria(String nome, String agencia, String numeroConta, BigDecimal saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.status =true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {this.nome = nome;}

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {return numeroConta;}
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
    public  void setSaldo(BigDecimal saldo) { this.saldo = saldo;}

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public static int getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMERO DA CONTA: ");
        String getConta = sc.next();
        System.out.print("NUMERO DA AGENCIA: ");
        String getAgencia = sc.next();

        Optional<ContaBancaria> conta = Optional.ofNullable(ContaBancaria.listaContas.stream()
                .filter(contaBancaria -> Objects.equals(contaBancaria.getAgencia(), getAgencia) && Objects.equals(contaBancaria.getNumeroConta(), getConta))
                .findFirst().orElse(null));
        if (conta.isPresent()) {
            System.out.println("CONTA ENCONTRADA");
            return ContaBancaria.listaContas.indexOf(conta.get());

        } else {
            System.out.println("CONTA INEXISTENTE");
            return -1;
        }
    }
    public static int getTransfer() {
        System.out.println("DIGITE AS INFORMACOES DA 1 CONTA");
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMERO DA CONTA: ");
        String getConta = sc.next();
        System.out.print("NUMERO DA AGENCIA: ");
        String getAgencia = sc.next();

        Optional<ContaBancaria> conta = Optional.ofNullable(ContaBancaria.listaContas.stream()
                .filter(contaBancaria -> Objects.equals(contaBancaria.getAgencia(), getAgencia) && Objects.equals(contaBancaria.getNumeroConta(), getConta))
                .findFirst().orElse(null));
        if (conta.isPresent()) {
            System.out.println("CONTA ENCONTRADA");
            return ContaBancaria.listaContas.indexOf(conta.get());

        } else {
            System.out.println("CONTA INEXISTENTE");
            return -1;
        }


    }
}
