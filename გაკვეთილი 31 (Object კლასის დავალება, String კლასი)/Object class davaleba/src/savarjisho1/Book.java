package savarjisho1;

import java.util.Objects;

public class Book {
    private String title;
    private int pages;
    private String genre;
    private Writer author;

    public Book(String title, int pages, String genre, Writer author) {
        this.title = title;
        this.pages = pages;
        this.genre = genre;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Writer getAuthor() {
        return author;
    }

    public void setAuthor(Writer author) {
        this.author = author;
    }

    @Override
    public int hashCode() {
        return title.hashCode() +
                pages +
                genre.hashCode() +
                author.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return
                getPages() == book.getPages() &&
                        Objects.equals(getTitle(), book.getTitle()) &&
                        Objects.equals(getGenre(), book.getGenre()) &&
                        Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                ", author=" + author +
                '}';
    }
}
