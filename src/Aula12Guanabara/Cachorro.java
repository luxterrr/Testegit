package Aula12Guanabara;

import java.math.BigDecimal;

public class Cachorro extends Mamifero {

    @Override
    public void som(){
        System.out.println("AUAUAUAUAAUAU");
    }

    public void reagir (String frase){
        if (frase.equals("toma comida")|| frase.equals("oi")){
            System.out.println("ABANANDO E LATINDO");
        }else {
            System.out.println("ROSNANDO");
        }
    }

    public void reagir (int hora, int min){
        if (hora < 12){
            System.out.println("ABANANDO");
        } else if (hora >=18) {
            System.out.println("IGNORA");
        }else{
            System.out.println("ABANANDO E LATINDO");
        }
    }

    public void reagir (boolean dono){
        if (dono == true){
            System.out.println("ABANANDO");
        }else {
            System.out.println("ROSNANDO e latindo");
        }

    }

    public void reagir (int idade, BigDecimal peso){
        if (idade < 5){
            if (peso.compareTo(BigDecimal.valueOf(10)) <0 ){
                System.out.println("ABANANDO");
            }else{
                System.out.println("LATINDO");
            }
        }else {
            if (peso.compareTo(BigDecimal.valueOf(10)) <0 ){
                System.out.println("ROSNANDO");
            }else {
                System.out.println("IGNORANDO");
            }
        }
    }
}
