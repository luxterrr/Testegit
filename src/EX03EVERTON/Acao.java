package EX03EVERTON;

public enum Acao {
    ABRIR(1), FECHAR (2), TRANSFERIR (3), SACAR (4), DEPOSITAR (5), SAIR(0);

    public Integer codigo;
        Acao(Integer codigo){
            this.codigo = codigo;
        }
    int code = this.getCodigo();
    public Integer getCodigo(){return this.codigo;}
}
