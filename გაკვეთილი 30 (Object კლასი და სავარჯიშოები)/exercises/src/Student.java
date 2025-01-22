import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return
                id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    @Override
    public String toString() {
        return "Student{\n"
                + "\tid: " + id + ",\n"
                + "\tname: " + name + ",\n"
                + "\temail: " + email + "\n"
                + "}";
    }


    public static void main(String[] args) {
        Student student = new Student(1, "John", "john@gmail.com");
        Student student2 = new Student(2, "Jane", "jane@gmail.com");
        Student student3 = new Student(1, "Davit", "Davit@gmail.com");
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student.equals(student2));
        System.out.println(student.equals(student3));
        System.out.println(student2.equals(student3));
    }
}