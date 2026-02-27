package aula09guanabara;

public class Main {

    public static void main(String[] args) {
        Livro[] book = new Livro[2];
        Pessoa[] people = new Pessoa[3];
        people[0] = new Pessoa("JOTA", "HOMI", 17);
        people[1] = new Pessoa( "ANO", "MOCA", 16);

        book[0] = new Livro("vida1", "LUCAS", 100, people[0]) ;
        book[1] = new Livro("BAFOEMAMA", "PONTAPONTA", 150, people[1]);

        book[0].abrir();
        book[0].folhear(78);
        System.out.println(book[0].detalhes());




    }
}
