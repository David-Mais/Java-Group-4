package employees;

import books.Book;
import library.Library;

import java.util.Random;

public class BookRecommender extends LibraryEmployee{
    private double rating;
    private Library workingLibrary;

    public BookRecommender(String firstName, String lastName, int id, double rating) {
        super(firstName, lastName, id);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Library getWorkingLibrary() {
        return workingLibrary;
    }

    public void setWorkingLibrary(Library workingLibrary) {
        this.workingLibrary = workingLibrary;
    }

    public Book recommendBook() {
        Random random = new Random();
        int index = random.nextInt(workingLibrary.getBooks().length);
        return workingLibrary.getBooks()[index];
    }
}
