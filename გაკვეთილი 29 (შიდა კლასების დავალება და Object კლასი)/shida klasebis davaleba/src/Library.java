public class Library {
    private String id;
    private String name;

    public Library(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Library id: " + id + " name: " + name);
    }

    public void createBook() {
        class Book {
            private String bookId;
            private String bookName;

            public Book(String bookId, String bookName) {
                this.bookId = bookId;
                this.bookName = bookName;
            }

            public String getBookId() {
                return bookId;
            }

            public void setBookId(String bookId) {
                this.bookId = bookId;
            }

            public String getBookName() {
                return bookName;
            }

            public void setBookName(String bookName) {
                this.bookName = bookName;
            }

            public void printInfo() {
                System.out.println("Book id: " + bookId + " name: " + bookName);
            }
        }

        Book book = new Book("book1", "book2");
        book.printInfo();
    }
}
