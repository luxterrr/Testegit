package aula10guanabara;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean emprego;

    public void mudarTrabalho(){
        this.emprego = !this.emprego;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getEmprego() {
        return emprego;
    }

    public void setEmprego(boolean emprego) {
        this.emprego = emprego;
    }
}
