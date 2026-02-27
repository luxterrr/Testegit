package Aula12Guanabara;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {System.out.println("VOANDO");}

    @Override
    public void alimentar() {System.out.println("COMENDO FOLHA");}

    @Override
    public void som() {System.out.println("SOM DE AVE");}

    public String getCorPena() {return corPena;}

    public void setCorPena(String corPena) {this.corPena = corPena;}
}
