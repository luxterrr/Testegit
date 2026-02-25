package EXERCICIO01;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        System.out.print("VALOR A SACAR: R$ ");
        Scanner resposta = new Scanner(System.in);
        float valor = resposta.nextFloat();
        resposta.close();

        System.out.printf("VALOR: %.2f " , valor);
        System.out.println("");
        valor *= 100;

        int [] numeros = {20000, 10000, 5000, 2000, 1000, 500, 200 , 100, 50, 25, 10, 5, 1 };

        for (int contador = 0; contador < numeros.length && valor > 0 ; contador ++ ) {

            int cedulas = (int) ( valor / numeros[contador] );
            if (cedulas >= 1) {
                valor -= cedulas * numeros[contador];
                if (numeros[contador] >= 200 ) {
                    System.out.println("CEDULAS DE " + numeros[contador] / 100  + ": " + cedulas);
                } else {
                    System.out.println("MOEDAS DE " + numeros[contador] / 100.0  + ": " + cedulas);
                }

            }

        }
        System.out.println("GG");


    }
}
