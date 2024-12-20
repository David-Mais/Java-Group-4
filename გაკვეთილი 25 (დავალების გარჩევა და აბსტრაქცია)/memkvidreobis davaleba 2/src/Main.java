import books.Book;
import employees.BookRecommender;
import employees.LibraryEmployee;
import library.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("sajaro biblioteka");

        BookRecommender recommender = new BookRecommender(
                "",
                "",
                1234,
                2.4
        );
        recommender.setWorkingLibrary(library);

        Book book1 = new Book("book1", 123, "author1", false);
        Book book2 = new Book("book2", 111, "author2", true);
        Book book3 = new Book("book3", 473, "author3", false);
        Book book4 = new Book("book4", 757, "author4", true);
        Book book5 = new Book("book5", 999, "author5", true);

        LibraryEmployee[] employees = {recommender};
        Book[] books = {book1, book2, book3, book4, book5};

        library.setBooks(books);
        library.setEmployees(employees);

        Book recommendedBook = recommender.recommendBook();
        Book recommendedBook1 = recommender.recommendBook();
        Book recommendedBook2 = recommender.recommendBook();
        Book recommendedBook3 = recommender.recommendBook();


        System.out.println(recommendedBook);
        System.out.println(recommendedBook1);
        System.out.println(recommendedBook2);
        System.out.println(recommendedBook3);
    }
}