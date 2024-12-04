package library;

public class Library {
    private Book[] books = new Book[3];
    private int index = 0;

    public void addBook(Book book) {
        if (index == books.length) {
            increaseBooksSize();
        }
        books[index] = book;
        index++;
    }

    private void increaseBooksSize() {
        Book[] newBooks = new Book[books.length + 5];

        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        books = newBooks;
    }

    public Book[] getBooks() {
        return books;
    }

    public Book getSpecificBook(String title) {
        Book book = null;
        for (int i = 0; i < index; i++) {
            if (title.equals(books[i].getTitle())) {
                book = books[i];
            }
        }
        return book;
    }
}
