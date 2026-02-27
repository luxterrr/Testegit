package aula11guanabara;

import java.math.BigDecimal;

public class Bolsista extends Aluno{
    private BigDecimal bolsa;

    public void renovarBolsa(){
        System.out.println("RENOVANDO BOLSA DE " + this.getNome());
    }

    public void pagarMensalide(){
        System.out.println("Bolsista" + this.getNome() + "JAPAGA");

    }

    public BigDecimal getBolsa() {
        return bolsa;
    }

    public void setBolsa(BigDecimal bolsa) {
        this.bolsa = bolsa;
    }
}
