import java.util.Comparator;

public class CarIdComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int id1 = o1.getId();
        int id2 = o2.getId();
        if (id1 == id2) {
            return 0;
        } else if (id1 > id2) {
            return 1;
        }
        return -1;
    }
}
