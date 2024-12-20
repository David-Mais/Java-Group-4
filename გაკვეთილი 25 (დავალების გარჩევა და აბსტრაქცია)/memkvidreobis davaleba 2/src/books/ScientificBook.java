package books;

public class ScientificBook extends Book{
    private String field;

    public ScientificBook(String title, int pages, String author, boolean isHardcover, String field) {
        super(title, pages, author, isHardcover);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
