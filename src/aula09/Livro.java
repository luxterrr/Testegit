package aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPag;
    private int atualPag;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totalPag=" + totalPag +
                ", atualPag=" + atualPag +
                ", aberto=" + aberto +
                ", leitor=" + leitor.getNome()+ ",sexo=" +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.atualPag = p;
    }

    @Override
    public void avancarPag() {
        this.atualPag++;
    }

    @Override
    public void voltarPag() {
        this.atualPag--;
    }
}
