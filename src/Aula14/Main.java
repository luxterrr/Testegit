package Aula14;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[1] = new Video("TESTE");
        //System.out.println(v[1].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("LUCAS", "HOMEM", 17, "lucita");

        Visualizacao view = new Visualizacao(g[0],v[1]);
        System.out.println(view.toString());
    }
}
