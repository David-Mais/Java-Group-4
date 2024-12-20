package books;

public class FantasyBook extends Book{
    private String country;

    public FantasyBook(String title, int pages, String author, boolean isHardcover, String country) {
        super(title, pages, author, isHardcover);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
