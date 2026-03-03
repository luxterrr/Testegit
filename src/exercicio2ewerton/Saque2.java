package exercicio2ewerton;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Saque2 {

    Map<BigDecimal, Integer> dinheiro = new LinkedHashMap<>();
    
    public Saque2 () {

        dinheiro.put (BigDecimal.valueOf(200), 1);
        dinheiro.put (BigDecimal.valueOf(100), 1);
        dinheiro.put (BigDecimal.valueOf(50), 1);
        dinheiro.put (BigDecimal.valueOf(20), 1);
        dinheiro.put (BigDecimal.valueOf(10), 1);
        dinheiro.put (BigDecimal.valueOf(5), 1);
        dinheiro.put (BigDecimal.valueOf(2), 1);
        dinheiro.put (BigDecimal.valueOf(1), 1);
        dinheiro.put (BigDecimal.valueOf(0.5), 1);
        dinheiro.put (BigDecimal.valueOf(0.25), 1);
        dinheiro.put (BigDecimal.valueOf(0.10), 1);
        dinheiro.put (BigDecimal.valueOf(0.05), 1);
        dinheiro.put (BigDecimal.valueOf(0.01), 1);
    }

    public void sacar() {
        BigDecimal valorSaque = ScannerValor.scanear();
        if (valorSaque.compareTo(BigDecimal.valueOf(0)) <= 0) {
            System.out.println("ERRO, O VALOR DO SAQUE DEVE SER MAIOR QUE 0");

        }
        Map<BigDecimal, Integer>cedulasSaque = calcular(valorSaque);
        exibirCedulas(cedulasSaque);
    }

    public Map<BigDecimal, Integer> calcular(BigDecimal valorSaque){
        Map<BigDecimal, Integer> cedulasSaque = new LinkedHashMap<>();
        BigDecimal valorResto = new BigDecimal(String.valueOf(valorSaque));

        for (Map.Entry<BigDecimal, Integer> entry : dinheiro.entrySet()){
            if (entry.getValue() == 0) continue;

            Integer quantidade = valorResto.divide(entry.getKey()).intValue();
            if (quantidade == 0)continue;

            if (quantidade > entry.getValue()) quantidade = entry.getValue();

            valorResto = valorResto.subtract(entry.getKey().multiply(BigDecimal.valueOf(quantidade)));
            cedulasSaque.put(entry.getKey(),quantidade);
        }
        if (valorResto.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("QUANTIDADE DE ESPECIES INSUFICIENTE PARA VALOR SAQUE");
            return new LinkedHashMap<>();
        }
        return cedulasSaque;
    }

    public void exibirCedulas(Map<BigDecimal, Integer> cedulasSaque) {
        for (Map.Entry<BigDecimal,Integer> cedula: cedulasSaque.entrySet()) {
            System.out.println(cedula.getValue() + "CEDULA/MOEDA DE " + cedula.getKey());
        }
    }
}
