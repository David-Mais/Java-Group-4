package employees;

public class SilencePatrol extends LibraryEmployee{
    private double strictness;

    public SilencePatrol(String firstName, String lastName, int id, double strictness) {
        super(firstName, lastName, id);
        this.strictness = strictness;
    }

    public double getStrictness() {
        return strictness;
    }

    public void setStrictness(double strictness) {
        this.strictness = strictness;
    }
}
