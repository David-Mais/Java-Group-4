import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDao ud = new UserDaoImpl();

        User u = new User(-1, "Davit", "Maisuradze");
//        ud.createUser(u);

        List<User> users = ud.findAll();
//        users.forEach(System.out::println);

//        System.out.println(ud.findById(9));
//        User david = ud.findById(1);
//        david.setLastName("ყიფშიძე");
//        david.setFirstName("დავით");
//        ud.updateUser(david);

        ud.deleteUser(1);
    }
}
