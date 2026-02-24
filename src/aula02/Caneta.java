package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo:" + this.modelo);
        System.out.println( "ponta" + this.ponta);
        System.out.println( "carga " + this.carga);
        System.out.println("Esta tampada?" + this.tampada);

    }

    void rabiscar () {
        if (this.tampada) {
            System.out.println("ERRO!");
        } else {
            System.out.println("RABISCANDO...");
        }
    }

    void tampar () {
        this.tampada = true;
    }

    void destampar () {
        this.tampada = false;

    }



}




