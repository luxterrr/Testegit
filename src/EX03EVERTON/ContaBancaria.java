package EX03EVERTON;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ContaBancaria {
    private String nome;
    private String agencia;
    private String numeroConta;
    private BigDecimal saldo;
    private String status;

    static ArrayList<ContaBancaria> listaContas = new ArrayList<>();

    public void status(){
        System.out.println("AGENCIA: " + getAgencia());
        System.out.println("CONTA: " + getNumeroConta());
        System.out.println("NOME: " + getNome());
        System.out.println("SALDO: " + getSaldo());
    }

    public ContaBancaria(String nome, String agencia, String numeroConta, BigDecimal saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
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
    public void setSaldo(BigDecimal saldo) { this.saldo = saldo;}

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
