package aula10;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Pessoa p1= new Pessoa();
        Aluno p2 = new Aluno();
        Funcionario p3 = new Funcionario();
        Professor p4 = new Professor();

        p1.setNome("LUCAS");
        p2.setNome("ANA");
        p3.setNome("RAUl");
        p4.setNome("JOAO");
        p1.setSexo("HOMEM");

        p2.setCurso("MED");
        p3.setSetor("COMIDA");
        p4.setSalario(BigDecimal.valueOf(100.50));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
