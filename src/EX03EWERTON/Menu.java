package EX03EWERTON;

import java.util.Scanner;

public class Menu {
    static Scanner opc = new Scanner(System.in);
    static public void abrirMenu () {
        System.out.println("---MENU---");
        System.out.println("[1]ABRIR        [2]FECHAR       [3]TRANSFERENCIA");
        System.out.println("[4]SACAR        [5]DEPOSITAR    [6]LISTAR CONTAS");
        System.out.println("[0] SAIR");
        System.out.println("DIGITE A ACAO DESEJADA: ");
        if (opc.hasNextInt()) {
            int opcao = opc.nextInt();
            try {
                switch (opcao) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        Acoes.abrirConta();
                        break;
                    case 2:
                        Acoes.fecharConta();
                        break;
                    case 3:
                        Acoes.transferir();
                        break;
                    case 4:
                        Acoes.sacar();
                        break;
                    case 5:
                        Acoes.depositar();
                        break;
                    case 6:
                        Acoes.listar();
                        break;
                }
            } catch (Exception e) {
                System.out.println("ERRO REGISTRADO, VOLTANDO AO MENU INICIAL");
            } finally {
                abrirMenu();
            }
        }

    }
}
