package savarjisho5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Savarjisho5 {
    public static void main(String[] args) {
        ArrayList<Student> students = getStudents(10000);
//        Collections.sort(students);
        Collections.sort(students, new StudentIdDescendingComparator());
        students.forEach(System.out::println);

    }

    static ArrayList<Student> getStudents(int count) {
        String[] firstNames = {
                "დავით",
                "ანდრია",
                "გიორგი",
                "ირაკლი",
                "რატი",
                "თაზო",
                "ავთო"
        };
        String[] lastNames = {
                "მაისურაძე",
                "დემურია",
                "ჯაღიაშვილი",
                "ჩქარეული",
                "წულუკიძე",
                "ზენაიშვილი",
                "რატიანი"
        };
        Random rand = new Random();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int id = rand.nextInt(10_000) + 1;
            String firstName = firstNames[rand.nextInt(firstNames.length)];
            String lastName = lastNames[rand.nextInt(lastNames.length)];
            students.add(new Student(id, firstName, lastName));
        }
        return students;
    }
}
