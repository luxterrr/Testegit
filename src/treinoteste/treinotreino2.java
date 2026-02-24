package treinoteste;

public class treinotreino2 {

    public static void main(String[] args){
        Carro c1 = new Carro("BMW");
        Carro c2 = new Carro("BORA");

        String result = c1.acelerar();
        c2.acelerar();

        System.out.println(result);
    }

}

class Carro {

    String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public String acelerar() {
        System.out.println("CERELANDO" + this.modelo);;
        return "oi";
    }


}
