package Aula07;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Luta{
    private Lutador desafiante;
    private Lutador desafiado;
    private boolean aprovada;
    private int rounds;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1!=l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else {
            this.aprovada = false;
            this.desafiado =null;
            this.desafiante= null;
        }
    }

    public void lutar(){
        if (this.aprovada = true ){
            this.desafiante.apresentar();
            this.desafiado.apresentar();
            int vencedor = ThreadLocalRandom.current().nextInt(1, 4);
            switch (vencedor){
                case 1 :
                    System.out.println("EMPATOU");
                    desafiado.empatarluta();
                    desafiante.empatarluta();
                    break;
                case 2:
                    System.out.println("DESAFIANTE" + this.desafiante + "WINS");
                    desafiante.ganharluta();
                    desafiado.perderluta();
                    break;
                case 3 :
                    System.out.println("DESAFIADO" + this.desafiado + "WINS");
                    desafiante.perderluta();
                    desafiado.ganharluta();
                    break;
            }
        } else {
            System.out.println("LUTA INVALIDA");

        }
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
}
