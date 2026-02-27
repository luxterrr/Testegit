package aula11guanabara;

import java.math.BigDecimal;

public class Aluno extends Pessoa{
    private String curso;
    private BigDecimal mensalidade;

    public void pagarMensalidade(){
        System.out.println("JAPAGAY MENSALIDADE");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public BigDecimal getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(BigDecimal mensalidade) {
        this.mensalidade = mensalidade;
    }
}

