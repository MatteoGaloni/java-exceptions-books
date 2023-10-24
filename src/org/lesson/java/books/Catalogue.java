package org.lesson.java.books;

import java.io.File;
import java.io.IOException;

public class Catalogue {
    public static void main(String[] args) throws IOException {
        try {
            File catalogue = new File("src/org/lesson/java/books/catalogue.txt");
            System.out.println(catalogue.createNewFile());
            if (catalogue.createNewFile()){
                System.out.println("Done!!");
            } else {
                System.out.println("already exists");
            }
        } catch (IOException e){
            System.out.println("something went wrong");
        }




    }
}
