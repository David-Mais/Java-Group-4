package exercise2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Student implements Comparable<Student> {
    private int id;
    private String firstName;
    private String lastName;
    private HashMap<String, ArrayList<Integer>> subjectScores;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap<String, ArrayList<Integer>> getSubjectScores() {
        return subjectScores;
    }

    public void setSubjectScores(HashMap<String, ArrayList<Integer>> subjectScores) {
        this.subjectScores = subjectScores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subjectScores=" + subjectScores +
                '}';
    }

    public void addScore(String subject, int score) {
        subjectScores.putIfAbsent(subject, new ArrayList<>());
        subjectScores.get(subject).add(score);
    }

    public double getOverallAverageScore() {
        int total = 0;
        int count = 0;
        for (ArrayList<Integer> scores : subjectScores.values()) {
            for (Integer score : scores) {
                total += score;
                count++;
            }
        }
        return count == 0 ? 0 : (double) total / count;
    }


    @Override
    public int compareTo(Student o) {
        double firstOverallAverage = getOverallAverageScore();
        double secondOverallAverage = o.getOverallAverageScore();
        if (firstOverallAverage > secondOverallAverage) {
            return 1;
        }  else if (firstOverallAverage == secondOverallAverage) {
            return 0;
        } else {
            return -1;
        }
    }
}
