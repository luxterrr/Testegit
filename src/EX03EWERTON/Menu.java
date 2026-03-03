package EX03EWERTON;

import java.util.Scanner;

public class Menu {
    static Scanner opc = new Scanner(System.in);
    static public void abrirMenu (){
        System.out.println("---MENU---");
        System.out.println("[1]ABRIR        [2]FECHAR       [3]TRANSFERENCIA");
        System.out.println("[4]SACAR        [5]DEPOSITAR    [6]LISTAR CONTAS");
        System.out.println("[0] SAIR");
        System.out.println("DIGITE A ACAO DESEJADA: ");
        if (opc.hasNextInt()){
            int opcao = opc.nextInt();
            try {
                switch (opcao) {
                }
        }

        }
}
