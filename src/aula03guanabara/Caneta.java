package aula03guanabara;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo:" + this.modelo);
        System.out.println( "ponta" + this.ponta);
        System.out.println( "carga " + this.carga);
        System.out.println("Esta tampada?" + this.tampada);

    }

    public void rabiscar () {
        if (this.tampada) {
            System.out.println("ERRO!");
        } else {
            System.out.println("RABISCANDO...");
        }
    }

    protected void tampar () {
        this.tampada = true;
    }

    protected void destampar () {
        this.tampada = false;

    }



}