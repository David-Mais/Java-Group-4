package library;

import org.w3c.dom.ls.LSOutput;

// cmd + n mac-ზე
// alt + insert windows-ზე
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void printInfo() {
        System.out.println("ავტორი: " + author);
        System.out.println("სათაური: " + title);
        System.out.println();
    }
}
