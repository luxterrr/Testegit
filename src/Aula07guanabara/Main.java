package Aula07guanabara;

public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[1] = new Lutador("lucas", "BRASIL", 177, 68, 11,2,0,27 );
        l[2] = new Lutador("joao", "brasil", 177, 69, 10,1,0,18);
        l[3] = new Lutador("PAPO", "UZUBESQUITAO", 177, 73, 9,0,0,29);
        l[4] = new Lutador("tomyle", "ABABA", 177, 73, 10,0,0,20);

        Luta UFC1 = new Luta();

        UFC1.marcarLuta(l[3],l[1]);
        UFC1.lutar();
        }
}

