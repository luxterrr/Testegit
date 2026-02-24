package treinoteste;

import java.util.ArrayList;

public class TREINTREINO3 {

    public static void main (String[] args){
        Sala s1 = new Sala();
        s1.aluno = "lucas";
        s1.idade = 17;
        int contador = 0;
        String[] nomes = new String[5];

        nomes[contador] = s1.aluno;
        contador ++ ;


        Sala s2 = new Sala();
        s2.aluno = "ana";
        s2.idade = 15;

        nomes[contador] = s2.aluno;
        contador ++ ;

        s1.sair();
        s2.sair();

        for (int c = 0; c < nomes.length; c ++){
            System.out.println(nomes[c]);
        }

    }

}

class Sala {

    String aluno;
    int idade;

    public Sala(){
        this.aluno = aluno;
        this.idade = idade;
    }

    public void sair() {
        System.out.println( this.aluno + this.idade + "saiu");
//usar lista array e ir adicionando nome dos alunos em cima

    }
}
