package EXERCICIO01everton;

import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;

public class EX01 {
    public static void main(String[] args) {
        System.out.print("VALOR A SACAR: R$ ");
        Scanner resposta = new Scanner(System.in);
        BigDecimal valorSaque = resposta.nextBigDecimal();
        resposta.close();

        valorSaque = valorSaque.setScale(2, RoundingMode.HALF_EVEN);

        BigDecimal [] cedulas = {BigDecimal.valueOf(200), BigDecimal.valueOf(100), BigDecimal.valueOf(50), BigDecimal.valueOf(20), BigDecimal.valueOf(10), BigDecimal.valueOf(5), BigDecimal.valueOf(2), BigDecimal.valueOf(1), BigDecimal.valueOf(0.50), BigDecimal.valueOf(0.25), BigDecimal.valueOf(0.10), BigDecimal.valueOf(0.05), BigDecimal.valueOf(0.01)};
        BigDecimal valorTeste = new BigDecimal( "0");
        BigDecimal valorTeste2 = new BigDecimal("200");

        for (int contador = 0; contador < cedulas.length ; contador ++ ) {

            BigDecimal quantidade = valorSaque.divide (cedulas[contador], 0, RoundingMode.DOWN) ;

            if (quantidade.compareTo(valorTeste) > 0) {
                valorSaque = valorSaque.subtract(quantidade.multiply(cedulas[contador]));
                if (cedulas[contador].compareTo(valorTeste2) < 0 ) {
                    System.out.println("CEDULAS DE " + cedulas[contador] + ": " + quantidade);
                } else {
                    System.out.println("MOEDAS DE " + cedulas[contador]  + ": " + quantidade);
                }

            }

        }
        System.out.println("GG");


    }
}
