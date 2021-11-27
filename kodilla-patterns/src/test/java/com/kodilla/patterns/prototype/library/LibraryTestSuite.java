package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library #1");
        Book book1 = new Book("Alice in Wonderland", "L. Carrol", LocalDate.of(1999, 1, 2));
        Book book2 = new Book("Crime and Punishment", "F. M. Dostoevsky", LocalDate.of(2005, 5, 12));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        System.out.println(library);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library #2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library #3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(1, library.getBooks().size());
        assertEquals(1, clonedLibrary.getBooks().size());
        assertEquals(2, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
