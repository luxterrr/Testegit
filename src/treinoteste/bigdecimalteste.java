package treinoteste;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class bigdecimalteste {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.3");
        BigDecimal b = new BigDecimal( "16.3");

        System.out.println(b.divide(a,2, RoundingMode.UP)) ;

        System.out.print("VALOR A SACAR: R$ ");
        Scanner resposta = new Scanner(System.in);
        BigDecimal valor = resposta.nextBigDecimal();
        resposta.close();

        BigDecimal valorSaque = valor.setScale(2,RoundingMode.HALF_EVEN);



        System.out.println(valorSaque);
    }
}
