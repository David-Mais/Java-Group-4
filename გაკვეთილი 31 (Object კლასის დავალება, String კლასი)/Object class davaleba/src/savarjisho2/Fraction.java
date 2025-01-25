package savarjisho2;

public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        double result1 = numerator / denominator;
        double result2 = fraction.getNumerator() / fraction.getDenominator();
        return result1 == result2;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
