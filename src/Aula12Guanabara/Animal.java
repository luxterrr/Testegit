package Aula12Guanabara;

import java.math.BigDecimal;

public abstract class Animal {
    protected BigDecimal peso;
    protected int idade;
    protected int membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void som();

    public BigDecimal getPeso() {return peso;}

    public void setPeso(BigDecimal peso) {this.peso = peso;}

    public int getIdade() {return idade;}

    public void setIdade(int idade) {this.idade = idade;}

    public int getMembros() {return membros;}

    public void setMembros(int membros) {this.membros = membros;}

    @Override
    public String toString() {
        return "Animal{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }
}
