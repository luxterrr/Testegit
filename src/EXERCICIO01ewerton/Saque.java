package EXERCICIO01ewerton;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Saque {

    BigDecimal [] cedulas = {BigDecimal.valueOf(200),
            BigDecimal.valueOf(100),
            BigDecimal.valueOf(50),
            BigDecimal.valueOf(20),
            BigDecimal.valueOf(10),
            BigDecimal.valueOf(5),
            BigDecimal.valueOf(2),
            BigDecimal.valueOf(1),
            BigDecimal.valueOf(0.50),
            BigDecimal.valueOf(0.25),
            BigDecimal.valueOf(0.10),
            BigDecimal.valueOf(0.05),
            BigDecimal.valueOf(0.01)};

    public void sacar() {
        BigDecimal valorSaque = ScannerValor.scanearValor();
        calcularCedulas(valorSaque);
    }

    private void calcularCedulas(BigDecimal valorSaque) {
        for (int contador = 0; contador < cedulas.length ; contador ++ ) {
            BigDecimal quantidade = valorSaque.divide (cedulas[contador],
                    0, RoundingMode.DOWN) ;

            if (quantidade.compareTo(BigDecimal.valueOf(0)) > 0) {
                valorSaque = valorSaque.subtract(quantidade.multiply(cedulas[contador]));
                if (cedulas[contador].compareTo(BigDecimal.valueOf(200)) < 0 ) {
                    System.out.println("CEDULAS DE " + cedulas[contador] + ": " + quantidade);
                } else {
                    System.out.println("MOEDAS DE " + cedulas[contador]  + ": " + quantidade);
                }
            }
        }
    }
}
