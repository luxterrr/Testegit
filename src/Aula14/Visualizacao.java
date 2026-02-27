package Aula14;

public class Visualizacao {//AGREGACAO
    private Gafanhoto espectador;
    private Video filme;

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar (int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar (float porcento){
        int tot = 0;
        if (porcento<=20){
            tot = 3;
        } else if (porcento<=50) {
            tot=5;
        } else if (porcento <= 80) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
        this.filme.setLikes(this.filme.getLikes() + 1);

    }


    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
}
