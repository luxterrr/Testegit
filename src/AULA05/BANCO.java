package AULA05;

public class BANCO {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.setDono("LUCAS");
        p1.setTipo("CC");
        p1.setStatus(true);
        p1.abrirConta();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222221);


        p1.depositar(100);

        p1.statusAtual();
        p2.statusAtual();


    }
}

class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta () {
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo == "CC") {
            this.setSaldo(50);
        }else if (tipo == "CP"){
            this.setSaldo(150);
        }
        System.out.println("CONTA ABERTADA");
    }

    public void statusAtual() {
        System.out.println("-------------------------");
        System.out.println("CONTA: " + this.getNumConta());
        System.out.println("TIPO: " + this.getTipo());
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("DONO: " + this.getDono());
        System.out.println("ABERTA: " + this.getStatus());
    }
    public void fecharConta () {

        if (this.getSaldo() > 0) {
            System.out.println("ERRO, CONTA COM DINHEIRO");
        }else if (this.getSaldo()<0){
            System.out.println("ERRO, CONTA NEGATIVA");
        } else {
            this.setStatus(false);
            System.out.println("CONTA FECHADA");
        }

    }

    public void sacar (float valor) {
        if ( this.getStatus ()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("SAQUE REALIZADO");
            } else {
                System.out.println("SALDO INSUFICIENTE");
            }

        } else {
            System.out.println("ERRO, CONTA FECHADA");
        }
    }

    public void depositar (float valor ) {
        if (this.getStatus() ) {
            this.setSaldo( this.getSaldo() + valor);
            System.out.println("DEPOSITO REALIZADO");
        } else {
            System.out.println( "ERRO, CONTA FECHADA");
        }
    }

    public void pagarMensal (float valor ) {
        if (tipo == "CC") {
            valor = 12;
        } else if (tipo == "CP") {
            valor = 20;
        }
        if (this.getStatus() ) {
            if (this.getSaldo() > valor ) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("PAGAMENTO REALIZADO");;
            } else {
                System.out.println("SALDO INSUFICIENTE");
            }
        }else {
            System.out.println("ERRO");
        }

    }

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
