package books;

public class Book {
    private String title;
    private int pages;
    private String author;
    private boolean isHardcover;

    public Book(String title, int pages, String author, boolean isHardcover) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.isHardcover = isHardcover;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isHardcover() {
        return isHardcover;
    }

    public void setHardcover(boolean hardcover) {
        isHardcover = hardcover;
    }

    public void read() {
        System.out.println(
                "მე ვკითუხლობ წიგნს: " + title
        );
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", isHardcover=" + isHardcover +
                '}';
    }
}
