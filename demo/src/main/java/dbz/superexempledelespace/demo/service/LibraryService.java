package dbz.superexempledelespace.demo.service;

import dbz.superexempledelespace.demo.entity.Book;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
List<Book> bouquins = new ArrayList<Book>();
    public Book makeBook(String titre,LocalDate datePublication,String auteur, String categorie, double prix,boolean prixNobel){
        Book book = new Book(titre,datePublication,auteur,categorie,prix,prixNobel);
        bouquins.add(book);
        return book;
    }

    public void deleteBook(String titre){
        for (Book book : bouquins) {
            if (book.getTitre().equals(titre)) {
                bouquins.remove(book);
            }
        }
    }

    public List<Book> getBooks(){
        return bouquins;
    }



}
