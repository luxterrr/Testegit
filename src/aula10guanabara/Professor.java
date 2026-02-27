package aula10guanabara;

import java.math.BigDecimal;

public class Professor extends Pessoa{
    private String especialidade;
    private BigDecimal salario;

    public void aumentoSal(BigDecimal aum){
        salario = salario.add(aum);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
