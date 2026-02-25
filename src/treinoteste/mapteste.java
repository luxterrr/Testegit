package treinoteste;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapteste {

    public static void main(String[] args) {

        Map<String, BigDecimal>pesos = new LinkedHashMap<>();

        pesos.put("LUCAS", BigDecimal.valueOf(77.8));
        pesos.put("ANA", BigDecimal.valueOf(65.7));
        pesos.put("VITOR", BigDecimal.valueOf(80));

        pesos.put("LUCAS", BigDecimal.valueOf(68.8));

        System.out.println("PESO DE LUCAS" + pesos.get("LUCAS"));

        pesos.remove("VITOR");

        pesos.replace("ANA", BigDecimal.valueOf(65.7), BigDecimal.valueOf(63.2) );

        for (Map.Entry<String, BigDecimal> entry : pesos.entrySet()) {
            System.out.println(entry.getKey() + "TEM" + entry.getValue() + "KG");
        }
    }
}

