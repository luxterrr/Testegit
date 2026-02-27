package Aula14;

import java.math.BigDecimal;

public class Video implements AcoesVideo{
    private String titulo;
    private int views;
    private int likes;
    private boolean reproduzindo;
    private int avaliacao;

    public Video(String titulo) {//construtor
        this.titulo = titulo;
        this.avaliacao = 1;
        this.reproduzindo = false;
        this.views = 0;
        this.likes= 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.likes++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", views=" + views +
                ", likes=" + likes +
                ", reproduzindo=" + reproduzindo +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
