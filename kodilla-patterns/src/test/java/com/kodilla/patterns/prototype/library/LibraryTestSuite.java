package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("Test Prototype - Library")
public class LibraryTestSuite {

    @DisplayName("Test Clone The Library")
    @Test
    void testGetBooks() {
        //Given
        //Creating Books
        Book book1 = new Book("Java. Rusz głową! Wydanie II", "Kathy Sierra, Bert Bates", LocalDate.of(2010, 11, 19));
        Book book2 = new Book("Czysty kod. Podręcznik dobrego programisty", "Robert C. Martin", LocalDate.of(2010, 02, 19));
        Book book3 = new Book("Milczenie owiec", "Thomas Harris", LocalDate.of(1988, 05, 19));
        Book book4 = new Book("Achaja", "Andrzej Ziemiański", LocalDate.of(2002, 12, 01));
        Book book5 = new Book("Ojciec chrzestny", "Mario Puzo", LocalDate.of(1969, 03, 10));

        //Creating library
        Library library = new Library("Number 1 - Base");

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //making a shallow clone of object Library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Number 2 - Shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object Library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Number 3 - Deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        //Remove element
        library.getBooks().remove(book5);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}