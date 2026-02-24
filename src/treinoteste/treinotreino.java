package treinoteste;


import java.util.ArrayList;

public class treinotreino {
    public static void main(String[] args){

        int [] numeros = {10, 20, 30, 40};
        System.out.println( numeros [0]);

        for ( int num : numeros ) {
            System.out.println(num);
        }

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("LUCAS");
        nomes.add("ANA");
        nomes.add("AAAAA");

        System.out.println(nomes.get(1));

        //nomes.remove(0);

        //System.out.println(nomes.get(0));

        String[] nomestal = new String[5];

        nomestal[0]="LUCAS";
        nomestal[3]="Ana";

        /*for ( String nomi : nomestal ){
            System.out.println(nomi);
        }

         */
        for ( int contador = 0; contador < nomestal.length; contador++){
            System.out.println(nomestal[contador]);
        }

        //CONVERSAO DE VARIAVEL

        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDoble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuInt2);






    }
}


