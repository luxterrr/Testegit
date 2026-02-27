package Aula14;

public class Gafanhoto extends Pessoa{
    private int totalAssistido;
    private String login;

    public Gafanhoto(String nome, String sexo, int idade, String login) {//construtor
        super(nome, sexo, idade);
        this.totalAssistido = 0;
        this.login = login;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "totalAssistido=" + totalAssistido +
                ", login='" + login + '\'' +
                super.toString();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }
    //public void maisUm(){this.views++;}
}
