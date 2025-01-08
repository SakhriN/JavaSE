package exo3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Book> bibliothequeDeLivre;

    public Bibliotheque() {
        bibliothequeDeLivre = new ArrayList<Book>();
    }

    public void add(Book book) {
        bibliothequeDeLivre.add(book);
    }

    public void remove(String name) {
        for (Book book : bibliothequeDeLivre) {
            if (book.getTitle().equals(name)) {
                bibliothequeDeLivre.remove(book);
            }
        }
    }


    @Override
    public String toString() {
        return "Bibliotheque : " +
                "bibliothequeDeLivre : \n" + bibliothequeDeLivre;
    }
}
