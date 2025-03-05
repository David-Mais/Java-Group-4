package savarjisho5;

import java.util.Comparator;

public class StudentIdDescendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        return o2.getLastName().compareTo(o1.getLastName());
//    }
}
