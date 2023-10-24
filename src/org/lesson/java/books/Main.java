package org.lesson.java.books;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many books would you manage?");
        int quantity = Integer.parseInt(scan.nextLine());

        Book[] catalogue = new Book[quantity];

        for (int i = 0; i < quantity ; i++) {
            System.out.println("Please enter book title");
            String title = scan.nextLine();

            System.out.println("Please enter number of pages");
            int nPages = Integer.parseInt(scan.nextLine());

            System.out.println("Please enter book author ");
            String author = scan.nextLine();

            System.out.println("Please enter book publisher ");
            String publisher = scan.nextLine();

            try {
                catalogue[i] = new Book(title, nPages, author, publisher);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        for (Book book : catalogue) {
            System.out.println(book);
        }



        scan.close();
    }
}
