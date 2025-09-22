// Write your C++ code here
import java.util.*;
class Book{
    String title;
    String author;
    
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}
class Library{
    String name;
    List<Book> books;

    Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }
    // adding books 
    void addBook(Book book){
        books.add(book);
    }

    // shallow copy 
    Library shallowClone(){
        Library newLibrary = new Library(this.name);
        newLibrary.books = this.books;
        return newLibrary;
    }

    // deep copy 
    Library deepClone(){
        Library newLibrary = new Library(this.name);
        for(Book book : books){
            newLibrary.addBook(new Book(book.title, book.author));
        }
        return newLibrary;
    }

    void display(){
        System.out.println("Library : " + name);
        for (Book book : books) {
            System.out.println("Book : " + book.title + ", Author : " + book.author);
        }
    }
}
