package exercicio2everton;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class parte2 {
    public static void main(String[] args) {
        System.out.print("VALOR A SACAR: R$ ");
        Scanner resposta = new Scanner(System.in);
        BigDecimal valorSaque = resposta.nextBigDecimal();
        resposta.close();
        BigDecimal valor0 = new BigDecimal( "0");
        BigDecimal valor200 = new BigDecimal("200");
        valorSaque = valorSaque.setScale(2, RoundingMode.HALF_EVEN);

        if (valorSaque.compareTo(valor0) <= 0) {
            System.out.println("ERRO, O VALOR DO SAQUE DEVE SER MAIOR QUE 0");
            System.exit(0);
        }

            BigDecimal valorDisponivel = new BigDecimal("0");
            BigDecimal[] disponivel = {BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1)};

            BigDecimal[] cedulas = {BigDecimal.valueOf(200), BigDecimal.valueOf(100), BigDecimal.valueOf(50), BigDecimal.valueOf(20), BigDecimal.valueOf(10), BigDecimal.valueOf(5), BigDecimal.valueOf(2), BigDecimal.valueOf(1), BigDecimal.valueOf(0.50), BigDecimal.valueOf(0.25), BigDecimal.valueOf(0.10), BigDecimal.valueOf(0.05), BigDecimal.valueOf(0.01)};

            for (int contador = 0; contador < cedulas.length; contador ++){
                valorDisponivel = valorDisponivel.add(cedulas[contador].multiply(disponivel[contador]));
            }
            if (valorSaque.compareTo(valorDisponivel)>0){
                System.out.println("ERRO, VALOR DO SAQUE MAIOR QUE VALOR DISPONIVEL");
                System.exit(0);
            }

            for (int contador = 0; contador < cedulas.length ; contador++) {
                if (disponivel[contador].compareTo(valor0)==0){
                    continue;
                }
                BigDecimal quantidade = valorSaque.divide(cedulas[contador], 0, RoundingMode.DOWN);
                if (quantidade.compareTo(valor0)>0) {
                    if (quantidade.compareTo(disponivel[contador])>0) {
                        quantidade = quantidade.subtract( quantidade.subtract(disponivel[contador]));
                    }
                    valorSaque = valorSaque.subtract(quantidade.multiply(cedulas[contador]));
                    if (cedulas[contador].compareTo(valor200)>=0) {
                        System.out.println("CEDULAS DE " + cedulas[contador]  + ": " + quantidade);
                    } else {
                        System.out.println("MOEDAS DE " + cedulas[contador]  + ": " + quantidade);
                    }

                }

            }
            System.out.println("GG");


    }
}
