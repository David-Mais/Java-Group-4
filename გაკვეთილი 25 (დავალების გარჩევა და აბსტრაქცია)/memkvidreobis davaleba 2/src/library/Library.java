package library;

import books.Book;
import employees.LibraryEmployee;

public class Library {
    private String libraryName;
    private LibraryEmployee[] employees;
    private Book[] books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public LibraryEmployee[] getEmployees() {
        return employees;
    }

    public void setEmployees(LibraryEmployee[] employees) {
        this.employees = employees;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
