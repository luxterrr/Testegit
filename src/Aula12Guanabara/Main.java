package Aula12Guanabara;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*
        Mamifero leao = new Mamifero();
        Reptil cobra = new Reptil();
        Peixe salmao = new Peixe();
        Ave passaro = new Ave();
        Canguru c = new Canguru();

        leao.setCorPelo("AMARELO");
        leao.setPeso(BigDecimal.valueOf(10));
        leao.locomover();
        leao.toString();

        c.locomover();*/
        Cachorro toddy = new Cachorro();
        toddy.reagir("oi");
        toddy.reagir("BICHOFEI");
        toddy.reagir(12,01);
        toddy.reagir(10,00);
        toddy.reagir(true);
        toddy.reagir(false);
        toddy.som();

    }
}
