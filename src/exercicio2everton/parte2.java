package exercicio2everton;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class parte2 {
    public static void main(String[] args) {
        System.out.print("VALOR A SACAR: R$ ");

        Scanner resposta = new Scanner(System.in);
        BigDecimal valorSaque = resposta.nextBigDecimal();
        resposta.close();

        valorSaque = valorSaque.setScale(2, RoundingMode.HALF_EVEN);

        if (valorSaque.compareTo(BigDecimal.valueOf(0)) <= 0) {
            System.out.println("ERRO, O VALOR DO SAQUE DEVE SER MAIOR QUE 0");
            System.exit(0);
        }

        BigDecimal valorDisponivel = new BigDecimal("0");
        BigDecimal valorTroco = new BigDecimal("0");

            /*BigDecimal[] disponivel = {BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1),BigDecimal.valueOf(1)};
            BigDecimal[] cedulas = {BigDecimal.valueOf(200), BigDecimal.valueOf(100), BigDecimal.valueOf(50), BigDecimal.valueOf(20), BigDecimal.valueOf(10), BigDecimal.valueOf(5), BigDecimal.valueOf(2), BigDecimal.valueOf(1), BigDecimal.valueOf(0.50), BigDecimal.valueOf(0.25), BigDecimal.valueOf(0.10), BigDecimal.valueOf(0.05), BigDecimal.valueOf(0.01)};
             */

        Map<BigDecimal, BigDecimal>dinheiro = new LinkedHashMap<>();

        dinheiro.put (BigDecimal.valueOf(200), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(100), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(50), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(20), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(10), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(5), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(2), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(1), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(0.5), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(0.25), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(0.10), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(0.05), BigDecimal.valueOf(1));
        dinheiro.put (BigDecimal.valueOf(0.01), BigDecimal.valueOf(1));

            for (Map.Entry<BigDecimal, BigDecimal> entry : dinheiro.entrySet()){
                valorDisponivel = valorDisponivel.add(entry.getKey().multiply(entry.getValue()));
                if (valorSaque.compareTo(entry.getKey())>=0){
                    valorTroco = valorTroco.add(entry.getKey().multiply(entry.getValue()));
                }
            }
            if (valorSaque.compareTo(valorDisponivel)>0) {
                System.out.println("ERRO, VALOR DO SAQUE MAIOR QUE VALOR DISPONIVEL");
                System.exit(0);
            } else if (valorSaque.compareTo(valorTroco)>0) {
                System.out.println("ERRO,VALOR DO SAQUE MAIOR QUE VALOR PARA TROCO");
                System.exit(0);
            }


            for (Map.Entry<BigDecimal, BigDecimal> entry : dinheiro.entrySet()) {
                if ( entry.getValue().compareTo(BigDecimal.valueOf(0))==0)continue;

                BigDecimal quantidade = valorSaque.divide(entry.getKey(), 0, RoundingMode.DOWN);
                if (quantidade.compareTo(BigDecimal.valueOf(0))>0) {
                    if (quantidade.compareTo(entry.getValue())>0) {
                        quantidade = quantidade.subtract( quantidade.subtract(entry.getValue()));
                    }
                    valorSaque = valorSaque.subtract(quantidade.multiply(entry.getKey()));
                    if (entry.getKey().compareTo(BigDecimal.valueOf(2))>=0) {
                        System.out.println("CEDULAS DE " + entry.getKey()  + ": " + quantidade);
                    } else {
                        System.out.println("MOEDAS DE " + entry.getKey()  + ": " + quantidade);
                    }

                }

            }
            System.out.println("GG");


    }
}
