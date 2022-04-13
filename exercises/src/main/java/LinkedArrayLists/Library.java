package LinkedArrayLists;

import java.util.LinkedList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        List<BooksLinkedList> books = new LinkedList<>();
        books.add(new BooksLinkedList("Title1", 2000));
        books.add(new BooksLinkedList("Title2", 1998));
        books.add(new BooksLinkedList("Title3", 1997));


        for (BooksLinkedList book : books) {
            if(book.getPublicationYear() >=2000) {
                System.out.println(book.getTitle() + ", " + book.getPublicationYear());
            }
        }
    }
}