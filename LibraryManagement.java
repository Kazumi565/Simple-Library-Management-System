import java.util.ArrayList;

class Carte {
    private String titlu;
    private String autor;
    private String ISBN;

    public Carte(String titlu, String autor, String ISBN) {
        this.titlu = titlu;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getInfo() {
        return "Titlu: " + titlu + ", Autor: " + autor + ", ISBN: " + ISBN;
    }
}

class Biblioteca {
    private ArrayList<Carte> listaCarti;

    public Biblioteca() {
        this.listaCarti = new ArrayList<>();
    }

    public void adaugaCarte(Carte carte) {
        listaCarti.add(carte);
    }

    public void scoateCarte(Carte carte) {
        listaCarti.remove(carte);
    }

    public void afiseazaCarti() {
        for (Carte carte : listaCarti) {
            System.out.println(carte.getInfo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Carte carte1 = new Carte("Alchimistul", "Paulo Coelho", "9780061122415");
        Carte carte2 = new Carte("Pelerinajul", "Paulo Coelho", "9780061687457");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);

        System.out.println("Cărți în bibliotecă:");
        biblioteca.afiseazaCarti();

        biblioteca.scoateCarte(carte1);

        System.out.println("\nDupă eliminarea unei cărți:");
        biblioteca.afiseazaCarti();
    }
}
