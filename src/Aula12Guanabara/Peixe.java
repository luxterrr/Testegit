package Aula12Guanabara;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {System.out.println("NADANDO");}

    @Override
    public void alimentar() {System.out.println("COMENDO Alga");}

    @Override
    public void som() {System.out.println("SOM DE PEIXE");}

    public String getCorEscama() {return corEscama;}

    public void setCorEscama(String corEscama) {this.corEscama = corEscama;}
}
