public class Book {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    Book(String title) {
        this.title = title;
        pages = 0;
    }

    Book(int pages) {
        this.pages = pages;
        this.title = "უცნობი";
    }

    Book() {
        this.title = "უცნობი";
        this.pages = 0;
    }

    // შემოსდის რიცხვი და გვერდებს ზრდის ამ რიცხვით
    // addPages
    void addPages(int additionalPages) {
        pages += additionalPages;
    }
}
