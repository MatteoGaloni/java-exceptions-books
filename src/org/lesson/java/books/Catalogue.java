package org.lesson.java.books;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Catalogue {
    public static void writeBooks(Book[] books) throws IOException {
        FileWriter catalogue = null;

        try {
            catalogue = new FileWriter("src/org/lesson/java/books/catalogue.txt",true);
            for (Book book : books){
                catalogue.write(book.toString());
                catalogue.write(System.lineSeparator());
            }
            System.out.println("Success");

        } catch (IOException e) {
            System.out.println("something went wrong");;
        } finally {
            if (catalogue != null) {
                catalogue.close();
            }
        }

    }

    public static void readBooks() {
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File("src/org/lesson/java/books/catalogue.txt"));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File not found");
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }




//        try {
//            File catalogue = new File("src/org/lesson/java/books/catalogue.txt");
//            System.out.println(catalogue.createNewFile());
//            if (catalogue.createNewFile()){
//                System.out.println("Done!!");
//            } else {
//                System.out.println("already exists");
//            }
//        } catch (IOException e){
//            System.out.println("something went wrong");
//        }




    }
