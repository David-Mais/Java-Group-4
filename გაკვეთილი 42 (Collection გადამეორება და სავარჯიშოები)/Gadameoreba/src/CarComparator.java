import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int firstCompare = o1.getName().compareTo(o2.getName());
        if (firstCompare == 0) {
            return Integer.compare(o1.getId(), o2.getId());
        }
        return firstCompare;
    }
}
