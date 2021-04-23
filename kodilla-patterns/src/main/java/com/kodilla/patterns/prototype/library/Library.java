package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Library extends PrototypeLibrary<Library>{

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book theBook : books) {
            Book clonedBook = new Book(theBook.getTitle(), theBook.getAuthor(), theBook.getPublicationDate());
            cloneLibrary.getBooks().add(clonedBook);
        }
        return cloneLibrary;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(! (o instanceof Library))
            return false;
        Library library = (Library) o;
        return getName().equals(library.getName()) && getBooks().equals(library.getBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBooks());
    }

    @Override
    public String toString() {
        String s = "Library: " + name + "\n";
        for (Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }
}