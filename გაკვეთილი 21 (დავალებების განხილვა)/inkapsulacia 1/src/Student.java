public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int studyYear;
    private double avgScore;

    public Student(String firstName, String lastName, int age, int studyYear, double avgScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studyYear = studyYear;
        this.avgScore = avgScore;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", studyYear=" + studyYear +
                ", avgScore=" + avgScore +
                '}';
    }
}
