package aual06;

public class CONTROLEREMOTO {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.abrirMenu();

    }
}

interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void volumeMais();
    public abstract void volumeMenos();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}

class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.tocando = false;
        this.ligado = false;
        this.volume = 50;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando (boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("ESTA LIGADO? " + this.getLigado());
        System.out.println("ESTA TOCANDO? " + this.getTocando());
        System.out.print("VOLUME: " + this.getVolume());

        for ( int contador = 0; contador < this.getVolume(); contador += 10 ) {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("FECHANDO MENU...");
    }

    @Override
    public void volumeMais() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()+1);
        }
    }

    @Override
    public void volumeMenos() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void ligarMudo() {
        if ( this.getLigado() && this.getVolume() > 0 ) {
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if ( this.getLigado() &&  this.getVolume () == 0  ) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (! this.getTocando() && this.getLigado() ) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando() ) {
            this.setTocando(false);
        }
    }
}
