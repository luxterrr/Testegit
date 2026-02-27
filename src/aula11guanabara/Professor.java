package aula11guanabara;

import java.math.BigDecimal;

public class Professor extends Pessoa{
    private String area;
    private BigDecimal salario;

    public void dupSalario(){
        this.salario= this.getSalario().multiply(BigDecimal.valueOf(2));
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
