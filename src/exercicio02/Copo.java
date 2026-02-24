package exercicio02;

public class Copo {
    String modelo ;
    String cor ;
    float volume;
    boolean vazia;

    void statusc ( ) {
        System.out.println( "copo" + this.modelo );
        System.out.println( "cor" + this.cor );
        System.out.println( "Volume" + this.volume );
        System.out.println( "esta vazia " + this.vazia );

    }

    void tomar ( ) {
        if (this.vazia) {
            System.out.println("ERRO");
        } else {
            System.out.println("TOMANDO");
        }
    }

    void encher ( ) {
        this.vazia = false;
    }

    void esvaziar( ) {
        this.vazia = true;
    }

}
