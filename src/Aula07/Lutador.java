package Aula07;

public class Lutador {
    private String nome;
    private String nacao;
    private String categoria;
    private float altura;
    private float peso;
    private int vitorias, derrota, empates;
    private int idade;

    public void apresentar() {
        System.out.println("LUTADOR: " + getNome());
        System.out.println("ORIGEM: " + getNacao());
        System.out.println("IDADE: " + getIdade());
        System.out.println("ALTURA:" + getAltura());
        System.out.println("PESO: " + getPeso() );
        System.out.println("VITORIAS: " + getVitorias());
        System.out.println("EMPATES: " + getEmpates());
        System.out.println("DERROTAS: " + getDerrota());
    }

    public void status() {
        System.out.println(this.getNome());
        System.out.println("CATEGORIA: " + getCategoria());
        System.out.println(getVitorias() + "W");
        System.out.println(getEmpates() + "D");
        System.out.println(getDerrota() + "L");
    }

    public void ganharluta() {
        this.setVitorias(this.getVitorias()+1);
    }

    public void perderluta() {
        this.setDerrota(this.getDerrota()+1);
    }

    public void empatarluta() {
        this.setEmpates(this.getEmpates()+1);
    }

    public Lutador(String nome, String nacao, float altura, float peso, int vitorias, int derrota, int empates, int idade) {
        this.nome = nome;
        this.nacao = nacao;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrota = derrota;
        this.empates = empates;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacao() {
        return nacao;
    }

    public void setNacao(String nacao) {
        this.nacao = nacao;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso<52.2){
            categoria = "INVALIDA";
        } else if (peso<=70.3) {
            categoria = "LEVE";
        } else if (peso<=83.9) {
            categoria = "MEDIA";
        } else if (peso<=120.2) {
            categoria = "PESADO";
        } else{
            categoria = "INVALIDA";
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

