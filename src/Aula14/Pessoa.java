package Aula14;

public abstract class Pessoa {
    protected String nome;
    protected String sexo;
    protected int idade;
    protected int exp;

    public Pessoa(String nome, String sexo, int idade) {//construtor
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.exp = 0;
    }

    protected void ganharExp(){
        this.exp ++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", exp=" + exp +
                '}';
    }
}
