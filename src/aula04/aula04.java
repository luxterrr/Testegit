package aula04;

public class aula04 {
    public static void main (String[] args){
    Caneta c1 = new Caneta("BIC", 0.4F, "AZUL");
    c1.status();

    }
}

class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void status () {
        System.out.println( "SOBRE A CANETA");
        System.out.println( "MODELO" + this.modelo);
        System.out.println( "PONTA" + this.ponta);
        System.out.println( "COR" + this.cor);
        System.out.println( "TAMPADA" + this.tampada);
    }
}