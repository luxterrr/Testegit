package EXERCICIO01ewerton;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ScannerValor {

    public static BigDecimal scanearValor() {
        System.out.print("VALOR A SACAR: R$ ");
        Scanner resposta = new Scanner(System.in);
        BigDecimal valorSaque = resposta.nextBigDecimal();
        resposta.close();
        return valorSaque.setScale(2, RoundingMode.HALF_EVEN);
    }
}
