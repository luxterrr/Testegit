package exercicio2ewerton;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ScannerValor {

    public static BigDecimal scanear() {
        System.out.print("VALOR A SACAR: R$ ");
        java.util.Scanner resposta = new java.util.Scanner(System.in);
        BigDecimal valorSaque = resposta.nextBigDecimal();
        resposta.close();
        return valorSaque.setScale(2, RoundingMode.HALF_EVEN);
    }
}
