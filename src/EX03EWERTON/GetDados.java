package EX03EWERTON;

import java.util.Objects;
import java.util.Optional;

public class GetDados {

    public static int getInfo() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("NUMERO DA CONTA: ");
        String getConta = sc.next();
        System.out.print("NUMERO DA AGENCIA: ");
        String getAgencia = sc.next();

        Optional<ContaBancaria> conta = ContaBancaria.listaContas.stream()
                .filter(contaBancaria -> Objects.equals(contaBancaria.getAgencia(), getAgencia) &&
                        Objects.equals(contaBancaria.getNumeroConta(), getConta))
                .findFirst();

        if (conta.isPresent()) {
            System.out.println("CONTA ENCONTRADA");
            return ContaBancaria.listaContas.indexOf(conta.get());
        } else {
            System.out.println("CONTA INEXISTENTE");
            return -1;
        }
    }
}
