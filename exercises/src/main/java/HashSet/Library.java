package HashSet;

import java.util.HashSet;

public class Library {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book("Title1", "Author1", 1999));
        books.add(new Book("Title2", "Author2", 2010));
        books.add(new Book("Title3", "Author3", 2008));

        for(Book bookie : books) {
            if (bookie.getYearOfPublication() < 2010) {
                System.out.println(bookie);
            }
        }
    }
}
