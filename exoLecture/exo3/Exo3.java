package exo3;

import java.io.*;

public class Exo3 {


    public static void main(String[] args) {
Book book = new Book("le poker pour les nuls", "Nassim Sakhri");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.ser"))){
            oos.writeObject(book);
            System.out.println("Bouquin sérialisé.");
        }catch (IOException e){
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.ser"))){
            Book student = (Book) ois.readObject();
            System.out.println("Bouquin désérialisé : " + book);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }




}
