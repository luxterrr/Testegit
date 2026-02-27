package EX03EVERTON;

import java.util.Objects;
import java.util.Scanner;

public class Banco {
    public static ContaBancaria getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMERO DA CONTA: ");
        String getConta = sc.next();
        System.out.print("NUMERO DA AGENCIA: ");
        String getAgencia = sc.next();

        ContaBancaria conta = ContaBancaria.listaContas.stream()
                .filter(contaBancaria -> Objects.equals(contaBancaria.getAgencia(), getAgencia) && Objects.equals(contaBancaria.getNumeroConta(), getConta))
                .findFirst().orElse(null);
        if (conta != null) {
            System.out.println("CONTA ENCONTRADA");
            return conta;

        } else {
            System.out.println("CONTA INEXISTENTE");
            return conta;

        }

    }
}
