package org.lesson.java.books;

public class Book {
    //ATTRIBUTES
    String title;
    int nPages;
    String author;
    
    String publisher;
    
    //  CONSTRUCTORS
    public Book(String title, int nPages, String author, String publisher) throws IllegalArgumentException {


        validateString(title, "title");
        validateNumber(nPages, "nPages");
        validateString(author, "author");
        validateString(publisher, "publisher");

        this.title = title;
        this.nPages = nPages;
        this.author = author;
        this.publisher = publisher;

    }

    //VALIDATION

//    metodo generico per la validazione refactor
    private void validateString(String input, String inputName) throws IllegalArgumentException {
        if (input == null || input.isBlank()){
            throw new IllegalArgumentException("The " + inputName + " is mandatory (blank or null)");
        }
    }

    private void validateNumber(int input, String inputName) throws IllegalArgumentException {
        if (input <= 0){
            throw new IllegalArgumentException("The " + inputName + " is invalid (<= 0)");
        }
    }

    // metodi usati nei setter, potrei usare i metodi generici sopra

    public void validateTitle() throws IllegalArgumentException {
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("The title is mandatory");
        }
    }

    public void validatenPages() throws IllegalArgumentException {
        if (nPages <= 0){
            throw new IllegalArgumentException("Insert a number greater than 0");
        }
    }

    public void validateAuthor() throws IllegalArgumentException {
        if (author == null || author.trim().isEmpty()){
            throw new IllegalArgumentException("The author is mandatory");
        }
    }

    public void validatePublisher() throws IllegalArgumentException{
        if (publisher == null || publisher.trim().isEmpty()){
            throw new IllegalArgumentException("The publisher is mandatory");
        }
    }
    
    // METHODS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        validateTitle();
    }

    public int getnPages() {
        return nPages;
    }

    public void setnPages(int nPages) {
        this.nPages = nPages;
        validatenPages();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        validateAuthor();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
        validatePublisher();
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", nPages=" + nPages +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'';
    }
}
