package Aula12Guanabara;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {System.out.println("RASTEJANDO");}

    @Override
    public void alimentar() {System.out.println("COMENDO VEGETAL");}

    @Override
    public void som() {System.out.println("SOM REPTIL");}

    public String getCorEscama() {return corEscama;}

    public void setCorEscama(String corEscama) {this.corEscama = corEscama;}
}
