public class University {
//    public static int year = 2004;
    public String name;
    private boolean status;
    private int schoolCount;

    public University(String name, boolean status, int schoolCount) {
        this.name = name;
        this.status = status;
        this.schoolCount = schoolCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSchoolCount() {
        return schoolCount;
    }

    public void setSchoolCount(int schoolCount) {
        this.schoolCount = schoolCount;
    }

    public void printInfo() {
        System.out.println("University name: " + this.name);
        System.out.println("University status: " + this.status);
        System.out.println("University school count: " + this.schoolCount);
    }

    public class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String id;
        private double avgGrade;
        private int year;

        public Student(
                String firstName,
                String lastName,
                int age,
                String id,
                double avgGrade,
                int year
        ) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.id = id;
            this.avgGrade = avgGrade;
            this.year = year;
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

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getAvgGrade() {
            return avgGrade;
        }

        public void setAvgGrade(double avgGrade) {
            this.avgGrade = avgGrade;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void printInfo() {
            System.out.println("Student name: " + this.firstName + " " + this.lastName);
            System.out.println("Student age: " + this.age);
            System.out.println("Student id: " + this.id);
            System.out.println("Student avg grade: " + this.avgGrade);
            System.out.println("Student year: " + this.year);
        }
    }
}
