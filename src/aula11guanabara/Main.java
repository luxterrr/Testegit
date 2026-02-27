package aula11guanabara;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //por ser abstrata nao pode ( Pessoa p1 = new Pessoa)
        Visitante v1= new Visitante();
        v1.setNome("LUCAS");
        v1.setIdade(48);
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("JAO");
        a1.setCurso("E.S");
        a1.setMensalidade(BigDecimal.valueOf(421));
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("ANA");
        b1.setMensalidade(BigDecimal.valueOf(941));
        b1.setBolsa(BigDecimal.valueOf(9041));
        b1.pagarMensalide();
    }
}
