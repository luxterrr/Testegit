package EXERCICIO01;

import java.util.ArrayList;
import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        System.out.print("VALOR A SACAR: R$ ");
        Scanner resposta = new Scanner(System.in);
        float valor = resposta.nextFloat();
        resposta.close();

        System.out.printf("VALOR: %.2f " , valor);
        System.out.println("");
        /*int cedula100;
        int cedula200;
        int cedula50;
        int cedula20;
        int cedula10;
        int cedula5;
        int cedula2;
        int moeda1;
        int moeda50;
        int moeda25;
        int moeda10;
        int moeda05;
        int moeda01;

         */
        double [] numeros = {200, 100, 50, 20, 10, 5, 2 , 1, 0.5, 0.25, 0.10, 0.05, 0.01 };

        for (int contador = 0; contador < 13; contador ++ ) {
            int cedulas =  (int) ( valor / numeros[contador] );
            if (cedulas>=1) {
                valor -= cedulas * numeros[contador];
                if (contador > 7) {
                    System.out.println("MOEDAS DE " + numeros[contador] + ": " + cedulas);
                } else {
                    System.out.println("CEDULAS DE " + numeros[contador] + ": " + cedulas);
                }

            }
            cedulas = 0;

        }
        System.out.println("GG");


    }
}
