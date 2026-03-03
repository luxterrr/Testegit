package EX03EWERTON;

import java.math.BigDecimal;
import java.util.*;

public class ContaBancaria {
    private String nome;
    private String agencia;
    private String numeroConta;
    private BigDecimal saldo ;
    private Status status;

    static ArrayList<ContaBancaria> listaContas = new ArrayList<>();

    public ContaBancaria(String nome, String agencia, String numeroConta, BigDecimal saldo) {

        this.nome = nome;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.status = Status.ABERTA;
    }

    public String getNome() {
        return nome;
    }
    public String getAgencia() {
        return agencia;
    }
    public String getNumeroConta() {return numeroConta;}
    public BigDecimal getSaldo() {
        return saldo;
    }
    public  void setSaldo(BigDecimal saldo) { this.saldo = saldo;}
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}

