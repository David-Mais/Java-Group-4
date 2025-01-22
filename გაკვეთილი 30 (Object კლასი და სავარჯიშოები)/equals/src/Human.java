public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        Human human = (Human) obj;
        if (this.hashCode() != human.hashCode()) {
            return false;
        }
        // ქვვედა ცუდი იდეაა
//        if (this.hashCode() == human.hashCode()) {
//            return true;
//        }
        if (this.name.equals(human.getName()) && this.age == human.getAge()) {
            return true;
        }
        return false;
    }
}
